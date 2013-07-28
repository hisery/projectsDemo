package com.luo.dao;

import org.springframework.stereotype.Component;

import com.luo.dao.base.BaseDao;
import com.luo.dao.base.QueryResult;
import com.luo.entity.User;

@Component
public class UserDao{

	private BaseDao baseDao;
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
	
	
	public User findUserById(String id){
		return (User) baseDao.queryForObject("user.findUserById", id);
	}
	public void saveUser(User user){
		baseDao.saveObject("user.saveUser",user);
	}
	public QueryResult queryUserList(User user, Page page) {
		return baseDao.queryList("user.queryUserList",user,page);
	}
}
