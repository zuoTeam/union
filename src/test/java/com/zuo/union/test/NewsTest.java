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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-beans.xml")
public class NewsTest {
	
	@Autowired
	private NewsMapper newsMapper;
	
	@Test
	public void getAllNewsType() throws Exception {
		List<Type> allNewsType = newsMapper.getAllNewsType();
		for (Type type : allNewsType) {
			System.out.println(type.getTypeName());
		}
	}
	
	@Test
	public void getAllNews() throws Exception {
		List<News> allNews = newsMapper.getAllNews();
		for (News news : allNews) {
			System.out.println("==="+news.getNewsTitle());
			System.out.println(news.getType().getTypeName());
			System.out.println(news.getPublisher().getUserNickname());
			System.out.println(news.getNewsDesc());
		}
	}
	
	@Test
	public void getNewsByType() throws Exception {
		Type type = new Type();
		type.setTypeId(5);
		
		PageBean<News> pageBean = new PageBean<News>();
		pageBean.setCurrentPage(1);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("type", type);
		map.put("pageBean", pageBean);
		
		List<News> newsByType = newsMapper.getNewsByType(map);
		for (News news : newsByType) {
//			System.out.println(news.getNewsTitle());
			System.out.println(news.getNewsDate());
//			System.out.println(news.getType().getTypeName());
		}
	}

}
