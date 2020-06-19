package com.waq.training.place;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.waq.training.user.UserP;

@RestController
public class PlaceController {
	
	@Autowired
	PlaceService service;

	@RequestMapping("/users/{id}/places") // Get all places that belong to a user
	List<PlaceP> getUsers(@PathVariable String id){
		return service.getAllPlaces(id);
	}
	
	
	//For getting single place by id
	@RequestMapping("/users/{userId}/places/{id}") //Change the url here
	Optional<PlaceP> getPlace(@PathVariable("id") String id) {
		return service.getPlace(id);
	}
	
	
	//For adding a place by : post, first add the UserP ref in PlaceP and generate the getters and setters
	@RequestMapping(method = RequestMethod.POST, value = "/users/{userId}/places")
	void addPlace(@RequestBody PlaceP place, @PathVariable String userId) {
		place.setUser(new UserP("", "", "", userId)); // Before adding the new place to table, we have set the user to which this place belongs
		service.addPlace(place);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/users/{userId}/places/{id}")
	void updatePlace(@RequestBody PlaceP place, @PathVariable String userId, @PathVariable String id) {
		
		place.setUser(new UserP("", "", "", userId));
		
		service.updatePlace(place);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{userId}/places/{id}")
	void deletePlace(@PathVariable String id) {
		service.deletePlace(id);
	}
	
}
