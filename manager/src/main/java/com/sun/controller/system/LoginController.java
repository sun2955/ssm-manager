package com.sun.controller.system;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.common.base.WebRespone;
import com.sun.controller.base.BaseController;
import com.sun.entity.User;
import com.sun.entity.UserInfo;
import com.sun.service.impl.UserService;
import com.sun.util.StringUtils;
import com.sun.util.ToolsMD5;

@Controller
public class LoginController extends BaseController{

	private Logger log = Logger.getLogger(LoginController.class);
	
	//给变量赋值
	@Value(value = "/view")
	public String controllerName;
	
	
	@Autowired
	private UserService userService; 
	
	@RequestMapping("/login.html")
	public String login(){
		
		log.info("this controller name is =login");	
		return "login";
	}
	
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	@ResponseBody
	public WebRespone login(HttpServletRequest request,
			HttpServletResponse response,String username, String password, String code, Boolean rememberMe) {
		
		if (!StringUtils.isNotBlank(code)) {
			//return 303;
		}
		UserInfo user = new UserInfo();
		user.setUsername(username);
		user.setPassword(password);
		String loginFlg = userService.loginValidate(user);
		
		if(StringUtils.isEqual(loginFlg,"true")){
			HttpSession  session = request.getSession();
			session.setAttribute("loginUser", username);
			try {
				return WebRespone.success();
			} catch (Exception e) {
				return WebRespone.error(e.getMessage());
			}
		}
		return WebRespone.error("登录错误");

	}
	
	@RequestMapping("/")
	public String redirectIndex() {
		return "redirect:/index.do";
	}
	
	//访问系统首页
	@RequestMapping("/index.do")
	public String index(Model model) {
		System.out.println("index-----------------------");
		//User user = super.getCurrentUser();
		User user = new User();
		user.setUsername("MrBird");
		user.setEmail("295508987@qq.com");
		user.setTheme("blue-grey");
		user.setAvatar("default.jpg");
		
		
		model.addAttribute("user", user);
		return "index";
	}
	
}
