package com.luo.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.danga.MemCached.MemCachedClient;

public class SessionUtil {

	private static final boolean is_Dev_Mode=true;
	
	
	public static Object getSession(HttpServletRequest request,String name){
		//如果是生产模式,从memcached获取
		if(!is_Dev_Mode){
			Map<String, Object> map = getMapFromMemcached(request);
			return map != null ? map.get(name) : null;
		}else{
			// 开发模式：保存在本地session中
			HttpSession session = request.getSession();
			return session.getAttribute(name);
		}
	}
	public static void setSession(HttpServletRequest request, String name, Serializable obj){
		// 生产模式：保存在memcached中
		if (!is_Dev_Mode) {
			Map<String, Object> map = getMapFromMemcached(request);
			if (map != null) {
				map.put(name, obj);
				setMemcached(request, obj);
			} else {
				// 如果取不到 uuid，则保存到本地session中
				HttpSession session = request.getSession();
				session.setAttribute(name, obj);
			}
		} else {
			// 开发模式：保存在本地session中
		    HttpSession session = request.getSession();
		    session.setAttribute(name, obj);
		}
	}

	private static void setMemcached(HttpServletRequest request,Serializable obj) {
		String sessionId = request.getSession().getId();		
		MemCachedClient memcachedClient=getBean(request, "memcachedClient");
		memcachedClient.set(sessionId, obj);
	}
	private static Map<String, Object> getMapFromMemcached(HttpServletRequest request) {
		Map<String, Object> map = null;
		MemCachedClient memcachedClient=getBean(request, "memcachedClient");
		String sessionId=request.getSession().getId();
		map = (Map<String, Object>) memcachedClient.get(sessionId);
		if(map==null){
			map=new HashMap<String, Object>();
			memcachedClient.set(sessionId, map);
		}
		return map;
	}
	
	public static <T>T getBean(HttpServletRequest request, String beanName){
		ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(request.getSession().getServletContext());
		return (T) ac.getBean(beanName);
	}
}
