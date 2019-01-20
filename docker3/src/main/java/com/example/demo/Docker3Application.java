package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Docker3Application {

	@RequestMapping("/welcome")
	public String welcome()
	{
		return "Welcome Oracle to the World of Docker";
	}
	public static void main(String[] args) {
		SpringApplication.run(Docker3Application.class, args);
	}

}

