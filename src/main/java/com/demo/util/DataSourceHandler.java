package com.demo.util;

/**
 * 数据源的Handler类
 */
public class DataSourceHandler {

	// 使用ThreadLocal记录当前线程的数据源key
	public static final ThreadLocal<String> holder = new ThreadLocal<String>();

	/**
	 * 在项目启动的时候将配置的读、写数据源加到holder中
	 */
	public static void putDataSource(String datasource) {
		holder.set(datasource);
	}

	/**
	 * 从holer中获取数据源字符串
	 */
	public static String getDataSource() {
		return holder.get();
	}

	// 清除数据库连接
	public static void clearDataSource() {
		holder.remove();
	}

}
