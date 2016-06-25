/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacheng.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.smacheng.commons.enums.Oauth2Type;
import com.smacheng.domain.OpenAuth2;

/**
 * 第三方开放平台登录
 *
 * @author Administrator
 */
@Repository
public interface OpenAuth2Dao extends JpaRepository<OpenAuth2, String> {

//    @Query("select count(*) from Admin admin where lower(admin.username) = lower(:username)")
    public OpenAuth2 findByOauthIdAndType(@Param("oauthId") String oauthId, @Param("type") Oauth2Type type);
}
