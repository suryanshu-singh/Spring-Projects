package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	//      Get User by Name
                User findByName(String name);

}
