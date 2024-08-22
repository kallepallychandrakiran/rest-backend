package com.ck.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {

	@GetMapping("/")
	public String sayHello() {
		return "Chandra Kiran.tech welcome page";
	}

	@GetMapping("/secured")
	public String secured() {
		return "You are authorised to access this end-point";
	}

}