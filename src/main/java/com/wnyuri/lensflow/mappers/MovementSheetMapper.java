package com.wnyuri.lensflow.mappers;

import com.wnyuri.lensflow.dto.MovementDTO;
import com.wnyuri.lensflow.dto.MovementSheetDTO;
import com.wnyuri.lensflow.entities.Box;
import com.wnyuri.lensflow.entities.Movement;
import com.wnyuri.lensflow.entities.MovementSheet;

import java.util.List;
import java.util.stream.Collectors;

public class MovementSheetMapper {

    // Converte a entidade MovementSheet para o DTO MovementSheetDTO
    public static MovementSheetDTO toDTO(MovementSheet movementSheet) {
        List<MovementDTO> movementDTOs = movementSheet.getMovements().stream()
                .map(MovementMapper::toDTO) // Usa o MovementMapper para converter cada Movement
                .collect(Collectors.toList());

        return new MovementSheetDTO(
                movementSheet.getDate(),
                movementDTOs
        );
    }

    // Converte o DTO MovementSheetDTO para a entidade MovementSheet
    public static MovementSheet toEntity(MovementSheetDTO movementSheetDTO, Box box, MovementSheet movementSheet) {
        List<Movement> movements = movementSheetDTO.movements().stream()
                .map(movementDTO -> MovementMapper.toEntity(movementDTO, box, movementSheet)) // Usa o MovementMapper para converter cada MovementDTO
                .collect(Collectors.toList());

        MovementSheet entity = new MovementSheet(
                movementSheetDTO.date(),
                movements
        );
        return entity;
    }
}
