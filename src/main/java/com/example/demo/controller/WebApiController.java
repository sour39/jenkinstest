package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class WebApiController {
	@RequestMapping("hello")
	private String hello(Model model) {
		System.out.println(model);
		return "Docker Tomcat Spring boot";
	}
}
