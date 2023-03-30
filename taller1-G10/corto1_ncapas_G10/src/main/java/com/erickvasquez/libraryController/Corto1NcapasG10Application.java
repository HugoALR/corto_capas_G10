package com.erickvasquez.libraryController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Corto1NcapasG10Application {

	public static void main(String[] args) {
		SpringApplication.run(Corto1NcapasG10Application.class, args);
	}
	@GetMapping("/index")
	public String index() {
		return index();
	}
}
