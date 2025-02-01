package com.wnyuri.lensflow.dto;

import org.antlr.v4.runtime.misc.NotNull;

public record BoxDTO(
        Long id,
        @NotNull int number,
        @NotNull String status,
        @NotNull String color
) {

}
