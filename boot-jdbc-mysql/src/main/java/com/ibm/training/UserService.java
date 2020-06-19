package com.ibm.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserDao dao;

	List<User> getUsers(){
		return dao.getUsers();
	}

	public User getUserById(int id) {
		return dao.getUserById(id);
	}

	public void updateByName(String name) {
		 dao.updateByName(name);
	}

	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		dao.deleteByName(name);
	}

	public void addUser(String name, String password) {
		dao.addUser(name,password);
		
	}
}
