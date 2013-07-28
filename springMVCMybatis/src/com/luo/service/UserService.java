package com.luo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luo.dao.UserDao;
import com.luo.pojo.User;

@Service
@Transactional
public class UserService {

	private UserDao userDao;

	public void save(User user) {
		userDao.save(user);
	}
	
	public User findById(int id) {
		return userDao.findById(id);
	}
	
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	
}
