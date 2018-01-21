package com.dexter.mongos.repository.first;

import com.dexter.mongos.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FirstMongoRepository extends MongoRepository<User, String> {
}
