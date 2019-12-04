package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PeopleRepository extends MongoRepository<People, String> {
	
	People findOneByName(String name);

}
