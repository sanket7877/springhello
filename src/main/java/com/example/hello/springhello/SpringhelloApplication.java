package com.example.hello.springhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringhelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringhelloApplication.class, args);
	}

	@GetMapping("/hello")
	public String helo(){
		return "helloj";
	}
}
