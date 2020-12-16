package com.knf.dev.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.knf.dev.document.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
