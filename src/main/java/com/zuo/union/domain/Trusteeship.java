package com.zuo.union.domain;

import java.io.Serializable;
/**
 * 托管类
 * @author wang
 *
 */
public class Trusteeship implements Serializable {

	private static final long serialVersionUID = 8162565047894103639L;
	/*托管订单id*/
	private Long trusteeshipId;
	/*被托管物品名称*/
	private String trusteeshipName;
	/*被托管物品数量*/
	private Long trusteeshipCount;
	/*托管人id,关联user类*/
	private Long userId;
	public Long getTrusteeshipId() {
		return trusteeshipId;
	}
	public void setTrusteeshipId(Long trusteeshipId) {
		this.trusteeshipId = trusteeshipId;
	}
	public String getTrusteeshipName() {
		return trusteeshipName;
	}
	public void setTrusteeshipName(String trusteeshipName) {
		this.trusteeshipName = trusteeshipName;
	}
	public Long getTrusteeshipCount() {
		return trusteeshipCount;
	}
	public void setTrusteeshipCount(Long trusteeshipCount) {
		this.trusteeshipCount = trusteeshipCount;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	
}
