package com.tzx.springbootvueback.controller;

import com.tzx.springbootvueback.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author tuzongxun
 * @Date 2021/9/26
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class TestController {

	private static final List<User> list = new ArrayList<>();

	static {
		list.add(new User("tzx", 30));
		list.add(new User("zx", 20));
		list.add(new User("ls", 10));
	}

	@GetMapping
	public List<User> userList() {
		return list;
	}

	@PostMapping
	public void addUser(@RequestBody User user) {
		System.out.println(user);
		list.add(user);
		System.out.println(list.size());
	}

	@PutMapping
	public void updateUser(@RequestBody User user) {
		System.out.println(user);
		list.stream().forEach(u -> {
			if (u.getName().equals(user.getName())) {
				list.set(list.indexOf(u), user);
			}
		});
	}

	@DeleteMapping
	public void deleteText(String userName) {
		System.out.println(userName);
		User delUser=null;
		for (User user : list) {
			if (user.getName().equals(userName)) {
				delUser=user;
			}
		}
		list.remove(delUser);
	}
}
