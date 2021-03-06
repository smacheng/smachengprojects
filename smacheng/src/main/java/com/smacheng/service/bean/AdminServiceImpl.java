package com.smacheng.service.bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smacheng.commons.enums.EmailType;
import com.smacheng.dao.AdminDao;
import com.smacheng.domain.Admin;
import com.smacheng.domain.Role;
import com.smacheng.exception.AdminNotFound;
import com.smacheng.model.AdminModel;
import com.smacheng.model.dto.AdminDTO;
import com.smacheng.security.shiro.Principal;
import com.smacheng.security.utils.SecurityPasswordLevel;
import com.smacheng.security.utils.SecurityPasswordUtils;
import com.smacheng.service.AdminService;
import com.smacheng.service.EmailService;
import com.smacheng.service.RoleService;

/**
 * Service - 管理员
 *
 *
 *
 */
@Service("adminServiceImpl")
public class AdminServiceImpl implements AdminService {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private AdminDao adminDao;

    @Resource
    private EmailService emailService;

    @Resource(name = "roleServiceImpl")
    private RoleService roleService;

    @Override
    @Transactional(readOnly = true)
    public AdminModel findById(String id) {
        Admin admin = adminDao.findOne(id);
        return AdminDTO.getAdminModelDTO(admin);
    }

    @Transactional
    @Override
    public void save(Admin admin) {
        adminDao.save(admin);
    }

    @Transactional(rollbackFor = AdminNotFound.class)
    @Override
    public Admin update(String id, String email, String name, String department, boolean isEnabled, String[] roles) {
        Admin admin = adminDao.findOne(id);

        admin.setEmail(email);
        admin.setName(name);
        admin.setDepartment(department);
        admin.setIsEnabled(isEnabled);
        admin.setRoles(new HashSet(roleService.findList(roles)));

        return admin;
    }

    @Transactional(readOnly = true)
    @Override
    public boolean usernameExists(String username) {
        return adminDao.usernameExists(username) > 0;
    }

    @Transactional(readOnly = true)
    @Override
    public Admin findByUsername(String username) {
        return adminDao.findByUsername(username);
    }

    @Transactional(readOnly = true)
    @Override
    public List<String> findAuthorities(String id) {
        List<String> authorities = new ArrayList<>();
        Admin admin = adminDao.findOne(id);
        if (admin != null) {
            for (Role role : admin.getRoles()) {
                authorities.addAll(role.getAuthorities());
            }
        }
        return authorities;
    }

    @Transactional(readOnly = true)
    @Override
    public boolean isAuthenticated() {
        Subject subject = SecurityUtils.getSubject();
        if (subject != null) {
            return subject.isAuthenticated();
        }
        return false;
    }

    @Transactional(readOnly = true)
    @Override
    public Admin getCurrent() {
        Subject subject = SecurityUtils.getSubject();
        if (subject != null) {
            Principal principal = (Principal) subject.getPrincipal();
            if (principal != null) {
                return adminDao.findOne(principal.getId());
            }
        }
        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public String getCurrentUsername() {
        Subject subject = SecurityUtils.getSubject();
        if (subject != null) {
            Principal principal = (Principal) subject.getPrincipal();
            if (principal != null) {
                return principal.getUsername();
            }
        }
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<AdminModel> find(Pageable pageable) {
        Page<Admin> page = adminDao.findAll(pageable);
        List<Admin> admins = page.getContent();
        List<AdminModel> models = AdminDTO.getAdminModeslDTO(admins);
        Page<AdminModel> result = new PageImpl(models, pageable, page.getTotalElements());
        return result;
    }

    @Override
    public Page<AdminModel> findByUsernameLike(String username, Pageable pageable) {
        Page<Admin> page = adminDao.findByUsernameLike("%"+username+"%", pageable);
        List<Admin> admins = page.getContent();
        List<AdminModel> models = AdminDTO.getAdminModeslDTO(admins);
        Page<AdminModel> result = new PageImpl(models, pageable, page.getTotalElements());
        return result;
    }

    @Override
    @Transactional(rollbackFor = AdminNotFound.class)
    public void resetPassword(String id) {
        Admin admin = adminDao.findOne(id);
        // 先随机生成一个密码 然后发送邮件通知
        String password = SecurityPasswordUtils.randomPassword(SecurityPasswordLevel.MEDIUM);
        String passphrase = SecurityPasswordUtils.getPassphrase(admin.getSalt(), password);

        if (!StringUtils.isEmpty(admin.getEmail())) {
            admin.setPassword(passphrase);
            //发送邮件
            emailService.send(EmailType.ADMIN_RESET_PASSWORD, admin.getEmail(), "密码重置", password);
        } else {
            logger.error("重置密码失败,{}用户邮箱不存在.", id);
        }
    }

}
