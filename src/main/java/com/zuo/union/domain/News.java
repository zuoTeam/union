package com.zuo.union.domain;

import java.io.Serializable;

/**
 * 新闻实体类
 * @author Hydra
 *
 */
public class News implements Serializable{
	
	private static final long serialVersionUID = 1959569651059128563L;
	
//	新闻的ID
	private int newsId;
//	新闻的标题
	private String newsTitle;
//	新闻正文
	private String newsDesc;
	
//	发布者
	private User publisher;
	
	public News() {

	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getNewsDesc() {
		return newsDesc;
	}

	public void setNewsDesc(String newsDesc) {
		this.newsDesc = newsDesc;
	}

	public User getPublisher() {
		return publisher;
	}

	public void setPublisher(User publisher) {
		this.publisher = publisher;
	}
	
}
