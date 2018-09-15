package com.hcl.employeemanagement.employee_management.repository;

import com.hcl.employeemanagement.employee_management.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
