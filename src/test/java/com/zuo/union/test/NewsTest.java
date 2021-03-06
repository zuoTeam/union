package com.zuo.union.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zuo.union.domain.Comment;
import com.zuo.union.domain.Functions;
import com.zuo.union.domain.News;
import com.zuo.union.domain.PageBean;
import com.zuo.union.domain.Type;
import com.zuo.union.domain.User;
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
	
	@Test
	public void addComment() throws Exception {
		User user = new User();
		user.setUserId(1l);
		
		Functions functions = new Functions();
		functions.setFuncId(2);
		
		News news = new News();
		news.setNewsId(1);
		
		Comment<News> comment = new Comment<>();
		comment.setE(news);
		comment.setCommentContent("testtest");
		comment.setFunction(functions);
		comment.setUser(user);
		
		int addComment = newsServiceImpl.addComment(comment);
		System.out.println(addComment);
		
//		System.out.println(comment.getE());
	}
	
	@Test
	public void addNews() throws Exception {
		User user = new User();
		user.setUserId(1l);
		
		Type type = new Type();
		type.setTypeId(3);
		
		Date date = new Date();
		date.getTime();
		
		News news = new News();
		news.setNewsTitle("你好呀");
		news.setNewsDesc("我就问你好不好");
		news.setNewsDate(date);
		news.setPublisher(user);
		news.setType(type);
		
		int addNews = newsServiceImpl.addNews(news);
		System.out.println(addNews);
	}
	
	@Test
	public void deleteComment() throws Exception {
		Comment<News> comment = new Comment<>();
		comment.setCommentId(2);
		
		int deleteComment = newsServiceImpl.deleteComment(comment);
		System.out.println(deleteComment);
	}
	
	@Test
	public void deleteNews() throws Exception {
		News news = new News();
		news.setNewsId(1);
		
		int deleteNews = newsServiceImpl.deleteNews(news);
		System.out.println(deleteNews);
	}

}
