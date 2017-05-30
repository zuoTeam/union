package com.zuo.union.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zuo.union.domain.Comment;
import com.zuo.union.domain.News;
import com.zuo.union.domain.PageBean;
import com.zuo.union.domain.Type;
import com.zuo.union.mapper.NewsMapper;
import com.zuo.union.service.NewsService;

@Transactional(propagation=Propagation.REQUIRED)
@Service
public class NewsServiceImpl implements NewsService{

	@Autowired
	private NewsMapper newsMapper;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Type> getAllNewsType() throws Exception {
		return newsMapper.getAllNewsType();
	}

	public List<News> getAllNews() throws Exception {
		return newsMapper.getAllNews();
	}

	public List<News> getNewsByType(Type type, PageBean<News> pageBean) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("type", type);
		map.put("pageBean", pageBean);
		return newsMapper.getNewsByType(map);
	}

	public List<News> getNewsByKeyWord(String keyWord, PageBean<News> pageBean) throws Exception {
		return null;
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	@Override
	public List<News> getNews(String keyWord, PageBean<News> pageBean, Type type) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("type", type);
		map.put("pageBean", pageBean);
		map.put("keyWord", keyWord);
		return newsMapper.getNews(map);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	@Override
	public int getNewsRowCount(String keyWord, Type type) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("type", type);
		map.put("keyWord", keyWord);
		return newsMapper.getNewsRowCount(map);
	}

	@Override
	public int addComment(Comment<News> comment) throws Exception {
		return newsMapper.addComment(comment);
	}

	@Override
	public int addNews(News news) throws Exception {
		return newsMapper.addNews(news);
	}

	@Override
	public int deleteComment(Comment<News> comment) throws Exception {
		return newsMapper.deleteComment(comment);
	}

	@Override
	public int deleteNews(News news) throws Exception {
		return newsMapper.deleteNews(news);
	}


}
