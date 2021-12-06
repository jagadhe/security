package com.jagadeesh.poc.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String product_name;
	private String product_SKU;
	private double price;
	private String isActive;
	private String Qty;
	private String createdAt;
	private String createdBy;
	private String modifiedAt;
	private String modifiedBy;
	private boolean soft_delete;
	
	
	public boolean isSoft_delete() {
		return soft_delete;
	}



	public void setSoft_delete(boolean soft_delete) {
		this.soft_delete = soft_delete;
	}



	public Product() {
		
	}
	
	
	
	public Product(String product_name, String product_SKU, Double price, String isActive, String qty,
			String createdAt, String createdBy, String modifiedAt, String modifiedBy) {
		super();
		this.product_name = product_name;
		this.product_SKU = product_SKU;
		this.price = price;
		this.isActive = isActive;
		this.Qty = qty;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.modifiedAt = modifiedAt;
		this.modifiedBy = modifiedBy;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_SKU() {
		return product_SKU;
	}
	public void setProduct_SKU(String product_SKU) {
		this.product_SKU = product_SKU;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(double d) {
		this.price = d;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getQty() {
		return Qty;
	}
	public void setQty(String qty) {
		Qty = qty;
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
