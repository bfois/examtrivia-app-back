package com.api.examtrivia;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "https://polinomicos.com")
public class ExamtriviaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamtriviaApplication.class, args);
	}

}
