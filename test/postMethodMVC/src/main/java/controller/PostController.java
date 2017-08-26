package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView printWelcome(ModelAndView model) {
		model.setViewName("index");
		model.addObject("numer1","1");
		model.addObject("numer2", "2");
		return model;
	}
	
	@RequestMapping(value="/",method= RequestMethod.POST)
	public ModelAndView mathOperation(@RequestParam("numer1") int num1, @RequestParam("numer2") int num2) {
		ModelAndView view=new ModelAndView();
		int suma;
		suma=num1+num2;
		view.setViewName("index");
		view.addObject("numer1",num1);
		view.addObject("numer2",num2);
		view.addObject("suma",suma);
		return view;
	}
}
