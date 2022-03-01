package cn.tzxcode.demo.java.d03_thread;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

/**
 * @Author tuzongxun
 * @Date 2022/2/24
 */
public class LockSupportDemo {
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				if (i == 3) {
					LockSupport.park();
				}
				System.out.println(i + ":" + new Date());
			}
		});
		t.start();
		try {
			Thread.sleep(3000);
			LockSupport.unpark(t);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
