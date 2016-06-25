package com.smacheng.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("vipController")
public class VipController {

	/**
	 * vip资源
	 */
	@RequestMapping(value = "/vip", method = RequestMethod.GET)
	public String vip(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return "/portal/vip";
	}
	
	/**
	 * pay
	 */
	@RequestMapping(value = "/pay", method = RequestMethod.GET)
	public String pay(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return "/portal/pay";
	}
}
