package com.luo.interceptor;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

import com.luo.annotation.Cache;
import com.luo.annotation.CacheType;

@Component
public class JedisCacheInterceptor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object result = invocation.proceed();
		System.out.println("拦截");
		return result;
		
		
//		Method method=invocation.getMethod();
//		Cache cache = method.getAnnotation(Cache.class);
//		Object[] args = invocation.getArguments();
//		if(cache!=null){
//			String cacheKeyPrefix=cache.cacheKeyPrefix();
//			CacheType cacheType=cache.cacheType();
//			System.out.println(cacheKeyPrefix);
//			//首先从redis中获取记录，没有则从数据库中取出放入redis
//			return invocation.proceed();
//		}else{
//			return invocation.proceed();
//		}
	}

}
