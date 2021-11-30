package com.vigjoaopaulo.gmail.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.vigjoaopaulo.gmail.com.model")
@SpringBootApplication
public class AprendendoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AprendendoSpringBootApplication.class, args);
	}

}
