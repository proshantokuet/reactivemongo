package com.proshanto.reactivemongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proshanto.reactivemongo.conversion.ProductConverter;
import com.proshanto.reactivemongo.dto.ProductDTO;
import com.proshanto.reactivemongo.entity.Product;
import com.proshanto.reactivemongo.mapper.ProductMapper;
import com.proshanto.reactivemongo.repository.ProductRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public Flux<ProductDTO> getProducts(){
		return productRepository.findAll().map(ProductMapper::entityToDTO);
	}
	
	public Mono<ProductDTO> getProduct(String id){
		return productRepository.findById(id).map(ProductMapper::entityToDTO);
	}

	public Mono<ProductDTO> saveProduct(Mono<ProductDTO> productDTO){
		return productDTO.map(ProductMapper::dtoToEntity).flatMap(productRepository::insert).map(ProductMapper::entityToDTO);
	}
	
	public Mono<ProductDTO> updateProduct(Mono<ProductDTO> productDTO,String id){
		 return productRepository.findById(id).flatMap(p->productDTO.map(ProductMapper::dtoToEntity)
		 .doOnNext(e-> e.setId(id))).flatMap(productRepository::save).map(ProductMapper::entityToDTO);
	}		
}
