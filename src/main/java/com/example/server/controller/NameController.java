package com.example.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
public class NameController {

	@GetMapping("/name/{name}")
	public String getName(@PathVariable String name) {
		return "Hello " + name +" !!";
	}
}
