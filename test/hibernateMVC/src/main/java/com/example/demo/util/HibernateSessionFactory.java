package com.example.demo.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateSessionFactory {

	private static HibernateSessionFactory instance;

	private SessionFactory sessionFactory;

	private HibernateSessionFactory() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build(); // configures
		// settings
		// from
		// hibernate.cfg.xml
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception ex) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	public static HibernateSessionFactory getInstance() {
		if (instance == null) {
			instance = new HibernateSessionFactory();
		}
		return instance;
	}
	
	public void finish() {
		sessionFactory.close();
	}

	public void save(Object object) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(object);

		session.getTransaction().commit();
		session.close();

	}

	public void update(Object object) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.update(object);

		session.getTransaction().commit();
		session.close();

	}

	public void delete(Object object) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.remove(object);

		session.getTransaction().commit();
		session.close();

	}
}
