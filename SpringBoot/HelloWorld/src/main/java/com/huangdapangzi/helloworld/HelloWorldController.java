package com.huangdapangzi.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第一个helloworld类
 * @author Administrator
 *
 */
@RestController
public class HelloWorldController {
	@RequestMapping("HelloWorld")
	public String helloWorld() {
		return "Hello World!";
	}
	
}
