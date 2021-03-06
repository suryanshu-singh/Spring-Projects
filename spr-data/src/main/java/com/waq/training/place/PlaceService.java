package com.waq.training.place;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaceService {

	
	@Autowired
	PlaceRepository placeRepository;
	
	List<PlaceP> getAllPlaces(String userId){
		
		return placeRepository.findByUserUserId(userId);
	}
	
	
	
	//Get : for returning a single place by id
	Optional<PlaceP> getPlace(String id) {
		
		return placeRepository.findById(id); 
	}

	//For adding the new place
	public void addPlace(PlaceP place) {
		
		placeRepository.save(place);
	}

	public void updatePlace(PlaceP place) {
		
		placeRepository.save(place);
		
	}

	public void deletePlace(String id) {
		
		placeRepository.deleteById(id);
		
	}
}
