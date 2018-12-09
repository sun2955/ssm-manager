package com.sun.entity;

import java.util.Date;

public class User {
	

	private Long userId;

	
	private String username;

	private String password;

	private Long deptId;

	private String deptName;

	private String email;

	private String mobile;

	private String status;

	private Date crateTime;

	private Date modifyTime;

	private Date lastLoginTime;

	private String ssex;

	private String theme;

	private String avatar;

	private String description;

	private String roleName;

	public Long getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public Long getDeptId() {
		return deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	public String getStatus() {
		return status;
	}

	public Date getCrateTime() {
		return crateTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public String getSsex() {
		return ssex;
	}

	public String getTheme() {
		return theme;
	}

	public String getAvatar() {
		return avatar;
	}

	public String getDescription() {
		return description;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setCrateTime(Date crateTime) {
		this.crateTime = crateTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


}
