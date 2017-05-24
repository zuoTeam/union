package com.zuo.union.domain;

import java.io.Serializable;

/**
 * 社区商店类
 * @author Yao
 *
 */
public class Store implements Serializable {

	private static final long serialVersionUID = 851034514278469829L;
	
	/*商店id*/
	private Integer storeId;
	
	/*商店名*/
	private String storeName;
	
	/*商店地址*/
	private String storeAddress;
	
	/*商店电话*/
	private String storeTel;
	
	/*商店申请状态*/
	private StoreApply applyStatus;
	
	/*发布社区活动的人---多对一*/
	private User user;
	
	/*本类功能模块---一对一*/
	private Functions funcition;

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreTel() {
		return storeTel;
	}

	public void setStoreTel(String storeTel) {
		this.storeTel = storeTel;
	}

	public StoreApply getApplyStatus() {
		return applyStatus;
	}

	public void setApplyStatus(StoreApply applyStatus) {
		this.applyStatus = applyStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Functions getFuncition() {
		return funcition;
	}

	public void setFuncition(Functions funcition) {
		this.funcition = funcition;
	}

	
}
