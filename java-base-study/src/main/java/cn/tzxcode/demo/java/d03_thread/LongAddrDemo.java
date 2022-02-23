package cn.tzxcode.demo.java.d03_thread;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

/**
 * @Author tuzongxun
 * @Date 2022/2/23
 */
public class LongAddrDemo {
	private static Long count1 = 0L;

	private static AtomicLong count2 = new AtomicLong(0);

	private static LongAdder count3 = new LongAdder();

	public static void main(String[] args) {
		Thread[] threads = new Thread[1000];

		Object o = new Object();
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(() -> {
				for (int j = 0; j < 100000; j++) {
					synchronized (o) {
						count1++;
					}
				}
			});
		}

		Long t1 = System.currentTimeMillis();
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Long t2 = System.currentTimeMillis();
		System.out.println("count1-synchronized:" + count1 + ":" + (t2 - t1));
		//############################################
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(() -> {
				for (int j = 0; j < 100000; j++) {
					count2.incrementAndGet();
				}
			});
		}

		Long t11 = System.currentTimeMillis();
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Long t12 = System.currentTimeMillis();
		System.out.println("count2-Atomic:"+count2 + ":" + (t12 - t11));

		//############################################
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(() -> {
				for (int j = 0; j < 100000; j++) {
					count3.increment();
				}
			});
		}

		Long t21 = System.currentTimeMillis();
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Long t22 = System.currentTimeMillis();
		System.out.println("count3-LongAdder:"+count3 + ":" + (t22 - t21));
	}
}
