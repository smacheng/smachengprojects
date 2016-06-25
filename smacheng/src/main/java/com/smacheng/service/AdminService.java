package com.smacheng.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.smacheng.domain.Admin;
import com.smacheng.model.AdminModel;

/**
 * Service - 管理员
 */
public interface AdminService {

    public AdminModel findById(String id);

    public void save(Admin admin);

    /**
     * 修改管理员信息
     *
     * @param id
     * @param email
     * @param name
     * @param department
     * @param isEnabled
     * @param roles
     * @return
     */
    public Admin update(String id, String email, String name, String department, boolean isEnabled, String[] roles);

    /**
     * *spring data jpa 分页查询
     *
     * @param pageable
     * @return
     */
    public Page<AdminModel> find(Pageable pageable);

    /**
     * 根据用户名模糊查找
     *
     * @param username
     * @param pageable
     * @return
     */
    public Page<AdminModel> findByUsernameLike(String username, Pageable pageable);

    /**
     * 判断用户名是否存在
     *
     * @param username 用户名(忽略大小写)
     * @return 用户名是否存在
     */
    boolean usernameExists(String username);

    /**
     * 根据用户名查找管理员
     *
     * @param username 用户名(忽略大小写)
     * @return 管理员，若不存在则返回null
     */
    Admin findByUsername(String username);

    /**
     * 根据ID查找权限
     *
     * @param id ID
     * @return 权限,若不存在则返回null
     */
    List<String> findAuthorities(String id);

    /**
     * 判断管理员是否登录
     *
     * @return 管理员是否登录
     */
    boolean isAuthenticated();

    /**
     * 获取当前登录管理员
     *
     * @return 当前登录管理员,若不存在则返回null
     */
    Admin getCurrent();

    /**
     * 获取当前登录用户名
     *
     * @return 当前登录用户名,若不存在则返回null
     */
    String getCurrentUsername();

    public void resetPassword(String id);
}
