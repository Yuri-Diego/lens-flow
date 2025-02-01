package com.wnyuri.lensflow.dto;

import com.wnyuri.lensflow.entities.Box;
import org.antlr.v4.runtime.misc.NotNull;

public record BoxDTO(
        Long id,
        @NotNull int number,
        @NotNull String status,
        @NotNull String color
) {

    public static BoxDTO fromEntity(Box box) {
        return new BoxDTO(
                box.getId(),
                box.getNumber(),
                box.getStatus(),
                box.getColor()
        );
    }

    public BoxDTO(Box box) {
        this(box.getId(), box.getNumber(), box.getStatus(), box.getColor());
    }

}
