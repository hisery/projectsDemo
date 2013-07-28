package com.luo.web;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.luo.service.UserService;

@Controller
public class AppController {
	
	
	private UserService userService;
	
	@RequestMapping(value="/index.hhh",method=RequestMethod.GET)
	public String login(){
		return "index";
	}
	@RequestMapping(value="/indexiii/{id}",method=RequestMethod.GET)
	public ModelAndView index() {
		System.out.println("SpringMVC say Hello!");
		
		/*ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("msg", "Hello,SpringMVC");*/
		
		/*ModelAndView mav = new ModelAndView("index");
		mav.addObject("msg", "Hello,SpringMVC");
		mav.addObject("xx", "xx");*/
		
		return new ModelAndView("user_save","msg","���,SpringMVC!");
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	
	
	
	
	
	
	
	
}
