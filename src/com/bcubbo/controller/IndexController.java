package com.bcubbo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bcubbo.pojo.User;
import com.bcubbo.service.UserService;

@Controller
public class IndexController {
	@Resource
	private UserService userService;
	
	@RequestMapping(value="/index.html")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping(value="/register.html")
	public String register() {
		return "register";
	}
	@RequestMapping(value="/exit.html")
	public String exit() {
		return "exit";
	}
	
	@RequestMapping(value="/login.html")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/loginsuccess.html")
	public ModelAndView logsuccess(User user) {
		user = userService.getUser(user);
		return new ModelAndView("loginsuccess");
	}
	@RequestMapping(value="/regsuccess.html")
	public ModelAndView regsuccess(User user) {
		int f = userService.insertUser(user);
		if(f>0) {
			user = userService.getUser(user);
		}
		return new ModelAndView("regsuccess");
	}

}
