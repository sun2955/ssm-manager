package com.sun.service.impl;

import java.util.List;
import java.util.Map;

import com.sun.entity.User;
import com.sun.entity.UserInfo;


public interface UserService {
	
	 public void sayHello();
	 public String userInfoData(String id);
	 public String loginValidate(UserInfo user);
	 
	 Map<String, Object> findUsersList(User user);
}
