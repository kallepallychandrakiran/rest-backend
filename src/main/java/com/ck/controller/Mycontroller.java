package com.ck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ck.entity.AppUser;
import com.ck.service.MyService;

@RestController
public class Mycontroller {

	@Autowired
	MyService service;

	@GetMapping("/")
	public String sayHello() {
		return "Chandra Kiran.tech welcome page";
	}

	@GetMapping("/secured")
	public String secured() {
		return "You are authorised to access this end-point";
	}

	@GetMapping("/view-registered")
	public List<AppUser> viewRegistered() {
		return service.viewAllRegisteredUsers();
	}

	@PostMapping("/register")
	public String register(@RequestBody AppUser user) {
		service.registerUser(user);
		return "User-Saved successfully";
	}

}