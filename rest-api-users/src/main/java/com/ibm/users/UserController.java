package com.ibm.users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	List<User> users = new ArrayList<>(Arrays.asList(
			new User(45, "Sameer", "Delhi"),
			new User(67, "Shalini", "Noida"),
			new User(111, "Samrat", "Bangalore")
			));

	
//	Gets all the users with their details: exposed
	
	@GetMapping("/users")
	List<User> getAllUsers() {
		return users;
	}
	
	
//	Gets a user's details based on id
	
	@RequestMapping(produces = "application/json", method = RequestMethod.GET, value = "/users/{id}")
	User getUserById(@PathVariable int id) {
		return users.stream().filter(ref -> ref.getUserId().equals(id)).findFirst().get();
	}
	
	
//	Add a new User
//	@RequestMapping(method = RequestMethod.POST, value =  "/users")
	@PostMapping(value = "/users", consumes = "application/json")
	void addUser(@RequestBody User user) {
		users.add(user);
	}
	
	// OR
	
	@GetMapping("/users/{userId}/{userName}/{userAddress}")
	void addUser(@PathVariable int userId, @PathVariable String userName, @PathVariable String userAddress) {
		users.add(new User(userId, userName, userAddress));
	}
	
//	OR
	
//	@GetMapping("/user")
//	void addUser(@RequestParam int userId,@RequestParam String userName, @RequestParam  String userAddress) {
//		users.add(new User(userId, userName, userAddress));
//	}
	
	
	
// Update a User
	@RequestMapping(method = RequestMethod.PUT, value = "users/{id}")
	void updateUser(@PathVariable int id, @RequestBody User user) {
		for(User ref : users) {
			if(ref.getUserId().equals(id))
				users.set(users.indexOf(ref), user);
		}
	}
	
// Deletes a User
	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
	void deleteUser(@PathVariable int id) {
		User temp =  null;
		for(User ref : users) {
			if(ref.getUserId().equals(id)) {
				temp = ref;
				break;
			}
				
		}
		users.remove(temp);
	}
	
	
}
