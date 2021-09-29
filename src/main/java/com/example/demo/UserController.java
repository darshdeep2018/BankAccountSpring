package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping("/")
	void getUsers() {
		System.out.println("called..");
	}
	@GetMapping("/{id}")
		void  getUser(@PathVariable Integer id) {
		System.out.println("called"+id);
	}
	@PostMapping
	String postcall(@RequestBody User user) {//create user
		System.out.println("post");
		return "post called";
		
	}
	
	//put
	@PutMapping
	String handlePutMapping() {
		return "Put called...";
	}

}