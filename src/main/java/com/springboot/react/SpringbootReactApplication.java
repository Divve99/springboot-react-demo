package com.springboot.react;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.react.model.Users;
import com.springboot.react.repository.UsersRepository;

@SpringBootApplication
public class SpringbootReactApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootReactApplication.class, args);
	}
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.usersRepository.save(new Users("amm", "hgj","ahggk@gmail.com", null, false));
		this.usersRepository.save(new Users("JK", "qwe","gvsd@gmail.com", null, true));
		
	}

}
