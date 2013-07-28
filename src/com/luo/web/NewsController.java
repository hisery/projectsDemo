package com.luo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class NewsController {

	@RequestMapping(value="/hello/hello.html",method=RequestMethod.GET)
	public String hello(){
		return "file";
	}
	
}
