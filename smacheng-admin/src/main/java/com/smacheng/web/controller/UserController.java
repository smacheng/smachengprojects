/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacheng.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smacheng.domain.Comments;
import com.smacheng.domain.Member;
import com.smacheng.domain.MemberInfomation;
import com.smacheng.service.CommentsService;
import com.smacheng.service.MemberInfomationService;
import com.smacheng.service.MemberService;

/**
 * 主要用于别人查看 该用户资料
 *
 * @author Administrator
 * @date 2015-12-30 16:11:32
 * @version V1.0
 */
@Controller("userController")
@RequestMapping("/user")
public class UserController {

    Logger logger = LoggerFactory.getLogger(WallpaperController.class);

    @Resource(name = "memberServiceImpl")
    private MemberService memberService;

    @Resource
    private MemberInfomationService memberInfomationService;

    @Resource
    private CommentsService commentsService;

    /**
     * 显示用户主页
     *
     * @param username
     * @param model
     * @return
     */
    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String user(@PathVariable("username") String username, Model model) {
        Member member = memberService.findByUsername(username);
        MemberInfomation memberInfomation = memberInfomationService.findByMember(member);

        List<Comments> userComments = commentsService.findByUserId(member.getId());

        model.addAttribute("user", member);
        model.addAttribute("userInfomation", memberInfomation);

        model.addAttribute("userComments", userComments);
        
        return "/portal/user/profile";
    }
}
