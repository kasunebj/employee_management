package com.library.lib_management_app.controller;

import com.library.lib_management_app.dto.PositionDTO;
import com.library.lib_management_app.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Frontend origin
public class PositionController {

    @Autowired
    private PositionService positionService;

    @GetMapping("/api/positions")
    public List<PositionDTO> getPositions() {
        return positionService.getAllPositions();
    }
}

