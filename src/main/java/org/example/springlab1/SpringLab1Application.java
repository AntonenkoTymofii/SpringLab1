package org.example.springlab1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLab1Application implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("Start Spring Lab 1");
		SpringApplication.run(SpringLab1Application.class, args);
		System.out.println("End Spring Lab 2");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World from Spring Lab");
	}
}
