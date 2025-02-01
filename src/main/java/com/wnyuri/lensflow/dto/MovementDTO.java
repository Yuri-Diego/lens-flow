package com.wnyuri.lensflow.dto;


import java.time.LocalDateTime;

public record MovementDTO(
        Long id,
        Long boxId, // Representa o ID da entidade Box
        Long movementSheetId, // Representa o ID da entidade MovementSheet
        String client,
        String order,
        boolean completed,
        LocalDateTime time
) {

}
