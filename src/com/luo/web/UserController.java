package com.luo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.luo.pojo.User;
import com.luo.service.UserService;


@Controller

public class UserController {

	private UserService userServie;

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(User user) {
		//User user = new User();
		/*user.setUsername("spring-mybatis");
		user.setPassword("998877");
		userServie.save(user);*/
		/*User user = userServie.findById(1);
		System.out.println(user.getUsername());*/
		System.out.println("hhhhhhh");
	}
	
	@Autowired
	public void setUserServie(UserService userServie) {
		this.userServie = userServie;
	}
	
	
	
}
