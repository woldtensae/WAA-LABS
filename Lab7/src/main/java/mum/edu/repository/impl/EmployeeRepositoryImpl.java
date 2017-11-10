package mum.edu.repository.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import mum.edu.domain.Employee;
import mum.edu.repository.EmployeeRepository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{
	Map<String, Employee> employeeList;
	public EmployeeRepositoryImpl() {
		employeeList = new HashMap<String, Employee>();
	}
	@Override
	public Employee create(Employee employee) {
		if(employeeList.containsKey(employee.getEmail())) {
			throw new IllegalArgumentException(String
					.format("Can not create an employee. An employee with the give id (%) aldrady exist", employee.getEmail()));
		}
		employeeList.put(employee.getEmail(),employee);
		return employee;
	}

	@Override
	public Employee read(String employeeId) {
		return employeeList.get(employeeId);
	}

	@Override
	public void update(String employeeEmail, Employee employee) {
		if(!employeeList.containsKey(employeeEmail)) {
			throw new IllegalArgumentException(String
					.format("An employee with the give email: (%) does not exist", employeeEmail));
		}
		employeeList.put(employeeEmail, employee);
	}

	@Override
	public void delete(String employeeEmail) {
		if(!employeeList.containsKey(employeeEmail)) {
			throw new IllegalArgumentException(String
					.format("An employee with the give email: (%) does not exist", employeeEmail));
		}
		employeeList.remove(employeeEmail);
	}
}
