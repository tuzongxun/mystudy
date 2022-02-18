package cn.tzxcode.demo.java.d03_thread;

/**
 * @Author tuzongxun
 * @Date 2022/2/16
 */
public class ThreadStateDemo {
	public static void main(String[] args) {
		Thread t1=new Thread(()->{
			for(int i=0;i<100;i++){
				if(i%10==0){
					Thread.yield();
					
				}
				System.out.println("t1:"+i);
			}
		});
		Thread t2=new Thread(()->{
			for(int i=0;i<100;i++){
				if(i%10==0){
					Thread.yield();
				}
				if(i==30){
					try {
						t1.join();
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println("t2:"+i);
			}
		});
		t1.start();
		t2.start();
	}


}
