package com.docker.springboot.create_docker_image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CreateDockerImageApplication {


	@GetMapping("/createDockerImage")
	public String getMessage(){
		return "Creating Docker Image from Spring Boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(CreateDockerImageApplication.class, args);
	}

}
