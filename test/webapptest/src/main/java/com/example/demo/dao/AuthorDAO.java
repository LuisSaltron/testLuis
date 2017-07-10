package com.example.demo.dao;

import com.example.demo.model.Author;
import com.example.demo.util.HibernateSessionFactory;

public class AuthorDAO {

	public void createAuthor(Author author) {
		HibernateSessionFactory.getInstance().save(author);
	}

}
