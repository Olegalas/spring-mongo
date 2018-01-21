package com.dexter.mongos.repository.second;

import com.dexter.mongos.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SecondMongoRepository extends MongoRepository<User, String> {
}
