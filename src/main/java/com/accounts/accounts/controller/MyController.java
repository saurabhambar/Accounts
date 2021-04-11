package com.accounts.accounts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accounts.accounts.entity.UserAccount;
import com.accounts.accounts.services.UserService;

@RestController
public class MyController {
	
	@Autowired
	private UserService userService;
	
	//get the user account
	@GetMapping("/users")
	public List<UserAccount> getUsers()
	{
		return this.userService.getUsers();
	}
	
	//get the user account by id
	@GetMapping("/users/{userId}")
	public UserAccount getUsers(@PathVariable String userId) 
	{
		return this.userService.getUsers(Long.parseLong(userId));
	}
	
	@PostMapping("/users")
	public UserAccount addUser(@RequestBody UserAccount user)
	{
		return this.userService.addUser(user);
	}
	
	@PutMapping("/users")
	public UserAccount updateUser(@RequestBody UserAccount user)
	{
		return this.userService.updateUser(user);
	}
	
	
	
	@DeleteMapping("/users/{userId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String userId)
	{
		try {
			this.userService.deleteUser(Long.parseLong(userId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
