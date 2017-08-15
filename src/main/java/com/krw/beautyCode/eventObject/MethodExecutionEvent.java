package com.krw.beautyCode.eventObject;

import java.util.EventObject;

/**
 * @company 浙江鸿程计算机系统有限公司
 * @author kangrw
 * @time 2017年7月21日下午4:04:45
 * 针对方法执行事件的自定义事件类型定义
 */
public class MethodExecutionEvent extends EventObject{

	private String methodName;
	
	public MethodExecutionEvent(Object source) {
		super(source);
	}
	
	public MethodExecutionEvent(Object source,String methodName) {
		super(source);
		this.methodName = methodName;
	}

	private static final long serialVersionUID = -806790332037493864L;

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
}
