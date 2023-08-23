package com.EMS.Model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EMS.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
