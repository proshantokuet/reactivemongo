package com.proshanto.reactivemongo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.proshanto.reactivemongo.entity.Product;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String>{

}
