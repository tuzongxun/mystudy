package cn.tzxcode.demo.java.d03_thread;

import java.util.Date;

/**
 * @Author tuzongxun
 * @Date 2022/2/16
 */
public class TreadSleepDemo {
	public static void main(String[] args) {
		Thread t1=new Thread(()->{
			for(int i=0;i<50;i++){
				try {
					Thread.sleep(1);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("t1:"+new Date());
			}
		});

		Thread t2=new Thread(()->{
			for(int i=0;i<50;i++){
				try {
					Thread.sleep(1);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("t2:"+new Date());
			}

		});

		t1.start();
		t2.start();
	}
}
