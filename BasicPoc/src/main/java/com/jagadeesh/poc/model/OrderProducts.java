package com.jagadeesh.poc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "orderProducts")
public class OrderProducts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int orderItemId;
	



	private int orderId;
	@Column(name = "product_price")
	private String product_price;
	
	@Column(name = "product_qty")
	private String product_qty;
	
	public int getOrderId() {
		return orderId;
	}




	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}




	public OrderProducts() {
		
	}
	
	
	
	
	public OrderProducts(int orderItemId, int orderId, String product_price, String product_qty, Order1 order1) {
		super();
		this.orderItemId = orderItemId;
		this.orderId = orderId;
		this.product_price = product_price;
		this.product_qty = product_qty;
		this.order1 = order1;
	}




	public int getOrderItemId() {
		return orderItemId;
	}




	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}




	public String getProduct_price() {
		return product_price;
	}




	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}




	public String getProduct_qty() {
		return product_qty;
	}




	public void setProduct_qty(String product_qty) {
		this.product_qty = product_qty;
	}




	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL,mappedBy = "orderId")

	private Order1 order1;

	public Order1 getOrder1() {
		return order1;
	}




	public void setOrder1(Order1 order1) {
		this.order1 = order1;
	}
	
	
	
	
}
