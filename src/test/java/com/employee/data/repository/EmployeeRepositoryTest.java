package com.employee.data.repository;

import com.employee.data.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository employeeRepository;

    Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee();
    }

    @Test
    void testThatWeCanSaveEmployee(){

        employee.setFirstName("John");
        employee.setLastName("Cena");
        employee.setEmail("jc@yahoo.com");

        employeeRepository.save(employee);
        log.info("saved Employee -> {}", employee);
    }

    @Test
    void testThatWeCanGetAllEmployees(){

        List<Employee> employees = employeeRepository.findAll();
        log.info("found employees -> {}", employees);
    }


}