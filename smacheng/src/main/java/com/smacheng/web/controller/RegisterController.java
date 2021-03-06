package com.smacheng.web.controller;

import com.smacheng.domain.Member;

import com.smacheng.security.shiro.Principal;
import com.smacheng.security.utils.SecurityPasswordUtils;
import com.smacheng.service.MemberAttributeService;
import com.smacheng.service.MemberRankService;
import com.smacheng.service.MemberService;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller - 会员注册
 *
 *
 *
 */
@Controller("shopRegisterController")
@RequestMapping("/register")
public class RegisterController {

    @Resource
    private MemberService memberService;

    @Resource(name = "memberRankServiceImpl")
    private MemberRankService memberRankService;

    @Resource(name = "memberAttributeServiceImpl")
    private MemberAttributeService memberAttributeService;

    /**
     * 检查用户名是否被禁用或已存在
     */
//	@RequestMapping(value = "/check_username", method = RequestMethod.GET)
//	public @ResponseBody
//	boolean checkUsername(String username) {
//		if (StringUtils.isEmpty(username)) {
//			return false;
//		}
//		if (memberService.usernameDisabled(username) || memberService.usernameExists(username)) {
//			return false;
//		} else {
//			return true;
//		}
//	}
    /**
     * 检查E-mail是否存在
     */
    @RequestMapping(value = "/check_email", method = RequestMethod.GET)
    public @ResponseBody
    boolean checkEmail(String email) {
        if (StringUtils.isEmpty(email)) {
            return false;
        }
        if (memberService.emailExists(email)) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 注册页面
     */
    @RequestMapping(method = RequestMethod.GET)
    public String index(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        //model.addAttribute("genders", Gender.values());
        //model.addAttribute("captchaId", UUID.randomUUID().toString());
        return "/register";
    }

    /**
     * 注册提交
     * @param username
     * @param email
     * @param password
     * @param request
     * @param response
     * @param session
     * @param model
     * @return 
     */
    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String submit(String username, String email, String password, HttpServletRequest request, HttpServletResponse response, HttpSession session, ModelMap model) {
    	System.out.println("Register Controller submit");
       
    	Member member = new Member();
       
        if (memberService.emailExists(email)) {
            model.addAttribute("errorMessage", "该邮件地址已经被注册");
            return "/register";
        }
        if (memberService.usernameExists(username)) {
            model.addAttribute("errorMessage", "用户名存在");
            return "/register";
        }
        
        //密码
        String salt = SecurityPasswordUtils.getSalt();
        String passphrase = SecurityPasswordUtils.getPassphrase(salt, password);

        member.setUsername(username.toLowerCase());

        member.setSalt(salt);
        member.setPassword(passphrase);
        member.setEmail(email);
        member.setPoint(1l);

        member.setIsEnabled(true);
        member.setIsLocked(false);
        member.setLoginFailureCount(0);
        member.setLockedDate(null);
        member.setRegisterIp(request.getRemoteAddr());
        member.setLoginIp(request.getRemoteAddr());
        member.setLoginDate(new Date());
        member.setMemberRank(memberRankService.findDefault());

        memberService.create(member);

        session.setAttribute(Member.PRINCIPAL_ATTRIBUTE_NAME, new Principal(member.getId(), member.getUsername()));

        return "redirect:/";
    }

}
