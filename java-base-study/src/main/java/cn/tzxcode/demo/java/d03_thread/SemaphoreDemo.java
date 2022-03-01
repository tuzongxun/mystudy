package cn.tzxcode.demo.java.d03_thread;

import com.sun.xml.internal.ws.spi.db.DatabindingException;

import java.util.Date;
import java.util.concurrent.Semaphore;

/**
 * @Author tuzongxun
 * @Date 2022/2/24
 */
public class SemaphoreDemo {

	public static void main(String[] args) {
		Semaphore sd=new Semaphore(5,true);
		for (int i = 0; i < 10; i++) {
			new Thread(()->{
				try {
					sd.acquire();
					System.out.println(new Date());
					Thread.sleep(1000);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					sd.release();
				}
			}).start();
		}
	}
}
