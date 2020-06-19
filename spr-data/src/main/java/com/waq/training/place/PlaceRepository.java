package com.waq.training.place;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PlaceRepository extends CrudRepository<PlaceP, String> {
	
//	List<PlaceP> findByUserId(String userId); // For getting the placesby specifying a user id, wouldn't work
	
	List<PlaceP> findByUserUserId(String userId); // For getting all the places particular to a user : fetch by user id
	
}
