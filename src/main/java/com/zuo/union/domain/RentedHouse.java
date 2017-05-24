package com.zuo.union.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 出租房屋实体类
 * @author Hydra
 *
 */
public class RentedHouse implements Serializable{

	private static final long serialVersionUID = 4964671064112125730L;
	
//	出租房屋ID
	private int houseId;
//	出租房屋贴标题
	private String houseTitle;
//	出租屋描述
	private String houseDesc;
//	出租屋地址
	private String houseAddr;
//	发布日期
	private Date houseDate;
//	发布人
	private User publisher;
	
	public RentedHouse() {

	}

	public int getHouseId() {
		return houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}

	public String getHouseTitle() {
		return houseTitle;
	}

	public void setHouseTitle(String houseTitle) {
		this.houseTitle = houseTitle;
	}

	public String getHouseDesc() {
		return houseDesc;
	}

	public void setHouseDesc(String houseDesc) {
		this.houseDesc = houseDesc;
	}

	public String getHouseAddr() {
		return houseAddr;
	}

	public void setHouseAddr(String houseAddr) {
		this.houseAddr = houseAddr;
	}

	public Date getHouseDate() {
		return houseDate;
	}

	public void setHouseDate(Date houseDate) {
		this.houseDate = houseDate;
	}

	public User getPublisher() {
		return publisher;
	}

	public void setPublisher(User publisher) {
		this.publisher = publisher;
	}
	
}
