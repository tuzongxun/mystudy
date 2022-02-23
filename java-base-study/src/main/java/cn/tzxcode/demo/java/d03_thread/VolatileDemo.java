package cn.tzxcode.demo.java.d03_thread;

import java.util.concurrent.CountDownLatch;

/**
 * @Author tuzongxun
 * @Date 2022/2/22
 */
public class VolatileDemo {
	private volatile int num=0;
	public static void main(String[] args) {
		VolatileDemo volatileDemo=new VolatileDemo();
		CountDownLatch cd=new CountDownLatch(2);

		new Thread(()->{
			for(int i=0;i<100000;i++){
				volatileDemo.num++;
			}
			cd.countDown();
		}).start();

		new Thread(()->{
			for(int i=0;i<100000;i++){
				volatileDemo.num++;
			}
			cd.countDown();
		}).start();

		try {
			cd.await();
			System.out.println(volatileDemo.num);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}

		//new Thread(()->{
		//	while(true){
		//		if(volatileDemo.num==20000){
		//			System.out.println(volatileDemo.num);
		//			break;
		//		}
		//	}
		//}).start();

		//new Thread(()->{
		//	volatileDemo.num=20000;
		//}).start();
	}
}
