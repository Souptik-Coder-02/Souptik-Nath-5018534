package com.example.EmployeeManagementSystem.repository;


import com.example.EmployeeManagementSystem.enitity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Derived query method to find a department by its name
    Department findByName(String name);
}
