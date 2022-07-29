package com.techtree.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.techtree.employee.entity.Employee;
import com.techtree.employee.response.ResponseStructure;




public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Employee findByName( final String name );
	public ResponseStructure<List<Employee>> getAllEmployee();
}
	