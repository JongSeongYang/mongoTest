package com.example.mongoTest.repository;

import com.example.mongoTest.domain.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity, String> {
}
