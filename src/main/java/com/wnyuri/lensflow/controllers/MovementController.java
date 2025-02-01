package com.wnyuri.lensflow.controllers;

import com.wnyuri.lensflow.dto.MovementDTO;
import com.wnyuri.lensflow.services.MovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/movements")
public class MovementController {

    @Autowired
    private MovementService movementService;

    @GetMapping
    public ResponseEntity<List<MovementDTO>> findAll() {
        List<MovementDTO> movements = movementService.findAllMovements();
        return new ResponseEntity<>(movements, HttpStatus.OK);
    }
}
