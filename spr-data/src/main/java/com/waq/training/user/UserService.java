package com.waq.training.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	
	@Autowired
	UserRepository userRepository;
	
	//Get: For returning all users
	List<UserP> getAllUsers(){
		
		return (List<UserP>)userRepository.findAll();
		
		//return users;
	}
	
	//Get : for returning a single user by id
	Optional<UserP> getUser(String id) {
		
		return userRepository.findById(id);
		
		
	}

	//For adding the new user to List<User>
	public void addUser(UserP user) {
		
		userRepository.save(user);
		
		
	}

	public void updateUser(UserP user, String id) {
		
		userRepository.save(user);
		
	}

	public void deleteUser(String id) {
		
		userRepository.deleteById(id);
		
	}
}
