package cn.tzxcode.demo.java.d03_thread;

import java.util.concurrent.CountDownLatch;

/**
 * @Author tuzongxun
 * @Date 2022/2/22
 */
public class SynchroniziedDemo {
	private static Integer num=0;

	public static void main(String[] args) {
		CountDownLatch cd=new CountDownLatch(2);
		new Thread(()->{
			for(int i=0;i<10000;i++) {
				addNum1();
			}
			cd.countDown();
		}).start();
		new Thread(()->{
			for(int i=0;i<10000;i++) {
				addNum1();
			}
			cd.countDown();
		}).start();
		try {
			cd.await();
			System.out.println(num);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static synchronized void addNum(){
		num++;
	}
	public static void addNum1(){
		Object o=new Object();
		synchronized (o){
			num++;
		}
	}
}

