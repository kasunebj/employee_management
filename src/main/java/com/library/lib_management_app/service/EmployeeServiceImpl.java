package com.library.lib_management_app.service;

import com.library.lib_management_app.dto.EmployeeDTO;
import com.library.lib_management_app.dto.PaginatedResponse;
import com.library.lib_management_app.entity.Employee;
import com.library.lib_management_app.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Long employeeId, Employee updatedEmployee) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);

        if (optionalEmployee.isPresent()) {
            Employee existingEmployee = optionalEmployee.get();
            existingEmployee.setFirstName(updatedEmployee.getFirstName());
            existingEmployee.setLastName(updatedEmployee.getLastName());
            existingEmployee.setEmail(updatedEmployee.getEmail());
            existingEmployee.setPhone(updatedEmployee.getPhone());
            existingEmployee.setHireDate(updatedEmployee.getHireDate());
            existingEmployee.setDepartment(updatedEmployee.getDepartment());
            existingEmployee.setPosition(updatedEmployee.getPosition());
            existingEmployee.setSalary(updatedEmployee.getSalary());

            return employeeRepository.save(existingEmployee);
        } else {
            throw new RuntimeException("Employee with ID " + employeeId + " not found.");
        }
    }

    @Override
    public boolean deleteEmployee(Long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public PaginatedResponse<EmployeeDTO> getEmployees(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        Page<Employee> employeePage = employeeRepository.findAll(pageable);

        List<EmployeeDTO> employeeDTOs = employeePage.getContent().stream()
                .map(employee -> new EmployeeDTO(
                        employee.getEmployeeId(),
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getDepartment() != null ? employee.getDepartment().getDepartmentName() : null
                ))
                .collect(Collectors.toList());

        return new PaginatedResponse<>(
                employeeDTOs,
                employeePage.getNumber(),
                employeePage.getSize(),
                employeePage.getTotalElements()
        );
    }

}

