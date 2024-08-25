package com.ck.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ck.dao.UserRepository;
import com.ck.entity.AppUser;

@Service
public class MyService {

	@Autowired
	UserRepository repo;

	public AppUser registerUser(AppUser user) {
		return repo.save(user);
	}

	public List<AppUser> viewAllRegisteredUsers() {
		return repo.findAll();
	}
}
