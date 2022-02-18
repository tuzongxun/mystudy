package cn.tzxcode.demo.java.d01_javabase;

/**
 * @Author tuzongxun
 * @Date 2021/12/25
 * 构造方法代码块，会被放到每个构造方法开头执行
 */
public class CodeBlockDemo {

	{
		System.out.println("构造方法代码块");
	}

	public CodeBlockDemo(){

	}

	public CodeBlockDemo(int a){

	}

	public static void main(String[] args) {
		new CodeBlockDemo();
		new CodeBlockDemo(1);
	}
}
