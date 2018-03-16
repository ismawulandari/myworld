package com.aprisma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldD {
	@RequestMapping("/")
	String hello() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldD.class, args);

	}

}
