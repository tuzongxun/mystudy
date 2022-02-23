package cn.tzxcode.demo.java.d03_thread;

import java.awt.image.VolatileImage;

/**
 * @Author tuzongxun
 * @Date 2022/2/22
 */
public class VolatileDemo2 {
	private static /*volatile*/ VolatileDemo2 volatileDemo2;
	private VolatileDemo2(){
	}
	public static VolatileDemo2 getInstance(){
		if(volatileDemo2==null){
			synchronized (VolatileDemo2.class){
				if(volatileDemo2 ==null) {
					volatileDemo2 = new VolatileDemo2();
				}
			}
		}
		return volatileDemo2;
	}
}
