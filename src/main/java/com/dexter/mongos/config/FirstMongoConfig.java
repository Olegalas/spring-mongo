package com.dexter.mongos.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.dexter.mongos.repository.first",
        mongoTemplateRef = "firstMongoTemplate")
public class FirstMongoConfig {

    @Bean
    public MongoClient getFirstMongoClient(){
        return new MongoClient("localhost", 27017);
    }

    @Bean
    public MongoTemplate firstMongoTemplate(){
        return new MongoTemplate(getFirstMongoClient(), "first");
    }

}
