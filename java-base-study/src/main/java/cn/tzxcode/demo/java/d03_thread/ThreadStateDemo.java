package cn.tzxcode.demo.java.d03_thread;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author tuzongxun
 * @Date 2022/2/16
 */
public class ThreadStateDemo {
	public static void main(String[] args) {

		timeWaitingState();
	}

	public static void timeWaitingState(){
		Thread t1=new Thread(()-> {
			try {
				Thread.sleep(5000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		//Thread t2=new Thread(()->LockSupport.parkUntil(10000));
		//System.out.println(t1.getState()+","+t2.getState());

		t1.start();
		//t2.start();

		new Thread(()-> System.out.println(t1.getState())).start();
		//LockSupport.unpark(t2);
	}

	public static synchronized void te(){
		//Thread t1=new Thread(()->{
		//	for(int i=0;i<100;i++){
		//		if(i%10==0){
		//			Thread.yield();
		//
		//		}
		//		System.out.println("t1:"+i);
		//	}
		//});
		//Thread t2=new Thread(()->{
		//	for(int i=0;i<100;i++){
		//		if(i%10==0){
		//			Thread.yield();
		//		}
		//		if(i==30){
		//			try {
		//				t1.join();
		//			}
		//			catch (InterruptedException e) {
		//				e.printStackTrace();
		//			}
		//		}
		//
		//		System.out.println("t2:"+i);
		//	}
		//});
		//t1.start();
		//t2.start();
	}


}
