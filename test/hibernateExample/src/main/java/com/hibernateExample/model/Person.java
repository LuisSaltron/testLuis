package com.hibernateExample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
public class Person {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String country;

	public void setName(String name) {
		this.name = name;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
	
	
}
