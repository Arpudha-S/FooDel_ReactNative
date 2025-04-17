package com.foodapp.developer.foodel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class FoodelApplication implements CommandLineRunner {

	public static void main(String[] args) {

		//SpringApplication.run(FoodelApplication.class, args);
		SpringApplication app = new SpringApplication(FoodelApplication.class);
		app.setDefaultProperties(Map.of(
				"server.address", "0.0.0.0",
				"server.port", "8080"
		));
		app.run(args);

	}

	@Override
	public void run(String... args) throws Exception {

	}
}
