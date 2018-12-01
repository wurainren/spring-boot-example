package com.wurainren.demo.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloController {

	@RequestMapping("/hello2")
	public String hello2() {
		return "hello2";
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloController.class, args);
	}
}