package com.zuo.union.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 积分商品订单
 * @author Hydra
 *
 */
public class PointOrder implements Serializable{

	private static final long serialVersionUID = -5789754372308781007L;
	
//	积分订单编号
	private int pOrderId;
//	下单时间
	private Date pOrderDate;
//	下单数量
	private int pOrderCount;
//	下单金额
	private Double pOrderCountPrice;
//	消费用户
	private User customer;
	
	public PointOrder() {

	}

	public int getpOrderId() {
		return pOrderId;
	}

	public void setpOrderId(int pOrderId) {
		this.pOrderId = pOrderId;
	}

	public Date getpOrderDate() {
		return pOrderDate;
	}

	public void setpOrderDate(Date pOrderDate) {
		this.pOrderDate = pOrderDate;
	}

	public int getpOrderCount() {
		return pOrderCount;
	}

	public void setpOrderCount(int pOrderCount) {
		this.pOrderCount = pOrderCount;
	}

	public Double getpOrderCountPrice() {
		return pOrderCountPrice;
	}

	public void setpOrderCountPrice(Double pOrderCountPrice) {
		this.pOrderCountPrice = pOrderCountPrice;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}
	
}
