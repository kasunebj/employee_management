package com.library.lib_management_app.service;

import com.library.lib_management_app.dto.EmployeeDTO;
import com.library.lib_management_app.dto.PaginatedResponse;
import com.library.lib_management_app.entity.Employee;
import org.springframework.data.domain.Page;

public interface EmployeeService {
    Employee addEmployee(Employee employee);

    Employee updateEmployee(Long employeeId, Employee updatedEmployee);

    boolean deleteEmployee(Long id);
    PaginatedResponse<EmployeeDTO> getEmployees(int page, int size, String sortBy);
    EmployeeDTO getEmployeeById(Long id);

}

