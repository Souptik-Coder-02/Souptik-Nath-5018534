package com.example.EmployeeManagementSystem.repository;


import com.example.EmployeeManagementSystem.enitity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Derived query method to find employees by name
    List<Employee> findByName(String name);

    // Derived query method to find employees by department
    List<Employee> findByDepartmentName(String departmentName);

    // Derived query method to find employees by email
    Employee findByEmail(String email);
}
