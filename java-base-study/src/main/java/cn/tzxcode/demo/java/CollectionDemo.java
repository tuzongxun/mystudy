package cn.tzxcode.demo.java;

import java.util.*;

/**
 * @Author tuzongxun
 * @Date 2022/1/4
 */
public class CollectionDemo {
	public static void main(String[] args) {
		//List<String> l1=new ArrayList<>();
		//l1.add("1");
		//System.out.println(l1.size());
		//
		//List<String> l2=new ArrayList<>(12);
		//System.out.println(l2.size());
		//
		//List<String> l3=new LinkedList<>();
		//l3.add("11");
		//l3.get(0);
		//
		//Set<String> s1=new HashSet<>();
		//s1.add("1");
		//
		//Set<String> s11=new LinkedHashSet<>();
		//s11.add("a");
		//
		//
		//Set<String> s2=new TreeSet<>();
		//s2.add("1");

		/*
		当 array.ength长度是2的次幂时，key.hashcode % array.length等于key.hashcode & (array.length - 1)
		 */

		//System.out.println((16 - 1) & 5);
		//System.out.println(5 & (16-1));
		//System.out.println(5 % 16);
		//
		//System.out.println((23 - 1) & 6);
		//System.out.println(6 & (23-1));
		//System.out.println(6 % 23);
		//
		//System.out.println(tableSizeFor(17));
		//
		Map<String,String> m1=new HashMap<>(12);
		m1.put("","");
		m1.get("");
		//
		//Map<String,String> m2=new LinkedHashMap<>(16);
		//m2.put("","");

		Map<String,String> m3=new TreeMap<>();
		m3.put("33","a");
		m3.put("3","a");
		m3.put("13","a");
		m3.put("2","a");

		m3.get("a");

		//System.out.println("重地".hashCode());
		//System.out.println("通话".hashCode());
		//System.out.println("Aa".hashCode());
		//System.out.println("BB".hashCode());
	}

	static final int tableSizeFor(int cap) {
		int n = cap - 1;
		n |= n >>> 1;
		n |= n >>> 2;
		n |= n >>> 4;
		n |= n >>> 8;
		n |= n >>> 16;
		return (n < 0) ? 1 : (n >= (1 << 30)) ? (1 << 30) : n + 1;
	}
}
