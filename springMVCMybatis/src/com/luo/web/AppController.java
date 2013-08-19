package com.luo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.luo.pojo.User;
import com.luo.service.IUserService;

@Controller
public class AppController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String login(){
		return "index";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String index(User user) {
		User u = userService.findUser(user);
		if(u==null){
			return "index";
		}
		return "redirect:/news/findAllNewsList";
	}
	
	
}
