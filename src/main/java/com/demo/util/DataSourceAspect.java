package com.demo.util;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 切换数据源(不同方法调用不同数据源)
 */
@Aspect
@Component
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Order(1)
public class DataSourceAspect {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

//	@Pointcut("execution(* com.demo.dao.mybatis..*(..))")
	@Pointcut("execution(* com.demo.biz..*(..))")
	public void aspect() {
	}

	/**
	 * 配置前置通知,使用在方法aspect()上注册的切入点
	 */
	@Before("aspect()")
	public void before(JoinPoint point) {
		String className = point.getTarget().getClass().getName();
		String method = point.getSignature().getName();
		logger.info(className + "." + method + "(" + StringUtils.join(point.getArgs(), ",") + ")");
		try {
			for (String key : ChooseDataSource.METHOD_TYPE_MAP.keySet()) {
				for (String type : ChooseDataSource.METHOD_TYPE_MAP.get(key)) {
					if (method.startsWith(type)) {
						DataSourceHandler.clearDataSource();
						DataSourceHandler.putDataSource(key);
						System.out.println("数据源--------" + key);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
