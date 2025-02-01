package com.wnyuri.lensflow.services;

import com.wnyuri.lensflow.dto.BoxDTO;
import com.wnyuri.lensflow.dto.BoxUpdateDTO;
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

    // Implementacao para barra de busca por Numero da Box
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

    // Criar Box
    public BoxDTO create(BoxDTO boxDTO) {
        Box box = new Box();
        box.setNumber(boxDTO.number());
        box.setStatus("Free");
        box.setColor(boxDTO.color());

        box = boxRepository.save(box);

        return BoxMapper.toDTO(box);
    }

    // Atualiza uma Box pelo ID
    @Transactional
    public BoxDTO updateBoxById(Long id, BoxUpdateDTO updateBoxDTO) {
        Box box = boxRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Box não encontrada com o ID: " + id));

        updateBoxAttributes(box, updateBoxDTO); // Atualiza os atributos
        box = boxRepository.save(box); // Salva as alteracoes

        return BoxMapper.toDTO(box); // Retorna o DTO
    }

    // Metodo auxiliar para atualizar os atributos da Box
    private void updateBoxAttributes(Box box, BoxUpdateDTO updateBoxDTO) {
        if (updateBoxDTO.status() != null) {
            box.setStatus(updateBoxDTO.status());
        }
        if (updateBoxDTO.color() != null) {
            box.setColor(updateBoxDTO.color());
        }
    }

    @Transactional
    public void deleteBoxById(Long id) {
        Box box = boxRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Box não encontrada com o ID: " + id));

        boxRepository.delete(box); // Deleta a Box
    }


}
