package com.ibm.training;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	User findByUserName(String userName);
	
	
	
	@Query(value = "select user_name from user where user_address = :userAddress", nativeQuery = true)
	List<String> findNameByAddress(@Param(value = "userAddress") String userAddress);
	
}
