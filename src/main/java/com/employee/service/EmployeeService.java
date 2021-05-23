package com.employee.service;

import com.employee.data.model.Employee;

import java.util.List;

public interface EmployeeService {

    void createEmployee(Employee employee);

    Employee findEmployeeById(Long id);

    List<Employee> findAllEmployees();

    Employee updateEmployee(Employee employee);

    void deleteEmployeeById(Long id);
}
