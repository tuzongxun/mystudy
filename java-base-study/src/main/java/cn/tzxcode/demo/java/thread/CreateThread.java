package cn.tzxcode.demo.java.thread;

/**
 * @Author tuzongxun
 * @Date 2022/2/16
 */
public class CreateThread {
	public static void main(String[] args) {
		Thread t1=new Thread();
		t1.start();

		Thread t2=new MyThread();
		t2.start();

		Thread t3=new Thread(new MyRunnable());
		t3.start();

		Thread t4=new Thread(()-> System.out.println("lambda runnable start"));
		t4.start();
	}
}
class MyThread extends Thread{
	@Override
	public void run() {
		super.run();
		System.out.println("MyThread start");
	}
}

class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("MyRunnable start");
	}
}
