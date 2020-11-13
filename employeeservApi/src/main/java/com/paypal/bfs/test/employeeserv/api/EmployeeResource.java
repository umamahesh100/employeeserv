package com.paypal.bfs.test.employeeserv.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.paypal.bfs.test.employeeserv.api.model.EmployeeDto;

/**
 * Interface for employee resource operations.
 */
public interface EmployeeResource {

	/**
	 * Retrieves the {@link EmployeeDto} resource by id.
	 *
	 * @param id employee id.
	 * @return {@link EmployeeDto} resource.
	 */
	@RequestMapping(value = "/v1/bfs/employees/{id}", method = RequestMethod.GET)
	EmployeeDto employeeGetById(@PathVariable("id") Integer id);

	@RequestMapping(value = "/v1/bfs/employees", method = RequestMethod.POST)
	EmployeeDto saveEmployee(@RequestBody EmployeeDto employee);
}
