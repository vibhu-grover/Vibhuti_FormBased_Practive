package com.HelloWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloController {
	// Model,ModelMap and ModelandView to define a model in spring mvc
	// Model= use to add attributes to model
	// ModelMap= defines a holder for model attributes and is primarily
	// designed for adding attributes.
	// ModelAndView is a holder for both model and view

	@RequestMapping ("/hello")
	public String welcome(ModelMap model) {
		model.addAttribute("message", "hello and welcome to the project"); //name and value
		
		return("hello");
	}

}
