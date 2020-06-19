package com.ibm.expensemanager.application.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WalletUser {
	
	@Id
	String email;
	String password;
	String name;
	String currency;
	int expenselimit;
	
	WalletUser(){
		
	}
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getLimit() {
		return expenselimit;
	}
	public void setLimit(int limit) {
		this.expenselimit = limit;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

