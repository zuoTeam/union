package com.zuo.union.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zuo.union.domain.News;
import com.zuo.union.domain.PageBean;
import com.zuo.union.domain.Type;

@Repository
public interface NewsMapper {
	
	/**
	 * 获取所有社区新闻的类别
	 * @return
	 * @throws Exception
	 */
	List<Type> getAllNewsType() throws Exception;
	
	/**
	 * 获取所有的新闻
	 * @return
	 * @throws Exception
	 */
	List<News> getAllNews() throws Exception;
	
	/**
	 * 通过类型查找相应的新闻
	 * @return
	 * @throws Exception
	 */
	List<News> getNewsByType(Map<String, Object> map) throws Exception;
	
	/**
	 * 通过关键字查询新闻
	 * @param keyWord
	 * @return
	 * @throws Exception
	 */
	List<News> getNewsByKeyWord(String keyWord, PageBean<News> pageBean) throws Exception;

}
