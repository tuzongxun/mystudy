package cn.tzxcode.demo.java.d01_javabase;

import java.util.Objects;

/**
 * @Author tuzongxun
 * @Date 2021/12/26
 * idea快捷键可以帮忙重写hashcode和equals里的逻辑
 */
public class HashAndEquals {
	private int age;
	private String name;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HashAndEquals that = (HashAndEquals)o;
		return age == that.age && Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
}
