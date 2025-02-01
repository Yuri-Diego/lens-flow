package com.wnyuri.lensflow.mappers;

import com.wnyuri.lensflow.dto.MovementDTO;
import com.wnyuri.lensflow.entities.Box;
import com.wnyuri.lensflow.entities.Movement;
import com.wnyuri.lensflow.entities.MovementSheet;

public class MovementMapper {

    public static MovementDTO toDTO(Movement movement) {
        return new MovementDTO(
                movement.getId(),
                movement.getBox().getId(), // Obtém o ID da entidade Box
                movement.getMovementSheet().getId(), // Obtém o ID da entidade MovementSheet
                movement.getClient(),
                movement.getOrder(),
                movement.isCompleted(),
                movement.getTime()
        );
    }

    public static Movement toEntity(MovementDTO movementDTO, Box box, MovementSheet movementSheet) {
        Movement movement = new Movement(
                box,
                movementSheet,
                movementDTO.client(),
                movementDTO.order()
        );
        movement.setId(movementDTO.id()); // Define o ID, se necessário
        movement.setCompleted(movementDTO.completed());
        movement.setTime(movementDTO.time());
        return movement;
    }
}
