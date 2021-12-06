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
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int AddressId;
	private int userId;
	
	@Column(name = "address1")
	private String address1;
	
	@Column(name = "address2")
	private String address2;
	
	@Column(name = "Pincode")
	private String Pincode;
	
	@Column(name = "isActive")
	private String isActive;
	
	@Column(name = "isPrimary")
	private String isPrimary;
	
	@Column(name = "createdAt")
	private String createdAt;
	
	@Column(name = "createdBy")
	private String createdBy;
	
	@Column(name = "modifiedAt")
	private String modifiedAt;
	
	@Column(name = "modifiedBy")
	private String modifiedBy;
	
	@Column(name ="soft_delete")
	private boolean soft_delete;
	
	
	public boolean getSoft_delete() {
		return soft_delete;
	}


	public void setSoft_delete(boolean soft_delete) {
		this.soft_delete = soft_delete;
	}
	
	  @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy
	  ="userId" ) private User user;
	 
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Address() {
		
	}
	
	
	public Address(String address1, String address2, String pincode, String isActive, String isPrimary,
			String createdAt, String createdBy, String modifiedAt, String modifiedBy) {
		super();
		
		this.address1 = address1;
		this.address2 = address2;
		Pincode = pincode;
		this.isActive = isActive;
		this.isPrimary = isPrimary;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.modifiedAt = modifiedAt;
		this.modifiedBy = modifiedBy;
	}
	public int getAddressId() {
		return AddressId;
	}
	public void setAddressId(int addressId) {
		AddressId = addressId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getIsPrimary() {
		return isPrimary;
	}
	public void setIsPrimary(String isPrimary) {
		this.isPrimary = isPrimary;
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
