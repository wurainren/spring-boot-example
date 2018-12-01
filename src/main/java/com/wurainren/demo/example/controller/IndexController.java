package com.wurainren.demo.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String index(ModelMap map) {
		map.addAttribute("name", "武哥");
		return "index";
	}
}
