package com.hibernateExample.dao;

import com.hibernateExample.util.*;

import com.hibernateExample.model.Person;

public class PersonDAO {

	public void save(Person p) {
		HibernateSessionFactory.getInstance().save(p);
	}

}
