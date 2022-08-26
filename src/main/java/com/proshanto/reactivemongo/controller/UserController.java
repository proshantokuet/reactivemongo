package com.proshanto.reactivemongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proshanto.reactivemongo.dto.ProductDTO;
import com.proshanto.reactivemongo.entity.Product;
import com.proshanto.reactivemongo.entity.Users;
import com.proshanto.reactivemongo.mapper.ProductMapper;
import com.proshanto.reactivemongo.service.UserService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private ProductMapper pm;
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<Users> adduser(){
		Users user = new Users();
		user.setAddress("Addfress");
		user.setName("Proshanto");
		user.setUsername("proshanto");
		Product p=new Product();
		p.setName("App");
		p.setPrice(3.4);
		p.setQty(23);
		ProductDTO pd = pm.entityToDTO().map(p);
		System.err.println(pd.toString());
		return userService.createUser(user);
	}

}
