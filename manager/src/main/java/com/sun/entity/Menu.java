package com.sun.entity;

import java.io.Serializable;
import java.util.Date;

public class Menu implements Serializable {

	private static final long serialVersionUID = 7187628714679791771L;

	public static final String TYPE_MENU = "0";

	public static final String TYPE_BUTTON = "1";

	private Long menuId;

	private Long parentId;

	private String menuName;

	private String url;

	private String perms;

	private String icon;

	private String type;

	private Long orderNum;

	private Date createTime;

	private Date modifyTime;

	public Long getMenuId() {
		return menuId;
	}

	public Long getParentId() {
		return parentId;
	}

	public String getMenuName() {
		return menuName;
	}

	public String getUrl() {
		return url;
	}

	public String getPerms() {
		return perms;
	}

	public String getIcon() {
		return icon;
	}

	public String getType() {
		return type;
	}

	public Long getOrderNum() {
		return orderNum;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setPerms(String perms) {
		this.perms = perms;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setOrderNum(Long orderNum) {
		this.orderNum = orderNum;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}


}