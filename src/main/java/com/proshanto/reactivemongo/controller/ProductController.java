package com.proshanto.reactivemongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.proshanto.reactivemongo.dto.ProductDTO;
import com.proshanto.reactivemongo.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<ProductDTO> adduser(@RequestBody Mono<ProductDTO> productDTO){		
		return productService.saveProduct(productDTO);
	}
	@GetMapping("/list")
	@ResponseStatus(HttpStatus.CREATED)
	public Flux<ProductDTO> getproducts(){
		return productService.getProducts();
	}
}
