package cn.tzxcode.demo.java.d03_thread;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.*;

/**
 * @Author tuzongxun
 * @Date 2022/2/27
 */
public class ThreadPoolDemo2 {
	public static void main(String[] args) {
		ThreadPoolExecutor pool =
			new ThreadPoolExecutor(2, 4, 60, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(5));
		//pool.prestartAllCoreThreads();
		for (int i = 0; i <10; i++) {
			pool.execute(() -> {
				try {
					Thread.sleep(3000);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("hello");
			});
			System.out.println(
				"corePoolSize:" + pool.getCorePoolSize() + ",maxPoolSize:" + pool.getMaximumPoolSize() + ",poolSize:" + pool
					.getPoolSize() + ",queueSize:" + pool.getQueue().size());
		}

		pool.shutdown();
	}
}
