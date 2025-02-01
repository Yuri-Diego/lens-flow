package com.wnyuri.lensflow.dto;


import java.time.LocalDate;
import java.util.List;

public record MovementSheetDTO(
        Long id,
        LocalDate date,
        List<MovementDTO> movements
) {

}
