package com.dgsol.Reactivedemo;

import com.dgsol.Reactivedemo.repositories.MongoDb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
public class ReactiveDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveDemoApplication.class, args);
	}

}
