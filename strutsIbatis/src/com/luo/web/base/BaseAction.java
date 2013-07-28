package com.luo.web.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;


public class BaseAction extends ActionSupport implements ServletRequestAware{

	private static final long serialVersionUID = 1L;
	public HttpServletRequest request;
	
	public void setServletRequest(HttpServletRequest arg0) {
		this.request=arg0;
	}

	public HttpSession getSession(){
		return request.getSession();
	}
	
	public String getServletContextPath(){
//		return request.getRealPath("/");
		return request.getContextPath();
	}
	
	public HttpServletRequest getServletRequest(){
		return ServletActionContext.getRequest();
	}
	public HttpServletResponse getServletResponse(){
		return ServletActionContext.getResponse();
	}
}
