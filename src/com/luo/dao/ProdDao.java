package com.luo.dao;

import com.luo.pojo.Prod;

public interface ProdDao {

	public Prod findById(int id);
	
	public Prod findByIdAndUserId(Prod p);
}
