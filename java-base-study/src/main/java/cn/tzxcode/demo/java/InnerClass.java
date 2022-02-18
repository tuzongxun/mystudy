package cn.tzxcode.demo.java;

/**
 * @Author tuzongxun
 * @Date 2021/12/27
 */
public class InnerClass {

	private final String name="aaa";

	class Inner{
		private final String name="bbb";

		public void say(){
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(InnerClass.this.name);
		}
	}



	public static void main(String[] args) {
		new InnerClass().new Inner().say();

	}
}
