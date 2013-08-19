package com.luo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luo.dao.UserDao;
import com.luo.pojo.User;
import com.luo.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserDao userDao;

	public void save(User user) {
		userDao.save(user);
	}
	
	public User findById(int id) {
		return userDao.findById(id);
	}

	public List<User> findAll() {
		return userDao.findAll();
	}

	public User findUser(String username, String password) {
		return userDao.findUserByNamePwd(username,password);
	}

	@Override
	public User findUser(User user) {
		return userDao.findUser(user);
	}
}
