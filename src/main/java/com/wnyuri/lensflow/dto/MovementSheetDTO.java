package com.wnyuri.lensflow.dto;


import java.time.LocalDateTime;
import java.util.List;

public record MovementSheetDTO(
        Long id,
        LocalDateTime date,
        List<MovementDTO> movements
) {

}
