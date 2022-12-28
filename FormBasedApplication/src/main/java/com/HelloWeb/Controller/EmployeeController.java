package com.HelloWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.HelloWeb.pojo.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping("/registrationForm")
	public String showRegistrationForm(Model theModel) {

		Employee employee = new Employee();

		theModel.addAttribute("employeeModel", employee);
		return "employee-form";
	}

	// @ModelAttribute annotation refer to the property of the model object and is
	// is used to prepare the model data. This annotation bind a method variable
	// or the model object to a named model attribute.
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("employeeModel") Employee employee) {
		return "registration-confirmation";
	}

}
