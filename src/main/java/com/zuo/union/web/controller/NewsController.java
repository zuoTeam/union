package com.zuo.union.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zuo.union.domain.News;
import com.zuo.union.domain.PageBean;
import com.zuo.union.domain.Type;
import com.zuo.union.service.NewsService;
import com.zuo.union.service.impl.NewsServiceImpl;

@Controller
public class NewsController {

	@Autowired
	private NewsService newsServiceImpl;

	@RequestMapping("/goNewsTest")
	public String goNews() {
		return "user/news";
	}

	@RequestMapping("/goNews")
	public ModelAndView goNews(String keyWord, String typeId, String currentPage) {
		// 声明ModelAndView对象
		ModelAndView modelAndView = new ModelAndView();
		// 声明Type对象
		Type type = new Type();
		// 如果获取的typeId为空，将type对象制空，否则设置对应的typeId
		if (null == typeId || "".equals(typeId)) {
			type = null;
		} else {
			type.setTypeId(Integer.parseInt(typeId));
		}
		if (null == currentPage) {
			currentPage = "1";
		}
		if (null == keyWord) {
			keyWord = "";
		}
		try {
			// 查询出所有的社区新闻类别
			List<Type> allNewsType = newsServiceImpl.getAllNewsType();
			// List<News> allNews = newsServiceImpl.getAllNews();
			// 利用QBC查出对应新闻的条目数
			int newsPageCount = newsServiceImpl.getNewsRowCount(keyWord, type);
			// 设置到pageBean对象
			PageBean<News> pageBean = new PageBean<>(Integer.parseInt(currentPage),newsPageCount,5);
			// 利用QBC查出对应的新闻
			List<News> news = newsServiceImpl.getNews(keyWord, pageBean, type);
			// 跳转
			modelAndView.setViewName("user/news");
			if (allNewsType.size() > 0) {
				// 如果新闻条目数大于0，则传对应的新闻到页面
				return modelAndView.addObject("allNewsType", allNewsType).addObject("News", news).addObject("pageBean",
						pageBean);
			} else {
				// 否则页面显示没有更多的新闻
				return modelAndView.addObject("errorMessage", "No More Types");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// 数据库异常
			return modelAndView.addObject("errorMessage", "Server Error.Plz Contact Admin");
		}

	}
}
