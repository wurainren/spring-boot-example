package com.wurainren.demo.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wurainren.demo.example.entity.User;

/**
 * @RestController = @Controller + @ResponseBody
 * @author wurainren
 *
 */
@RestController
public class TestController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "success";
	}
	
	@RequestMapping("/user/get")
	public User getUser() {
		return new User();
	}
	
	
	@RequestMapping("/test")
	public String test() {
		int i = 1/0;
		return "Test";
	}
}
