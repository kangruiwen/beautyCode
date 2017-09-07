package thread.sync_and_vola;
/**
 * @author momo
 * @time 2017年9月6日下午12:41:01
 */
public class SynchronizedDemo {
	
	private boolean ready = false;
	private int result = 0;
	private int number = 1;
	
	//写操作
	public void write() {
		ready = true;
		number = 2;
	}

	//读操作
	public void read() {
		if(ready){
			result = number * 3;
		}
		System.out.println("result的值为：" + result);
	}
	
	private class ReadWriteThread extends Thread {
		//根据构造方法中传入的flag参数，确定线程是读操作还是写操作
		private boolean flag;
		
		public ReadWriteThread(boolean flag) {
			this.flag = flag;
		}
		
		public void run() {
			if(flag) 
				write();
			else 
				read();
		}
	}
	
	public static void main(String[] args) {
		SynchronizedDemo demo = new SynchronizedDemo();
		demo.new ReadWriteThread(true).start();
		demo.new ReadWriteThread(false).start();
		//经过测试，经常出现6与0两种结果；
	}
}
