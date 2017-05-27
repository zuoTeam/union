package com.zuo.union.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zuo.union.domain.News;
import com.zuo.union.domain.PageBean;
import com.zuo.union.domain.Type;
import com.zuo.union.mapper.NewsMapper;
import com.zuo.union.service.NewsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-beans.xml")
public class NewsTest {
	
	@Autowired
	private NewsService newsServiceImpl;
	
	@Test
	public void getAllNewsType() throws Exception {
		List<Type> allNewsType = newsServiceImpl.getAllNewsType();
		for (Type type : allNewsType) {
			System.out.println(type.getTypeName());
		}
	}
	
	@Test
	public void getAllNews() throws Exception {
		List<News> allNews = newsServiceImpl.getAllNews();
		for (News news : allNews) {
			System.out.println("==="+news.getNewsTitle());
//			System.out.println(news.getType().getTypeName());
			System.out.println(news.getPublisher().getUserNickname());
//			System.out.println(news.getNewsDesc());
		}
	}
	
	@Test
	public void getNewsByType() throws Exception {
		Type type = new Type();
		type.setTypeId(5);
		
		PageBean<News> pageBean = new PageBean<>();
		pageBean.setCurrentPage(1);
		
		
		List<News> newsByType = newsServiceImpl.getNewsByType(type,pageBean);
		for (News news : newsByType) {
//			System.out.println(news.getNewsTitle());
			System.out.println(news.getNewsDate());
//			System.out.println(news.getType().getTypeName());
		}
	}
	
	@Test
	public void getNewsByQbc() throws Exception {
		Type type = null;
//		type.setTypeId(6);
		
		PageBean<News> pageBean = new PageBean<>();
		pageBean.setCurrentPage(1);
		
		String keyWord = "";
		
//		Map<String, Object> map = new HashMap<>();
//		map.put("type", type);
//		map.put("pageBean", pageBean);
//		map.put("keyWord", keyWord);
		
		List<News> news = newsServiceImpl.getNews(keyWord, pageBean, type);
		for (News news2 : news) {
			System.out.println(news2.getNewsTitle());
		}
	}
	
	@Test
	public void getNewsPageCount() throws Exception {
		Type type = new Type();
		type.setTypeId(7);
//		type = null;
		
		String keyWord = "";
		
//		Map<String, Object> map = new HashMap<>();
//		map.put("type", type);
//		map.put("keyWord", keyWord);
		
		int newsPageCount = newsServiceImpl.getNewsRowCount(keyWord, type);
		System.out.println(newsPageCount);
	}

}
