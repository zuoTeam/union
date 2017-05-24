package com.zuo.union.domain;

import java.io.Serializable;

/**
 * 商店申请状态类
 * @author Yao
 *
 */
public class StoreApply implements Serializable {

	private static final long serialVersionUID = 8473057779780703232L;
	
	/*商店申请状态id*/
	private Integer storeApplyId;//0:审核中,1：审核通过,2：审核未通过
	
	/*商店申请状态*/
	private String storeApplyStatus;

	public Integer getStoreApplyId() {
		return storeApplyId;
	}

	public void setStoreApplyId(Integer storeApplyId) {
		this.storeApplyId = storeApplyId;
	}

	public String getStoreApplyStatus() {
		return storeApplyStatus;
	}

	public void setStoreApplyStatus(String storeApplyStatus) {
		this.storeApplyStatus = storeApplyStatus;
	}

	
	
	
}
