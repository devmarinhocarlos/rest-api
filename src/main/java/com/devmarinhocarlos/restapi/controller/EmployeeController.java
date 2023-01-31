package com.devmarinhocarlos.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.devmarinhocarlos.restapi.entities.Employee;
import com.devmarinhocarlos.restapi.services.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	EmployeeService empService;

	// Method to return all employees
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Employee> readEmployees() {
		return empService.getAll();
	}

	// Method to search a employee
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Employee readEmployee(@PathVariable Long id) {
		return empService.getEmployee(id);
	}

	// Method to insert a employee
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void insertEmployee(@RequestBody Employee employee) {
		empService.postEmployee(employee);
	}

	// Method to update a employee
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public void reinsertEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		empService.updateEmployee(id, employee);
	}

	// Method to remove a employee
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void removeEmployee(@PathVariable Long id) {
		empService.deleteEmployee(id);
	}

	// Method to remove all employees
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public void removeEmployee() {
		empService.deleteEmployees();
	}
}
