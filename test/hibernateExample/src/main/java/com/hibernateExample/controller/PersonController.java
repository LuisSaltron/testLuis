package com.hibernateExample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hibernateExample.dao.PersonDAO;
import com.hibernateExample.model.Person;

@Controller
public class PersonController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView printWelcome(ModelAndView model) {
		createPersonEntry();
		model.setViewName("person");
		return model;
	}

	private void createPersonEntry() {
		Person person = new Person();
		person.setName("Carlos Romero");
		person.setCountry("Colombia");

		PersonDAO personDao = new PersonDAO();
		// en vez de pasar un author podriamps pasar solo los valores para
		// construitlo
		personDao.save(person);
	}
	
}
