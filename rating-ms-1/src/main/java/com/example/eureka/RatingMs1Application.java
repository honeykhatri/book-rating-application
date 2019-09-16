package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(exclude = JmxAutoConfiguration.class)
public class RatingMs1Application {

	public static void main(String[] args) {
		SpringApplication.run(RatingMs1Application.class, args);
	}

}
