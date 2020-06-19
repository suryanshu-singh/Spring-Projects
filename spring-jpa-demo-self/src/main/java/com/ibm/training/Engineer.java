package com.ibm.training;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engineer {
	
	
	@Id
	Integer id;
	String department;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	

}
