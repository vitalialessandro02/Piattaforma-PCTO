package com.example.PiattaformaPCTO_v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PiattaformaPctoV2Application {

	public static void main(String[] args) {
		SpringApplication.run(PiattaformaPctoV2Application.class, args);
	}


}
