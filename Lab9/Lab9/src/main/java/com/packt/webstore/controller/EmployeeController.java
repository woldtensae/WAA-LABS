package com.packt.webstore.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.packt.webstore.domain.Employee;
import com.packt.webstore.service.EmployeeService;
  

@RequestMapping({"/employees"}) 
@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
 	@RequestMapping(value={"","/list"})
	public String listEmployees(Model model) {
 		List<Employee> employees = employeeService.getAllEmployees();
 		model.addAttribute("employees", employees);
 		return "employees";
	}
	
 	@RequestMapping(value="/employeeForm")
	public String getEmployeeByNumberForm(@ModelAttribute("newEmployee") Employee newEmployee) {

  		
		return "employeeByNumberForm";
	}
 	
  	@RequestMapping(value="/employee", method=RequestMethod.POST)
	public String getEmployeeByNumber(@RequestParam("employeeNumber") int employeeNumber, Model model) {
  		System.out.println("merhawi");
  		// Replace
  		Employee employee = employeeService.getEmployeeByNumber(employeeNumber);
  		
  		model.addAttribute("employee", employee);
		return "employee";
	}

	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addNewEmployee(@ModelAttribute("newEmployee") Employee newEmployee) {
	   return "addEmployee";
	}
	   
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewEmployee(@ModelAttribute("newEmployee") Employee employeeToBeAdded) {
		employeeService.save(employeeToBeAdded);
	   	return "redirect:/employees/list";
	}
	
 
}
