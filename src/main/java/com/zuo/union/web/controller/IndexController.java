package com.zuo.union.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 跳到首页的控制器
 * @author Yao
 *
 */
@Controller
public class IndexController {
	
	@RequestMapping("/gotoMainPage")
	public String gotoMainPage() {
		return "main";
	}
}
