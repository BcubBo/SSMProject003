package com.bcubbo.controller;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bcubbo.pojo.User;
import com.bcubbo.service.UserService;

@Controller
public class IndexController {
	@Resource
	private UserService userService;
	private Logger logger  = (Logger)LogManager.getLogger(IndexController.class);
	@RequestMapping(value="/index.html")
	public String index() {
		logger.debug("索引页面启动");
		return "index";
	}
	
	@RequestMapping(value="/register.html")
	public String register() {
		logger.debug("注册页面启动");
		return "register";
	}
	@RequestMapping(value="/exit.html")
	public String exit() {
		logger.debug("退出页面启动");
		return "exit";
	}
	
	@RequestMapping(value="/login.html")
	public String login() {
		logger.debug("登陆页面启动");
		return "login";
	}
	
	@RequestMapping(value="/loginsuccess.html")
	public ModelAndView logsuccess(User user) {
		user = userService.getUser(user);
		logger.debug("登陆成功页面启动");
		return new ModelAndView("loginsuccess");
	}
	@RequestMapping(value="/regsuccess.html")
	public ModelAndView regsuccess(User user) {
		int f = userService.insertUser(user);
		if(f>0) {
			user = userService.getUser(user);
		}
		logger.debug("注册成功页面启动");
		return new ModelAndView("regsuccess");
	}

}
