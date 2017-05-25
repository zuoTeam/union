package com.zuo.union.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuo.union.domain.News;
import com.zuo.union.domain.PageBean;
import com.zuo.union.domain.Type;
import com.zuo.union.mapper.NewsMapper;
import com.zuo.union.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService{

	@Autowired
	private NewsMapper newsMapper;
	
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

}
