package cn.tzxcode.demo.java.d01_javabase;


/**
 * @Author tuzongxun
 * ？@Date 2021/12/28
 */
public class StringDemo {

	private final char[] value;

	public StringDemo() {
		value = new char[1];
	}

	/**
	 * java1.7之前常量池在方法区，1.7之后挪到了堆中
	 * equals比较字符数组中每一个字符的大小
	 */
	public static void main(String[] args) {
       //StringDemo sd= new StringDemo();
		//sd.value[0]='a';
		//System.out.println(sd.value);
	   //
		//char[] c1=new char[3];
		//sd.value=c1;

		String a1="ab"+"cd";

		String a="ab";
		String b="cd";
		String d=a+b;

		StringBuilder sb=new StringBuilder("ab");
		sb.append("cd");

		int n1=2;
		System.out.println(n1 << 1);
	}
}
