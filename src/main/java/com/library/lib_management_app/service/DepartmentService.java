package com.library.lib_management_app.service;

import com.library.lib_management_app.dto.DepartmentDTO;
import com.library.lib_management_app.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<DepartmentDTO> getAllDepartments() {
        return departmentRepository.findAll()
                .stream()
                .map(department -> {
                    DepartmentDTO dto = new DepartmentDTO();
                    dto.setId(department.getDepartmentId());
                    dto.setName(department.getDepartmentName());
                    return dto;
                })
                .collect(Collectors.toList());
    }
}

