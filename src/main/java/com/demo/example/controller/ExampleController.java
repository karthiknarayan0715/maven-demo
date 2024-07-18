package com.demo.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	@GetMapping("/msg")
	public String show() {
		return "Hello World";
	}
}
