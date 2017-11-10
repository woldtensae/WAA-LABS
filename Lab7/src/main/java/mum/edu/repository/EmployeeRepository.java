package mum.edu.repository;

import mum.edu.domain.Employee;

public interface EmployeeRepository {
	Employee create(Employee employee);

	Employee read(String employeeId);

	void update(String employeeId, Employee employee);

	void delete(String employeeId);
}
