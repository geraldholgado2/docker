package com.example.docker.dockerspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class DockerController {

	@GetMapping
	public String hello() {
		return "Hello Gerald";
	}
}
