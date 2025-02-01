package com.wnyuri.lensflow.mappers;

import com.wnyuri.lensflow.dto.MovementWithBoxDTO;
import com.wnyuri.lensflow.entities.Movement;

public class MovementWithBoxMapper {

    public static MovementWithBoxDTO toMovementWithBoxDTO(Movement movement) {
        return new MovementWithBoxDTO(
                movement.getClient(),
                movement.getOrder(),
                movement.isCompleted(),
                movement.getBox().getNumber(),
                movement.getBox().getColor()
        );
    }
}
