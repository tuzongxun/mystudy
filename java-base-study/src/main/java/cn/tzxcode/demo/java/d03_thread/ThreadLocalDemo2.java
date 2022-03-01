package cn.tzxcode.demo.java.d03_thread;

/**
 * @Author tuzongxun
 * @Date 2022/2/27
 */
public class ThreadLocalDemo2 {
	private static ThreadLocal<User2> threadLocal=new ThreadLocal<>();
	public static void main(String[] args) {
		new Thread(()->{
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(threadLocal.get());
			threadLocal.remove();
		}).start();

		new Thread(()->{
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			User2 user=new User2();
			user.name="tzx";
			threadLocal.set(user);
		}).start();
	}
}
class User2{
	String name;
}
