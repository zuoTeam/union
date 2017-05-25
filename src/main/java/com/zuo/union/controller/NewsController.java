package com.zuo.union.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsController {

	@RequestMapping("/goNews")
	public String goNews(){
		return "user/news";
	}
}
