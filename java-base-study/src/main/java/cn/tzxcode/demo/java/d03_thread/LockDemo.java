package cn.tzxcode.demo.java.d03_thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author tuzongxun
 * @Date 2022/2/23
 */
public class LockDemo {
	private static int count=0;

	public static void main(String[] args) {
		ReentrantLock lock=new ReentrantLock(true);
		Thread t1=new Thread(()->{
			lock.lock();
			for (int i = 0; i < 1000000; i++) {
				count++;
			}
			lock.unlock();
		});
		Thread t2=new Thread(()->{
			//lock.lockInterruptibly();
			lock.lock();
			for (int i = 0; i < 1000000; i++) {
				count++;
			}
			lock.unlock();
		});
		try {
			t1.start();
			t2.start();
			t1.join();
			t2.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(count);
	}
}
