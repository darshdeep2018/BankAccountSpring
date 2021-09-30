package com.example.AccountProject;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AccountController {
	
	ArrayList<Account> accounts=new ArrayList<Account>();
	
	@GetMapping("/{ownerName}")
	public Account getSavingsAccount(@PathVariable String ownerName) {
		for(Account account:accounts) {
			if(account.getOwnerName().equals(ownerName))
				return account;
		}
		System.out.println("Account Not Found");
		return null;
	}
	

	@PostMapping
	String postcall(@RequestBody Account account) {
		if(account.equals(null))
			return "Invalid input";
		accounts.add(account);
		return "Account added successfully";
	}
	
	
}
