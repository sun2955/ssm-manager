package com.sun.controller.system;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.common.base.Tree;
import com.sun.common.base.WebRespone;
import com.sun.entity.Menu;
import com.sun.entity.PageInfo;
import com.sun.entity.User;
import com.sun.service.impl.MenuService;
import com.sun.service.impl.UserService;
import com.sun.util.StringUtils;


@Controller
public class UserController  {
	
	@Autowired
	private UserService userService; 

	/**
	 * 用户管理页面头部
	 * @param model
	 * @return
	 */
	@RequestMapping("/user.do")
	public String index(Model model) {
		User user = new User();
		user.setUsername("MrBird");
		user.setEmail("295508987@qq.com");
		user.setTheme("blue-grey");
		user.setAvatar("default.jpg");
		
		model.addAttribute("user", user);
		return "system/user/user";
	}
	
	/**
	 * 用户管理页面详细列表
	 * @param model
	 * @return
	 */
	@RequestMapping("user/list.do")
	@ResponseBody
	public WebRespone userList(HttpServletRequest request, User user) {
		
		String pageNum =  request.getParameter("pageNum");// 页数
		String pageSize = request.getParameter("pageSize");// 每页数量
		
		//PageHelper.startPage(request.getPageNum(), request.getPageSize());
		Map<String, Object> resultObj = null;
		resultObj = userService.findUsersList(user);
		/*PageInfo<User> pageInfo = new PageInfo<User>(list);
		PageInfo<User> pageInfo = new PageInfo<User>(list);
		return getDataTable(pageInfo);*/
		
	 return WebRespone.success("OJBK", resultObj);
	}
}
