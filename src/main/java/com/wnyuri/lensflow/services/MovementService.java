package com.wnyuri.lensflow.services;

import com.wnyuri.lensflow.dto.MovementDTO;
import com.wnyuri.lensflow.dto.MovementWithBoxDTO;
import com.wnyuri.lensflow.entities.Movement;
import com.wnyuri.lensflow.mappers.MovementMapper;
import com.wnyuri.lensflow.mappers.MovementWithBoxMapper;
import com.wnyuri.lensflow.repositories.BoxRepository;
import com.wnyuri.lensflow.repositories.MovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MovementService {

    @Autowired
    private MovementRepository movementRepository;

    @Autowired
    private BoxRepository boxRepository;

    public List<MovementWithBoxDTO> getMovementsWithBox() {
        List<Movement> movements = movementRepository.findAll();

        return movements.stream()
                .map(MovementWithBoxMapper::toMovementWithBoxDTO) // Usa o mapper para converter
                .toList();
    }

    public List<MovementDTO> findAllMovements() {
        List<Movement> movements = movementRepository.findAll();
        return movements.stream().map(MovementMapper::toDTO).toList();
    }
}
