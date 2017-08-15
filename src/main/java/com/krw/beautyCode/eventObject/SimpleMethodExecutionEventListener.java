package com.krw.beautyCode.eventObject;
/**
 * @company 浙江鸿程计算机系统有限公司
 * @author kangrw
 * @time 2017年7月21日下午4:12:03
 * 自定义事件监听器的接口实现类
 */
public class SimpleMethodExecutionEventListener implements MethodExecutionEventListener{

	public void onMethodBegin(MethodExecutionEvent evt) {
		String methodName = evt.getMethodName();
		System.out.println("start to execute method " + methodName);
	}

	public void onMethodEnd(MethodExecutionEvent evt) {
		String methodName = evt.getMethodName();
		System.out.println("finish to execute method " + methodName);
	}

}
