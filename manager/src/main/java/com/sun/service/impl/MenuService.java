package com.sun.service.impl;

import java.util.List;

import com.sun.common.base.Tree;
import com.sun.entity.Menu;

public interface MenuService {
/*
	List<Menu> findUserPermissions(String userName);

	List<Menu> findUserMenus(String userName);

	List<Menu> findAllMenus(Menu menu);

	Tree<Menu> getMenuButtonTree();
	
	Tree<Menu> getMenuTree();
	*/
	Tree<Menu> getUserMenu(String userName);
	
	/*Menu findById(Long menuId);

	Menu findByNameAndType(String menuName, String type);

	void addMenu(Menu menu);

	void updateMenu(Menu menu);
	
	void deleteMeuns(String menuIds);*/
}
