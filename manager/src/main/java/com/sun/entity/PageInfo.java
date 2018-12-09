package com.sun.entity;

import java.util.List;

/**
 * @author  szy 
 * @version 创建时间：2018-5-27 下午4:44:50
 * 
 */
public class PageInfo {
public List list;
public int total;
public List getList() {
	return list;
}
public void setList(List list) {
	this.list = list;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}

}
