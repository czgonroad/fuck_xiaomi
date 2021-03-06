package com.fuck.xiaomi.manage;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 爬虫状态标志
 * @author wei.li
 * @time 2017年6月19日下午3:06:49
 */
public class StatusManage {
	
	
	//登录状态
	public static volatile boolean isLogin = false;
	
	//抢购结束标志
	public static volatile boolean isEnd = false;
	
	//结束消息
	public static volatile String endMsg = "";
	
	//提交订单的次数
	public static AtomicInteger submitCount = new AtomicInteger(0);

	
}
