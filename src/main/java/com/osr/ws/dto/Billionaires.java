package com.osr.ws.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Billionaires {
/*
	  id INT AUTO_INCREMENT  PRIMARY KEY,
	  first_name VARCHAR(250) NOT NULL,
	  last_name VARCHAR(250) NOT NULL,
	  career VARCHAR(250) DEFAULT NULL*/
	  
	  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	String first_name;

	String last_name;

	String career;

	Billionaires() {
		super();
	}

	public String getFirstname() {
		return first_name;
	}

	public void setFirstname(String firstname) {
		this.first_name = firstname;
	}

	public String getLastname() {
		return last_name;
	}

	public void setLastname(String lastname) {
		this.last_name = lastname;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
