package com.techtree.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.techtree.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


	@Query(value="SELECT * FROM employee  WHERE first_name LIKE CONCAT('%',:input,'%')", nativeQuery=true)
	List<Employee> searchEmployeeByFirstName(@Param("input")String input);
	
	

	List<Employee> findByLastNameContainingIgnoreCase(String employee);

}
 