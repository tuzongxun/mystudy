package cn.tzxcode.demo.java;

import java.sql.SQLOutput;

/**
 * @Author tuzongxun
 * @Date 2021/12/27
 */
public class Test {

	public static void main(String[] args) {
		BaseVO baseVo=new TestVo1();
		System.out.println(baseVo instanceof TestVo1);
		System.out.println(baseVo.getClass().getName());
	}




}
