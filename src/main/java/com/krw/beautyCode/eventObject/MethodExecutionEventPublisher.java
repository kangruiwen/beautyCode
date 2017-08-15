package com.krw.beautyCode.eventObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @company 浙江鸿程计算机系统有限公司
 * @author kangrw
 * @time 2017年7月21日下午4:14:34
 * 事件发布者定义
 */
public class MethodExecutionEventPublisher {
	
	private List<MethodExecutionEventListener> listener = new ArrayList<MethodExecutionEventListener>();
	
	public void methodToMonitor() {
		MethodExecutionEvent event2Publish = new MethodExecutionEvent(this,"methodToMonitor");
		publishEvent(MethodExecutionStatus.BEGIN, event2Publish);
		//...执行实际的方法逻辑
		publishEvent(MethodExecutionStatus.END,event2Publish);
		
	}
	
	protected void publishEvent(MethodExecutionStatus status,MethodExecutionEvent event) {
		List<MethodExecutionEventListener> copyList = new ArrayList<MethodExecutionEventListener>(listener);
		for(MethodExecutionEventListener listener : copyList){
			if(MethodExecutionStatus.BEGIN.equals(status)){
				listener.onMethodBegin(event);
			}else{
				listener.onMethodEnd(event);
			}
			
		}
	}
	
	public void addMethodExecutionListener(MethodExecutionEventListener listener) {
		this.listener.add(listener);
	}
	
	public void removeListener(MethodExecutionEventListener listener) {
		if(this.listener.contains(listener)) 
			this.listener.remove(listener);
	}
	
	public void removeAll() {
		this.listener.clear();
	}
	
}
