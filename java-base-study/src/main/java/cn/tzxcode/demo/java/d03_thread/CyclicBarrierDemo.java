package cn.tzxcode.demo.java.d03_thread;

import java.util.Date;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author tuzongxun
 * @Date 2022/2/24
 */
public class CyclicBarrierDemo {

	public static void main(String[] args) {
		CyclicBarrier cb=new CyclicBarrier(20,()->{
			System.out.println("数量凑齐，开始运行-------------------:"+new Date());
		});

		for (int i = 0; i <41 ; i++) {
			System.out.println("创建线程："+(i+1)+new Date());
			new Thread(()->{
				try {
					cb.await();
					System.out.println("开始运行："+new Date());
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				catch (BrokenBarrierException e) {
					e.printStackTrace();
				}
			}).start();
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
