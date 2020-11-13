package com.paypal.bfs.test.employeeserv.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import com.paypal.bfs.test.employeeserv.api.EmployeeResource;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.api.model.EmployeeDto;
import com.paypal.bfs.test.employeeserv.repository.EmployeeRepository;

/**
 * Implementation class for employee resource.
 */
@RestController
public class EmployeeResourceImpl implements EmployeeResource {
	@Autowired
	private EmployeeRepository employeeRepository;

	ModelMapper modelMapper = new ModelMapper();

	@Override
	public EmployeeDto employeeGetById(Integer id) {
	    
	  Optional<Employee> employee = employeeRepository.findById(id);
	  
		if(employee.isPresent()) {
		    return modelMapper.map(employee.get(), EmployeeDto.class);	
		}else {
			return new EmployeeDto();
		}
	}

	@Override
	public EmployeeDto saveEmployee(EmployeeDto employee) {

		Employee savedEmployee = employeeRepository.save(modelMapper.map(employee, Employee.class));
		System.out.println(savedEmployee.toString());
		EmployeeDto emp =  modelMapper.map(savedEmployee, EmployeeDto.class);
		return emp;

	}
}
