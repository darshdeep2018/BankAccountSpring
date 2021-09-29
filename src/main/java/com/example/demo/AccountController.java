package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AccountController {
	@GetMapping("/")
	void getUsers() {
		System.out.println("called..");
	}

	@GetMapping("/{ownerName,address}")
	void getUser(@PathVariable String ownerName, @PathVariable Address address) {
		System.out.println("called" + ownerName);
	}

	@PostMapping
	String postcall(@RequestBody String ownerName, @RequestBody Address address) {// create user
		System.out.println("post");
		return "post called";

	}
}
