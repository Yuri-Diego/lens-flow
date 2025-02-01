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

    // Buscar Movement com os atributos de box pelo ID de Movement_Sheet
    public List<MovementWithBoxDTO> getMovementsWithBoxBySheetId(Long sheetId) {
        List<Movement> movements = movementRepository.findByMovementSheetId(sheetId);

        return movements.stream()
                .map(MovementWithBoxMapper::toMovementWithBoxDTO) // Usa o mapper para converter
                .toList();
    }

    public List<MovementDTO> findAllMovements() {
        List<Movement> movements = movementRepository.findAll();
        return movements.stream().map(MovementMapper::toDTO).toList();
    }

    public List<MovementWithBoxDTO> getMovementWithBoxByBoxNumber(int boxNumber) {
        List<Movement> movements = movementRepository.findByBoxNumber(boxNumber);
        return movements.stream().map(MovementWithBoxMapper::toMovementWithBoxDTO).toList();
    }

}
