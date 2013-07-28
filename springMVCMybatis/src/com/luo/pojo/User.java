package com.luo.pojo;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String username;
	private String password;
	private List<Prod> prodList;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Prod> getProdList() {
		return prodList;
	}
	public void setProdList(List<Prod> prodList) {
		this.prodList = prodList;
	}
	
	
	
	
}
