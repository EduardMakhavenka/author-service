package ru.nonsensemmy.storeAuthors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StoreAuthorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreAuthorsApplication.class, args);
	}

}
