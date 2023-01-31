package com.devmarinhocarlos.restapi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devmarinhocarlos.restapi.entities.Employee;
import com.devmarinhocarlos.restapi.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;

	// Reading all employees
	public List<Employee> getAll() {
		return repo.findAll();
	}

	// Reading a employee by id
	public Employee getEmployee(Long id) {
		return repo.findById(id).get();
	}

	// Inserting a employee
	public void postEmployee(Employee employee) {
		repo.save(employee);
	}

	// Updating a employee by id and inserting a object
	public Employee updateEmployee(Long id, Employee employee) {
		Employee emp = repo.findById(id).get();
		emp.setName(employee.getName());
		emp.setAge(employee.getAge());
		emp.setEmail(employee.getEmail());
		emp.setPhone(employee.getPhone());
		emp.setAddress(employee.getAddress());
		return repo.save(emp);
	}

	// Deleting a employee by id
	public void deleteEmployee(Long id) {
		repo.deleteById(id);
	}

	// deleting all employees
	public void deleteEmployees() {
		repo.deleteAll();
	}
}
