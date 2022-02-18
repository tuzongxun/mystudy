package cn.tzxcode.demo.java.d03_thread;

/**
 * @Author tuzongxun
 * @Date 2022/2/16
 */
public class CreateThreadDemo {
	/**
	 * 创建线程的基本方式有
	 * 1.直接new Thread类或者子类,
	 * 2.实现runnable,接口
	 * 3.使用lambda表达式，实际上是实现runnable另一种写法
	 * @param args
	 */
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
