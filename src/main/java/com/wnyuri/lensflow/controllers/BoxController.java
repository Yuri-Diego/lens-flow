package com.wnyuri.lensflow.controllers;

import com.wnyuri.lensflow.dto.BoxDTO;
import com.wnyuri.lensflow.services.BoxService;
import org.springframework.beans.factory.annotation.Autowired;
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

    // Pesquisar por número usando LIKE
    @GetMapping("/search")
    public ResponseEntity<List<BoxDTO>> findByNumberContaining(@RequestParam String number) {
        List<BoxDTO> boxes = boxService.findByNumberContaining(number);
        return ResponseEntity.ok(boxes);
    }

}
