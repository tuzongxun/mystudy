package cn.tzxcode.demo.java.d02_collection;

/**
 * 验证hashmap源码中底层链表长度超过8时转红黑树
 * @Author tuzongxun
 * @Date 2022/1/9
 */
public class ForDemo {
	public static void main(String[] args) {
		MyNode node8=new MyNode(7,8,null);
		MyNode node7=new MyNode(6,7,node8);
		MyNode node6=new MyNode(5,6,node7);
		MyNode node5=new MyNode(4,5,node6);
		MyNode node4=new MyNode(3,4,node5);
		MyNode node3=new MyNode(2,3,node4);
		MyNode node2=new MyNode(1,2,node3);
		MyNode node1=new MyNode(0,1,node2);

        MyNode e;
        MyNode p=node1;
		for (int binCount = 0; ; ++binCount) {
			System.out.println(p);
			if ((e = p.next) == null) {
				//p.next = newNode(hash, key, value, null);
				if (binCount >= 7) {
					System.out.println(p);
				}
				break;
			}
			p=e;
		}
	}
}

class MyNode{
	int index;
	Object cur;
	MyNode next;

	public MyNode(int index, Object cur, MyNode next) {
		this.index = index;
		this.cur = cur;
		this.next = next;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Object getCur() {
		return cur;
	}

	public void setCur(Object cur) {
		this.cur = cur;
	}

	public Object getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "MyNode{" + "index=" + index + ", cur=" + cur + ", next=" + next + '}';
	}
}
