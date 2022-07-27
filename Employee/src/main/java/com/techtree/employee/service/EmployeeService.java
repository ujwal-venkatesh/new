package com.techtree.employee.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.techtree.employee.entity.Employee;
import com.techtree.employee.response.ResponseStructure;

public interface EmployeeService {
	
	public ResponseEntity<ResponseStructure<List<Employee>>> getAllEmployee();
	
//	public ResponseStructure<Employee> getById(Long id);
	public ResponseEntity<ResponseStructure<Employee>> getById(long id);
	
	public void save(Employee employee);
	
	 void deleteEmployeeById(long id); 
	 
	List<Employee> searchEmployeeByFirstName(String Query);


	List<Employee> findByLastNameContainingIgnoreCase(String Query);
	

}