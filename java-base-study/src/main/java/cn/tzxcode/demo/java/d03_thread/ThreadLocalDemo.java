package cn.tzxcode.demo.java.d03_thread;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.sound.midi.Soundbank;

/**
 * @Author tuzongxun
 * @Date 2022/2/27
 */
public class ThreadLocalDemo {
	private static User user;
	public static void main(String[] args) {
		new Thread(()->{
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(user.name);
		}).start();
		new Thread(()->{
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			user=new User();
			user.name="tzx";
		}).start();
	}
}
class User{
	String name;
}
