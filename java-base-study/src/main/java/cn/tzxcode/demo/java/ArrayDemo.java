package cn.tzxcode.demo.java;

/**
 * @Author tuzongxun
 * @Date 2021/12/29
 */
public class ArrayDemo {
	public static void main(String[] args) {
		Object [] objArr=new Object[3];
		objArr[0]=1;
		objArr[1]="sss";
		for (int i = 0; i < objArr.length; i++) {
			System.out.println(objArr[i]);
		}
	}
}
