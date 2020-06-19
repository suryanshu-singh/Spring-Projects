package com.ibm.users;

public class User {

	Integer userId;
	String userName, userAddress;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	
	public User(Integer userId, String userName, String userAddress) {
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
	}
	
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
}
