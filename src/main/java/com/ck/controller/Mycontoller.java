package com.ck.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontoller {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello & Welcome to ChandraKiran.tech";
	}

	@GetMapping("/")
	public String root() {
		return sayHello();
	}

}
