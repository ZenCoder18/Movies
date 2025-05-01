package com.example;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MovieApplication {

	public static void main(String[] args) {
        Set<String> envVariables = new HashSet<>(Arrays.asList("MONGO_DATABASE", "MONGO_CLUSTER", "MONGO_PASSWORD", "MONGO_USER"));
		Dotenv dotenv = Dotenv.load();
		envVariables.forEach(env -> {
			System.setProperty(env, dotenv.get(env));
		});
		SpringApplication.run(MovieApplication.class, args);
	}

}
