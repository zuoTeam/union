package com.zuo.union.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 易物订单类
 * @author wang
 *
 */
public class Order implements Serializable{

	private static final long serialVersionUID = -1418435068077844864L;
	/*订单id*/
	private Long orderId;
	/*物品id,关联goods类*/
	private Long goodsId;
	/*用户id,关联user类*/
	private Long userId;
	/*交易数量*/
	private Long orderCount;
	/*下单时间*/
	private Date orderDate;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(Long orderCount) {
		this.orderCount = orderCount;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	
}
