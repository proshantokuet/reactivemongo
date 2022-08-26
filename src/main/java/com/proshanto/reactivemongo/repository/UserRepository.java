package com.proshanto.reactivemongo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.proshanto.reactivemongo.entity.Users;

@Repository
public interface UserRepository extends ReactiveMongoRepository<Users, String> {
	
	Mono<Users> findById();
	Flux<Users> findAll();

}
