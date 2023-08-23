package com.EMS.Service;

import java.util.List;

import com.EMS.Entity.Employee;

public interface EmployeeService {

	// to view all records
	public List<Employee> findAllEmployees();

	// to insert a record
	Employee saveEmployee(Employee employee);

	// to update a record
	Employee findEmployeeById(Long id);

	Employee updateEmployee(Employee employee);

	// to delete a record
	void deleteEmployeeById(Long id);

}
