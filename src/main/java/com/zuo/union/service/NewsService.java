package com.zuo.union.service;

import java.util.List;
import java.util.Map;

import com.zuo.union.domain.News;
import com.zuo.union.domain.PageBean;
import com.zuo.union.domain.Type;

public interface NewsService {

	/**
	 * 获取所有的社区新闻类别
	 * 
	 * @return
	 * @throws Exception
	 */
	List<Type> getAllNewsType() throws Exception;

	/**
	 * 获取所有的新闻
	 * 
	 * @return
	 * @throws Exception
	 */
	List<News> getAllNews() throws Exception;

	/**
	 * 通过类型查找相应的新闻
	 * 
	 * @return
	 * @throws Exception
	 */
	List<News> getNewsByType(Type type, PageBean<News> pageBean) throws Exception;

	/**
	 * 通过关键字查询新闻
	 * 
	 * @param keyWord
	 * @return
	 * @throws Exception
	 */
	List<News> getNewsByKeyWord(String keyWord, PageBean<News> pageBean) throws Exception;

	/**
	 * 使用QBC动态查询对应的新闻，包括关键字，类型
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	List<News> getNews(String keyWord, PageBean<News> pageBean, Type type) throws Exception;
	
	/**
	 * 使用QBC动态查询对应的新闻的条目数，包括关键字，类型
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	int getNewsRowCount(String keyWord, Type type) throws Exception;
}
