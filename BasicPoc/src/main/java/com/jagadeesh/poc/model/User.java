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
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	
	@Column(name ="username")
	private String username;
	
	@Column(name ="email")
	private  String email;
	
	@Column(name ="mobile")
	private String mobile;
	
	@Column(name ="isActive")
	private String isActive;
	
	@Column(name ="createdAt")
	private String createdAt;
	
	@Column(name ="createdBy")
	private String createdBy;
	
	@Column(name ="modifiedAt")
	private String modifiedAt;
	
	@Column(name ="modifiedBy")
	private String modifiedBy;
	
	@Column(name = "soft_delete")
	private boolean soft_delete;
	
	
	public boolean isSoft_delete() {
		return soft_delete;
	}


	public void setSoft_delete(boolean soft_delete) {
		this.soft_delete = soft_delete;
	}
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private Address userId;
	
	


	public User() {
		
	}
	
	
	public User(String username, String email, String mobile, String isActive, String createdAt, String createdBy,
			String modifiedAt, String modifiedBy, Address userId) {
		super();
		this.username = username;
		this.email = email;
		this.mobile = mobile;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.modifiedAt = modifiedAt;
		this.modifiedBy = modifiedBy;
		this.userId = userId;
	}
	
	
	public Address getUserId() {
		return userId;
	}
	public void setUserId(Address userId) {
		this.userId = userId;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
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
