package com.ck.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ck.entity.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Long> {

}
