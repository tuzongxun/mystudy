package cn.tzxcode.demo.java.d999_controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tuzongxun
 * @Date 2022/2/24
 */
@RestController
@RequestMapping("tzx")
public class TestController {
	@GetMapping("hello")
	public String hello(String name,Integer age){
		return name+age;
	}
}
