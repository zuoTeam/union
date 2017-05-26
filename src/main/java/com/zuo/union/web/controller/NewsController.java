package com.zuo.union.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zuo.union.domain.News;
import com.zuo.union.domain.Type;
import com.zuo.union.service.NewsService;
import com.zuo.union.service.impl.NewsServiceImpl;

@Controller
public class NewsController {
	
	@Autowired
	private NewsService newsServiceImpl;

	/*@RequestMapping("/goNews")
	public String goNews(){
		return "user/news";
	}*/
	
	@RequestMapping("/goNews")
	public ModelAndView goNews(){
		ModelAndView modelAndView = new ModelAndView();
		try {
//			查询出所有的社区新闻类别
			List<Type> allNewsType = newsServiceImpl.getAllNewsType();
			List<News> allNews = newsServiceImpl.getAllNews();
			modelAndView.setViewName("user/news");
			if (allNewsType.size() > 0) {
				return modelAndView.addObject("allNewsType", allNewsType).addObject("allNews", allNews);
			} else {
				return modelAndView.addObject("errorMessage", "No More Types");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return modelAndView.addObject("errorMessage", "Server Error.Plz Contact Admin");
		}
		
	}
}
