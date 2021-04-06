package com.springboot.react.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.react.model.Users;
import com.springboot.react.repository.UsersRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class UsersController {
	@Autowired
	UsersRepository usersRepository;

	@GetMapping("users")
	public List<Users> getUsers() {
		return this.usersRepository.findAll();
		
		
	}

}
