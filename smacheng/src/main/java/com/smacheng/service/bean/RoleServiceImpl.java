package com.smacheng.service.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smacheng.dao.RoleDao;
import com.smacheng.domain.Role;
import com.smacheng.model.RoleModel;
import com.smacheng.model.dto.RoleDTO;
import com.smacheng.service.RoleService;

/**
 * Service - 角色
 *
 */
@Service("roleServiceImpl")
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleDao roleDao;

    @Override
    public RoleModel find(String id) {
        Role role = roleDao.findOne(id);
        return RoleDTO.getRoleModelDTO(role);
    }

    @Override
    public List<RoleModel> findAll() {
        List<Role> roles = roleDao.findAll();
        return RoleDTO.getRoleModelsDTO(roles);
    }

    @Override
    public List<Role> findList(String... ids) {
        List<Role> result = new ArrayList();
        if (ids != null) {
            for (String id : ids) {
                Role entity = roleDao.findOne(id);
                if (entity != null) {
                    result.add(entity);
                }
            }
        }
        return result;
    }

    @Override
    @Transactional
    public void save(Role role) {
        roleDao.save(role);
    }

    /**
     *
     * @param id
     * @param name
     * @param description
     * @param authorities
     */
    @Override
    @Transactional
    public void update(String id, String name, String description, String[] authorities) {
        Role role = roleDao.findOne(id);
        role.setName(name);
        role.setDescription(description);
        role.setAuthorities(new ArrayList(Arrays.asList(authorities)));
    }

}
