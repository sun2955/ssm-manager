package com.sun.dao;

import java.util.List;

import com.sun.entity.UserInfo;

public interface UserInfoDao {
	UserInfo findUserWithDept(UserInfo user);
	
	UserInfo findUserProfile(UserInfo user);
	
	List<UserInfo> findUsersList(UserInfo user);
}
