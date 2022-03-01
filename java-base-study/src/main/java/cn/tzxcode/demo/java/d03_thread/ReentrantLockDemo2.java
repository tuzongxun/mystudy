package cn.tzxcode.demo.java.d03_thread;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author tuzongxun
 * @Date 2022/2/24
 */
public class ReentrantLockDemo2 {
	private static int count=0;

	private static ReentrantLock reentrantLock=new ReentrantLock();
	private static ReentrantReadWriteLock reentrantReadWriteLock=new ReentrantReadWriteLock();
	private static Lock readLock=reentrantReadWriteLock.readLock();
	private static Lock writeLock=reentrantReadWriteLock.writeLock();

	public static void readCount(Lock lock){
		try{
			lock.lock();
			Thread.sleep(1000);
			System.out.println(new Date() +"----"+count);
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}

	private static void writeCount(Lock lock){
		try{
			lock.lock();
			Thread.sleep(1000);
			count++;
			System.out.println(new Date() +"----"+count);
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		//for (int i = 0; i < 5; i++) {
		//	new Thread(()->{
		//		readCount(reentrantLock);
		//	}).start();
		//}
		//for (int i = 0; i < 5; i++) {
		//	new Thread(()->{
		//		writeCount(reentrantLock);
		//	}).start();
		//}

		for (int i = 0; i < 5; i++) {
			new Thread(()->{
				readCount(readLock);
			}).start();
		}
		for (int i = 0; i < 5; i++) {
			new Thread(()->{
				writeCount(writeLock);
			}).start();
		}

	}
}
