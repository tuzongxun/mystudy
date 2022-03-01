package cn.tzxcode.demo.java.d03_thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author tuzongxun
 * @Date 2022/2/24
 */
public class CountDownLatchDemo {
	private static int count=0;

	public static void main(String[] args) {
		ReentrantLock lock=new ReentrantLock(true);
		CountDownLatch cd=new CountDownLatch(2);
		new Thread(()->{
			lock.lock();
			for (int i = 0; i < 1000000; i++) {
				count++;
			}
			lock.unlock();
			cd.countDown();
		}).start();
		new Thread(()->{
			lock.lock();
			for (int i = 0; i < 1000000; i++) {
				count++;
			}
			lock.unlock();
			cd.countDown();
		}).start();
		try {
			cd.await();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(count);
	}
}
