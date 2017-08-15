package com.krw.beautyCode.eventObject;

import java.util.EventListener;

/**
 * @company 浙江鸿程计算机系统有限公司
 * @author kangrw
 * @time 2017年7月21日下午4:07:48
 * 自定义事件监听器接口
 */
public interface MethodExecutionEventListener extends EventListener{
	
	/**
	 * 处理方法开始执行的时候发布的MethodExecutionEvent事件
	 */
	void onMethodBegin(MethodExecutionEvent evt);
	
	/**
	 * 处理方法执行将结束时发布的MethodExecutionEvent事件
	 * @param evt
	 */
	void onMethodEnd(MethodExecutionEvent evt);
} 
