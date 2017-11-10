package mum.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.domain.Employee;
import mum.edu.repository.EmployeeRepository;
import mum.edu.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Employee create(Employee employee) {
		return employeeRepository.create(employee);
	}

	@Override
	public Employee read(String employeeEmail) {
		return employeeRepository.read(employeeEmail);
	}

	@Override
	public void update(String employeeEmail, Employee employee) {
		employeeRepository.update(employeeEmail, employee);
	}

	@Override
	public void delete(String employeeEmail) {
		employeeRepository.delete(employeeEmail);
		
	}

}
