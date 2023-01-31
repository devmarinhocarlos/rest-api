package com.devmarinhocarlos.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devmarinhocarlos.restapi.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
