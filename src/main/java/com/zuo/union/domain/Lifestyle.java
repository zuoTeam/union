package com.zuo.union.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 生活小细节贴实体类
 * @author Administrator
 *
 */
public class Lifestyle implements Serializable{

	private static final long serialVersionUID = -6552644740933703444L;
	
//	小细节ID
	private	int lifeId;
//	标题
	private String lifeTtile;
//	正文
	private String lifeDesc;
//	发布日期
	private Date lifeDate;
	
//	发布者
	private User publisher;
	
	public Lifestyle() {

	}

	public int getLifeId() {
		return lifeId;
	}

	public void setLifeId(int lifeId) {
		this.lifeId = lifeId;
	}

	public String getLifeTtile() {
		return lifeTtile;
	}

	public void setLifeTtile(String lifeTtile) {
		this.lifeTtile = lifeTtile;
	}

	public String getLifeDesc() {
		return lifeDesc;
	}

	public void setLifeDesc(String lifeDesc) {
		this.lifeDesc = lifeDesc;
	}

	public Date getLifeDate() {
		return lifeDate;
	}

	public void setLifeDate(Date lifeDate) {
		this.lifeDate = lifeDate;
	}

	public User getPublisher() {
		return publisher;
	}

	public void setPublisher(User publisher) {
		this.publisher = publisher;
	}
	
}
