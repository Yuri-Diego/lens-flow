package com.wnyuri.lensflow.services;

import com.wnyuri.lensflow.dto.MovementSheetDTO;
import com.wnyuri.lensflow.entities.MovementSheet;
import com.wnyuri.lensflow.mappers.MovementSheetMapper;
import com.wnyuri.lensflow.repositories.MovementSheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public class MovementSheetService {

    @Autowired
    private MovementSheetRepository movementSheetRepository;

    @Transactional
    public List<MovementSheetDTO> getMovementSheetsByDate(LocalDate date) {
        List<MovementSheet> movementSheets = movementSheetRepository.findByDate(date);
        return movementSheets.stream().map(MovementSheetMapper::toDTO).toList();
    }
}
