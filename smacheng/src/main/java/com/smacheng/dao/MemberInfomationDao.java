/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacheng.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.smacheng.domain.Member;
import com.smacheng.domain.MemberInfomation;

/**
 * 会员的附件信息
 * @author Administrator
 */
@Repository
public interface MemberInfomationDao extends JpaRepository<MemberInfomation, String> {

    @Query("FROM MemberInfomation memberInfo WHERE memberInfo.member = :member")
    public MemberInfomation findByMember(@Param("member") Member member);

}
