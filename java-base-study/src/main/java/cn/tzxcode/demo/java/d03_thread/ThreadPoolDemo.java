package cn.tzxcode.demo.java.d03_thread;

import java.util.concurrent.*;

/**
 * @Author tuzongxun
 * @Date 2022/2/27
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService executorService= Executors.newFixedThreadPool(2);
		executorService.execute(()->{
			int num=0;
			for (int i = 0; i < 10000; i++) {
				num++;
			}
			System.out.println(num);
		});

		Future<Integer> future=executorService.submit(()->{
			int num=0;
			for (int i = 0; i < 10000; i++) {
				num++;
			}
			return num;
		});
		try {
			System.out.println(future.get());
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		catch (ExecutionException e) {
			e.printStackTrace();
		}
		executorService.shutdown();


	}
}
