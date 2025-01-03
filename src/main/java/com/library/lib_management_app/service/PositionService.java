package com.library.lib_management_app.service;

import com.library.lib_management_app.dto.PositionDTO;
import com.library.lib_management_app.repositories.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PositionService {

    @Autowired
    private PositionRepository positionRepository;

    public List<PositionDTO> getAllPositions() {
        return positionRepository.findAll()
                .stream()
                .map(position -> {
                    PositionDTO dto = new PositionDTO();
                    dto.setPositionId(position.getPositionId());
                    dto.setPositionName(position.getPositionName());
                    return dto;
                })
                .collect(Collectors.toList());
    }
}

