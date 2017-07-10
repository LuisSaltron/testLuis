package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.AuthorDAO;
import com.example.demo.model.Author;

@Controller
public class HibernateTestController {

	@RequestMapping(value = "/db", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		createAuthorEntry();
		return "db";
	}

	private void createAuthorEntry() {
		Author author = new Author();
		author.setAge(10);
		author.setName("juan");

		AuthorDAO authorDAO = new AuthorDAO();
		// en vez de pasar un author podriamps pasar solo los valores para
		// construitlo
		authorDAO.createAuthor(author);

	}
}
