package com.proshanto.reactivemongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

import com.proshanto.reactivemongo.entity.Users;
import com.proshanto.reactivemongo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public Mono<Users> createUser(Users user){
		System.err.println("come");
		return userRepository.insert(user);
	}

}
