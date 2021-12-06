package com.jagadeesh.poc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="order1")
public class Order1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId1;
	
	private int orderid;
	
	
	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	@Column(name =  "orderNo")
	private int orderNo;
	
	@Column(name =  "userId")
	private  int userId;
	
	@Column(name =  "order_total")
	private String order_total;
	
	@Column(name =  "total_qty")
	private String total_qty;
	
	@Column(name =  "createdAt")
	private String createdAt;
	
	@Column(name =  "createdBy")
	private String createdBy;
	
	@Column(name =  "modifiedAt")
	private String modifiedAt;
	
	@Column(name =  "modifiedBy")
	private String modifiedBy;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name ="order_Id")
	private OrderProducts orderId;
	
	

	public int getOrderId1() {
		return orderId1;
	}

	public void setOrderId1(int orderId1) {
		this.orderId1 = orderId1;
	}

	public void setOrderId(OrderProducts orderId) {
		this.orderId = orderId;
	}

	public Order1() {
		
	}
	
	public Order1(int orderNo, int userId, String order_total, String total_qty, String createdAt, String createdBy,
			String modifiedAt, String modifiedBy) {
		super();
		this.orderNo = orderNo;
		this.userId = userId;
		this.order_total = order_total;
		this.total_qty = total_qty;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.modifiedAt = modifiedAt;
		this.modifiedBy = modifiedBy;
	}
	public int getOrderId() {
		return orderId1;
	}
	public void setOrderId(int orderId) {
		this.orderId1 = orderId;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getOrder_total() {
		return order_total;
	}
	public void setOrder_total(String order_total) {
		this.order_total = order_total;
	}
	public String getTotal_qty() {
		return total_qty;
	}
	public void setTotal_qty(String total_qty) {
		this.total_qty = total_qty;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(String modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	

}
