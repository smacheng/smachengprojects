/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacheng.service;

import com.smacheng.domain.Member;
import com.smacheng.domain.MemberInfomation;

/**
 *
 * @author Administrator
 */
public interface MemberInfomationService {

    public MemberInfomation findByMember(Member member);

    public MemberInfomation create(MemberInfomation minfo);

    public MemberInfomation update(MemberInfomation minfo);
}
