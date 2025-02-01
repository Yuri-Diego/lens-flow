package com.wnyuri.lensflow.services;

import com.wnyuri.lensflow.dto.BoxDTO;
import com.wnyuri.lensflow.entities.Box;
import com.wnyuri.lensflow.mappers.BoxMapper;
import com.wnyuri.lensflow.repositories.BoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BoxService {

    @Autowired
    private BoxRepository boxRepository;

    @Transactional(readOnly = true)
    public List<BoxDTO> findAll(){
        List<Box> boxes = boxRepository.findAll();
        return boxes.stream().map(BoxMapper::toDTO).toList();
    }

    // IMPLEMENTACAO PARA BARRA DE BUSCA POR NUMERO
    @Transactional(readOnly = true)
    public List<BoxDTO> findByNumberContaining(String number) {
        return boxRepository.findByNumberContaining(number)
                .stream()
                .map(box -> new BoxDTO(
                        box.getId(),
                        box.getNumber(),
                        box.getStatus(),
                        box.getColor()
                ))
                .toList();
    }

}
