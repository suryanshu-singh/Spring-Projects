package com.ibm.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserService service;

	@RequestMapping("/users")
	List<User> getUsers(){
		return service.getUsers();
	}
	
	@RequestMapping("/users/{id}")
	User getUserById(@PathVariable int id){
		return service.getUserById(id);
	}
	@PutMapping("/users/{name}")
	void updateByName(@PathVariable String name) {
		service.updateByName(name);
	}
	@DeleteMapping("/users/{name}")
	void deleteByName(@PathVariable String name) {
		service.deleteByName(name);
	}
	@GetMapping("/users/{name}/{password}")
	void addUser(@PathVariable String name, @PathVariable String password) {
		service.addUser(name,password);
	}
	
}
