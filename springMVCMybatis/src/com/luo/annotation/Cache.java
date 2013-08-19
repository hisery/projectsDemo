/**
 * 
 */
package com.luo.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 罗辉, @date:2013-8-16
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
@Documented
public @interface Cache {
	public String cacheKeyPrefix() default "";
	public CacheType cacheType() default CacheType.String;
}
