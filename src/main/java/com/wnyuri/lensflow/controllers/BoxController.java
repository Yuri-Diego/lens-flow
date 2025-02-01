package com.wnyuri.lensflow.controllers;

import com.wnyuri.lensflow.dto.BoxDTO;
import com.wnyuri.lensflow.dto.BoxUpdateDTO;
import com.wnyuri.lensflow.entities.Box;
import com.wnyuri.lensflow.services.BoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/boxes")
public class BoxController {

    @Autowired
    private BoxService boxService;

    @GetMapping()
    public ResponseEntity<List<BoxDTO>> findAll() {
        List<BoxDTO> boxes = boxService.findAll();
        return ResponseEntity.ok(boxes);
    }

    // Pesquisar BOX por numero usando LIKE
    @GetMapping("/search")
    public ResponseEntity<List<BoxDTO>> findByNumberContaining(@RequestParam String number) {
        List<BoxDTO> boxes = boxService.findByNumberContaining(number);
        return ResponseEntity.ok(boxes);
    }

    @PostMapping
    public ResponseEntity<BoxDTO> createBox(@RequestBody BoxDTO createBoxDTO) {
        BoxDTO box = boxService.create(createBoxDTO);
        return ResponseEntity.ok(box);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<BoxDTO> updateBox(@PathVariable Long id, @RequestBody BoxUpdateDTO updateBoxDTO) {
        BoxDTO box = boxService.updateBoxById(id, updateBoxDTO);
        return ResponseEntity.ok(box);
    }

    // Deleta uma Box pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBoxById(@PathVariable Long id) {
        boxService.deleteBoxById(id);
        return ResponseEntity.noContent().build(); // Retorna 204 No Content
    }

}
