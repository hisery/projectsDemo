package com.luo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.luo.dao.Page;
import com.luo.dao.base.QueryResult;
import com.luo.entity.User;
import com.luo.service.UserService;
import com.luo.web.base.BaseAction;
import com.opensymphony.xwork2.Action;

@Controller
public class UserAction extends BaseAction{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	public UserService userService;
	
	
	public String findUserList(){
		String currentPage = request.getParameter("currentPage");
		if(currentPage==null)currentPage="1";
		Page page=new Page(1);
		User user = new User();
		user.setUsername("tom");
		
		QueryResult result=userService.userService(user,page);
		request.setAttribute("userList",result);
		return Action.SUCCESS;
	}
}
