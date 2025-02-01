package com.wnyuri.lensflow.dto;

public record MovementWithBoxDTO(
        String client,
        String order,
        boolean completed,
        int boxNumber,
        String boxColor
) {
}
