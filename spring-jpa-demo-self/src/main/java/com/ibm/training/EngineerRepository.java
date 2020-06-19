package com.ibm.training;

import org.springframework.data.repository.CrudRepository;

public interface EngineerRepository extends CrudRepository<Engineer, Integer> {
	
	Engineer findByName(String name);

}
