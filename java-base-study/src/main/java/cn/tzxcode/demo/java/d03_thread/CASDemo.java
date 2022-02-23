package cn.tzxcode.demo.java.d03_thread;

import sun.misc.Unsafe;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @Author tuzongxun
 * @Date 2022/2/23
 */
public class CASDemo {

	private static AtomicInteger ai=new AtomicInteger(0);
	private static AtomicStampedReference<Integer>  asr=new AtomicStampedReference(0,0);

	public static void main(String[] args) {
		CountDownLatch cd=new CountDownLatch(2);
		new Thread(()->{
			for(int i=0;i<100000;i++){
				ai.incrementAndGet();
			}
			cd.countDown();
		}).start();

		new Thread(()->{
			for(int i=0;i<100000;i++){
				ai.incrementAndGet();
			}
			cd.countDown();
		}).start();

		try {
			cd.await();
			System.out.println(ai);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}

		Unsafe.getUnsafe().freeMemory(10);
	}
}
