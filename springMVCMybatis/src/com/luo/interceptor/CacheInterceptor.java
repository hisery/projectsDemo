package com.luo.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 第三步、定义切点
 * 		  定义通知者
 * @author 罗辉, @date:Aug 16, 2013
 *
 */
@Aspect//声明切面类
@Component
public class CacheInterceptor{

	/**
	 * 第一个*点：对于任意返回类型
	 * 第二个..点、：本包及其子包
	 * 第三个*.*点：任意类下的任意方法
	 * 第四个(..)点：任意参数
	 * Author:罗辉 ,Date:Aug 16, 2013
	 */
	@SuppressWarnings("unused")
	@Pointcut("execution(* com.luo.service..*.*(..))")
	private void allMethod(){
		//切点方法都不会执行方法体，只是为了重用
	}
}
