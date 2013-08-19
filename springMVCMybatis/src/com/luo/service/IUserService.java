package com.luo.service;

import java.util.List;

import com.luo.pojo.User;


/**
 * 第二步、创建通知（接口和实现类）
 * @author 罗辉, @date:Aug 16, 2013
 *
 */
public interface IUserService {

	public void save(User user);
	public User findById(int id);
	public List<User> findAll();
	public User findUser(String username, String password);
	public User findUser(User user);
}
