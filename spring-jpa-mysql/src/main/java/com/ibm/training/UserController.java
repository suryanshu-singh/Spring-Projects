package com.ibm.training;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-app")
public class UserController {

	@Autowired
	UserRepository repo;
	
	@RequestMapping("/users")
	Iterable<User> getUsers(){
		return repo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	void addUser(@RequestBody User user) {
		repo.save(user);
	}
	
	@RequestMapping("/users/{id}")
	Optional<User> getUserById(@PathVariable int id) {
		return repo.findById(id);
	}
	
	
//	Call our own fully customized method from the repo
	@RequestMapping("/users/address/{userAddress}")
	List<String> getNameByAddress(@PathVariable String userAddress) {
		return repo.findNameByAddress(userAddress);
	}
	
	
	
	
}
