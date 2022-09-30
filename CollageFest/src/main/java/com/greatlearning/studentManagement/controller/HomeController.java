package com.greatlearning.studentManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showMainPage() {
		System.out.println("working");
		return "home";
	}

}
