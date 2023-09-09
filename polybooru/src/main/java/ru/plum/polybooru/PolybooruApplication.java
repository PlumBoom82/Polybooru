package ru.plum.polybooru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PolybooruApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolybooruApplication.class, args);
	}

	@GetMapping("/polybooru")
	public String home() {
		return "Welcome to Polybooru!";
	}
}
