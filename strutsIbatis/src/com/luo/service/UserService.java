package com.luo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luo.dao.Page;
import com.luo.dao.UserDao;
import com.luo.dao.base.QueryResult;
import com.luo.entity.User;


@Service
public class UserService {

	@Autowired
	public UserDao userDao;
	
	public QueryResult userService(User user, Page page) {
		return userDao.queryUserList(user,page);
	}

}
