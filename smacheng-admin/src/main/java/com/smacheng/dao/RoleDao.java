package com.smacheng.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smacheng.domain.Role;

/**
 * Dao - 角色
 *
 *
 *
 */
@Repository
public interface RoleDao extends JpaRepository<Role, String> {

}
