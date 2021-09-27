package com.tzx.springbootvueback.model;

import lombok.Data;

/**
 * @Author tuzongxun
 * @Date 2021/9/26
 */
@Data
public class User {
	private String name;
	private Integer age;

	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
}
