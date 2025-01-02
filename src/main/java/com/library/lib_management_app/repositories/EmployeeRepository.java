package com.library.lib_management_app.repositories;

import com.library.lib_management_app.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Custom queries can be added if necessary
}

