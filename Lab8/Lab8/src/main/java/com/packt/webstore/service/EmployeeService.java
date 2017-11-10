package com.packt.webstore.service;

import java.util.List;

import com.packt.webstore.domain.Employee;

public interface EmployeeService {
	public Employee save(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeByNumber(int employeeNumber); 
	
}
