package com.dexter.mongos.config;


import com.dexter.mongos.model.MyEvent;
import com.dexter.mongos.model.User;
import com.dexter.mongos.repository.first.FirstMongoRepository;
import com.dexter.mongos.repository.second.SecondMongoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.dexter.mongos")
@EnableAutoConfiguration(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class AppConfig {

    public static void main(String[] args) throws InterruptedException {

        ConfigurableApplicationContext context = SpringApplication.run(AppConfig.class);
        FirstMongoRepository firstMongoRepository = context.getBean(FirstMongoRepository.class);
        SecondMongoRepository secondMongoRepository = context.getBean(SecondMongoRepository.class);

        firstMongoRepository.save(new User("Dex", "123", new MyEvent("Event")));
        secondMongoRepository.save(new User("Sid", "111", new MyEvent("Event2")));

        System.out.println("Persisted");

        System.out.println(firstMongoRepository.findAll());
        System.out.println(secondMongoRepository.findAll());

        Thread.sleep(5_000);
        System.exit(0);
    }

}
