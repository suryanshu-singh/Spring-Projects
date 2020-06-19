package com.waq.training.place;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.waq.training.user.UserP;

//#1
@Entity
public class PlaceP {
	String placeName, placeAddress;
	
//#2
	@Id
	String placeId;
	
	
	public UserP getUser() {
		return user;
	}

	public void setUser(UserP user) {
		this.user = user;
	}

	@ManyToOne
	UserP user; // Tie this place to a user instance, Foreign Key to Primary Key in the UserP Table

	PlaceP(){
	
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPlaceAddress() {
		return placeAddress;
	}

	public void setPlaceAddress(String placeAddress) {
		this.placeAddress = placeAddress;
	}

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public PlaceP(String placeName, String placeAddress, String placeId, String userId) {
		this.placeName = placeName;
		this.placeAddress = placeAddress;
		this.placeId = placeId;
		this.user  = new UserP("", "", "", userId);
		
	}
	
		
}
