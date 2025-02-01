package com.wnyuri.lensflow.mappers;

import com.wnyuri.lensflow.dto.BoxDTO;
import com.wnyuri.lensflow.entities.Box;

public class BoxMapper {

    // Converte a entidade Box para BoxDTO
    public static BoxDTO toDTO(Box box) {
        return new BoxDTO(
                box.getId(),
                box.getNumber(),
                box.getStatus(),
                box.getColor()
        );
    }

    // Converte o DTO BoxDTO para a entidade Box
    public static Box toEntity(BoxDTO boxDTO) {
        Box box = new Box();
        box.setId(boxDTO.id());
        box.setNumber(boxDTO.number());
        box.setStatus(boxDTO.status());
        box.setColor(boxDTO.color());
        return box;
    }
}
