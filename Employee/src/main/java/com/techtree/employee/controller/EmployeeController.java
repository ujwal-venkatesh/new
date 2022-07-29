 package com.techtree.employee.controller;

import java.util.List;
//import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techtree.employee.entity.Employee;
import com.techtree.employee.response.ResponseStructure;
import com.techtree.employee.serviceimpl.EmployeeServiceImpl;

@RestController
@RequestMapping(value="/Employee")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl service; 
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee employee) {
		service.save(employee);
		return employee;
	}
	
	@GetMapping("/getList")
	public ResponseStructure<List<Employee>> getAllEmployee(@RequestBody Employee employee){
		return service.getAllEmployee();
	}

	@GetMapping("/getEmployee/{id}")
    public Employee getById(@PathVariable("id") long id, @RequestBody Employee employee) {
		return service.getById(id);
	}

	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployeeById(@PathVariable (value="id") long id) {
		service.deleteEmployeeById(id);
		return "Deleted Successfully id = "+id;	
	}
}