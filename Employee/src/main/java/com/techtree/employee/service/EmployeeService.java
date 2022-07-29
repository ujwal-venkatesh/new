package com.techtree.employee.service;

import java.util.List;

import org.json.JSONObject;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import com.techtree.employee.entity.Employee;
import com.techtree.employee.response.ResponseStructure;

public interface EmployeeService {
	
	public void save(Employee employee);
	
	 void deleteEmployeeById(long id); 
	 
	 public ResponseStructure<List<Employee>> getAllEmployee();
	 public Employee getById(long id);
	
}