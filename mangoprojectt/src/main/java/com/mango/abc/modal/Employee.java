package com.mango.abc.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Employee {
	
	@Id
	private Integer _id;
	
	private String firstname;
	
	private String lastname;

	

	public Integer getId() {
		return _id;
	}

	public void setId(Integer id) {
		this._id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Employee [_id=" + _id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	
	
	
	

}
