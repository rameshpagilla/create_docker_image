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
		System.out.println("first docker image");
		return "Creating Docker Image from Spring Boot";
	}

	public static void main(String[] args) {
		System.out.println("this is docker application");
		SpringApplication.run(CreateDockerImageApplication.class, args);
	}

}
