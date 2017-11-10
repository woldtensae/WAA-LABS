package mum.edu.service;

import mum.edu.domain.Employee;

public interface EmployeeService {
	Employee create(Employee employee);

	Employee read(String employeeEmail);

	void update(String employeeEmail, Employee employee);

	void delete(String employeeEmail);
}
