package com.library.lib_management_app.controller;

import com.library.lib_management_app.dto.DepartmentDTO;
import com.library.lib_management_app.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Frontend origin
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/api/departments")
    public List<DepartmentDTO> getDepartments() {
        return departmentService.getAllDepartments();
    }
}

