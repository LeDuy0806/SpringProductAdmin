package com.overpower.ProductManagementApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ProductManagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagementApiApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:3000");
//				registry.addMapping("/api/*/*").allowedOrigins("http://localhost:5500");
//				registry.addMapping("/api/*").allowedOrigins("http://localhost:5500");
//				registry.addMapping("/api/user").allowedOrigins("http://localhost:5500");
//				registry.addMapping("/api/user/{id}").allowedOrigins("http://localhost:5500");
			}
		};
	}

}
