package com.proshanto.reactivemongo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.proshanto.reactivemongo.entity.Users;
import com.proshanto.reactivemongo.service.UserService;

@SpringBootTest
class ReactiveMongoApplicationTests {

	@Autowired
	private UserService userService;
	@Test
	void contextLoads() {
	}
	@Test
	public void addUser(){
		System.out.println("OK");
		Users user = new Users();
		user.setAddress("Addfress");
		user.setName("Proshanto");
		user.setUsername("proshanto");
		userService.createUser(user);
	}

}
