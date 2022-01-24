package com.interview.springk8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringK8sApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringK8sApplication.class, args);
	}

	@RequestMapping("/test")
	public String test(){
		return "Successfully deployment in Kubernetes!!";
	}
}
