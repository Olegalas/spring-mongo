package com.dexter.mongos.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.dexter.mongos.repository.second",
        mongoTemplateRef = "secondMongoTemplate")
public class SecondMongoConfig {

    @Bean
    public MongoClient getSecondMongoClient(){
        return new MongoClient("localhost", 27017);
    }

    @Bean
    public MongoTemplate secondMongoTemplate(){
        return new MongoTemplate(getSecondMongoClient(), "second");
    }

}
