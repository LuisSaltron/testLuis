package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("numer1", "1");
		model.addAttribute("numer2","2");
		return "test/test";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public ModelAndView printWelcome(@RequestParam("paramNum1") String num1, @RequestParam("paramNum2") String num2) {
		Long sum=Long.valueOf(num1)+Long.valueOf(num2);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("sumResult",sum);
		modelAndView.addObject("numer1",num1);
		modelAndView.addObject("numer2",num2);
		modelAndView.setViewName("test/test");
		return modelAndView;
	}
}