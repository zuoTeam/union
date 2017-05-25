package com.zuo.union.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zuo.union.service.UserService;

@Controller
@RequestMapping("/user.do")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/to_login")
	public ModelAndView to_login(@RequestParam String userName,String userPass){
		ModelAndView modelAndView =new ModelAndView();
		try {
			if (null!=userService.login(userName, userPass)) {
				modelAndView.setViewName("login");
			} else {
				modelAndView.addObject("error_message", "账号或密码错误!");
			}
		} catch (Exception e) {
			modelAndView.addObject("error_message", "后台出错,请联系客服!");
		}
		return modelAndView;
		
	}
}
