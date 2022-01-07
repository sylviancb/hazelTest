package com.test.hazelTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class HazelTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HazelTestApplication.class, args);
	}

}
