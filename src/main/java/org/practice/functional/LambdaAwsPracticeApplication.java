package org.practice.functional;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LambdaAwsPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaAwsPracticeApplication.class, args);
	}
	
	@Bean
	public Function<String, String> uppercase() {
		return value -> value.toUpperCase();
	}

}
