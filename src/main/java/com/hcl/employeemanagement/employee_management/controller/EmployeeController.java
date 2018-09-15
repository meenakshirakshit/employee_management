package com.hcl.employeemanagement.employee_management.controller;

import com.hcl.employeemanagement.employee_management.model.Employee;
import com.hcl.employeemanagement.employee_management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employee_management/api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(value = "/")
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @GetMapping(value = "/{sapId}")
    public Optional<Employee> getEmployeeBySapID(@PathVariable Integer sapId) {
        System.out.println("sapId:" + sapId);
        return employeeRepository.findById(sapId);
    }

   /* @PostMapping(value = "/")
    public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {
        System.out.println("employee:" + employee);
        Employee savedEmployee = employeeRepository.save(employee);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{sapId}")
                .buildAndExpand(savedEmployee.getSapId()).toUri();
        return ResponseEntity.created(location).build();

    }*/

    @PostMapping(value = "/")
    public Employee createEmployee(@RequestBody Employee employee) {
        System.out.println("employee:" + employee);
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;

    }

    @PutMapping("/{sapId}")
    public Employee updateEmployee(@RequestBody Employee employee,@PathVariable Integer sapId) {
        Optional<Employee>  savedEmployee = employeeRepository.findById(sapId);
        employee.setSapId(sapId);
        return employeeRepository.save(employee);
    }

    @DeleteMapping("/{sapId}")
    public void deleteEmployee(@PathVariable Integer sapId) {
        employeeRepository.deleteById(sapId);
    }


}
