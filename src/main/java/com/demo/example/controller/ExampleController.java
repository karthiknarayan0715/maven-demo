package com.demo.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.example.models.ExampleModels;

@RestController
public class ExampleController {
	@GetMapping("/msg")
	public String show() {
		return "Hello World";
	}
	@GetMapping("/users")
	public String users() {
		ExampleModels models = new ExampleModels();
//		String res = "[";
//		for(String n: models.getNames()) {
//			res = res + n + ',';
//		}
//		res = res + "]";
		return models.getNames().toString();
	}
}
