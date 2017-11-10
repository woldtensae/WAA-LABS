package mum.edu.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import mum.edu.domain.Employee;
import mum.edu.service.EmployeeService;
 
@RequestMapping("/employee")
@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public @ResponseBody Employee addEmployee(@Valid @RequestBody Employee employee) {
		
		return employeeService.create(employee);
	}
	@RequestMapping("/read/{employeeEmail}")
	public @ResponseBody Employee getEmployee(@PathVariable(value="employeeEmail") String employeeEmail) {
		return employeeService.read(employeeEmail);
	}
	@RequestMapping("/update/{employeeEmail}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deleteEmployee(@RequestBody Employee employee, 
			@PathVariable(value="employeeEmail") String employeeEmail) {
	     employeeService.update(employeeEmail, employee);
	}
	
	@RequestMapping("/delete/{employeeEmail}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deleteEmployee(@PathVariable(value="employeeEmail") String employeeEmail) {
	     employeeService.delete(employeeEmail);
	}
}
