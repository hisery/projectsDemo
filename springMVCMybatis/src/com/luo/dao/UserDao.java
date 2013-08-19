package com.luo.dao;

import java.util.List;

import com.luo.pojo.User;

public interface UserDao {

	public User findById(int id);
	
	public void save(User user);
	
	public void del(int id);
	
	public void edit(User user);
	
	public User findByIdWithProd(int id);

	public List<User> findAll();

	public User findUser(User user);

	public User findUserByNamePwd(String username, String password);
}
