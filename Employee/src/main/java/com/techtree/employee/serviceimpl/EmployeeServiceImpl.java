package com.techtree.employee.serviceimpl;


import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.techtree.employee.entity.Employee;
import com.techtree.employee.repository.EmployeeRepository;
import com.techtree.employee.response.ResponseStructure;
import com.techtree.employee.service.EmployeeService;


@Service

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repository;

	@Override
	public void save(Employee employee) {
		repository.save(employee);
	}
	@Override
		public void deleteEmployeeById(long id) {
			repository.deleteById(id);
	}
	@Override
	public ResponseStructure<List<Employee>> getAllEmployee(){
		return repository.getAllEmployee();
	}
	public Employee getById(long id) {
		return repository.getById(id);
	}
}


	


//response.setData(repository.findAll(Sort.by(Sort.Direction.ASC,employee)));

