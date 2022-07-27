package com.techtree.employee.serviceimpl;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.techtree.employee.entity.Employee;
import com.techtree.employee.repository.EmployeeRepository;
import com.techtree.employee.response.ResponseStructure;
import com.techtree.employee.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repository;

	@Override
	public ResponseEntity<ResponseStructure<List<Employee>>> getAllEmployee() {
		ResponseStructure<List<Employee>> res= new ResponseStructure<List<Employee>>();
        if(repository.findAll()!=null) {
            res.setMessage("data found");
            res.setData(repository.findAll());
            return new ResponseEntity<ResponseStructure<List<Employee>>>(res,HttpStatus.OK);
    }else {
        res.setMessage("data  not found");
        res.setData(null);
        return new ResponseEntity<ResponseStructure<List<Employee>>>(res,HttpStatus.NOT_FOUND);
    }
}
	
	@Override
	public ResponseEntity<ResponseStructure<Employee>> getById(long id) {
		ResponseStructure<Employee> response=new ResponseStructure<Employee>();
		if(repository.getById(id)!=null) {
			response.setMessage("Data is present");
			response.setOpdata(repository.findById(id));
//			response.setData(repository.getById(id));
			return new ResponseEntity<ResponseStructure<Employee>>(response,HttpStatus.OK);
		}else {
			response.setMessage("error");
			response.setOpdata(null);
//			response.setData(null);
			return new ResponseEntity<ResponseStructure<Employee>>(response,HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public void save(Employee employee) {
		repository.save(employee);
	}

	
//	
	@Override
	public List<Employee> searchEmployeeByFirstName(String Query) {
		List<Employee> employee=repository.searchEmployeeByFirstName(Query);
		return employee;
	}
	
	@Override
	public List<Employee> findByLastNameContainingIgnoreCase(String query){
		return repository.findByLastNameContainingIgnoreCase(query);
		
	}
	
@Override
public void deleteEmployeeById(long id) {
	// TODO Auto-generated method stub
	repository.deleteById(id);
}







//	return repository.findById(id).get();
	

}