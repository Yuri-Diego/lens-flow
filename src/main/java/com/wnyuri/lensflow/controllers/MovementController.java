package com.wnyuri.lensflow.controllers;

import com.wnyuri.lensflow.dto.MovementDTO;
import com.wnyuri.lensflow.dto.MovementWithBoxDTO;
import com.wnyuri.lensflow.services.MovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    // Buscar MovementWithBox por numero da box
    @GetMapping(value = "/by-box/{boxNumber}")
    public ResponseEntity<List<MovementWithBoxDTO>> findMovementWithBoxByBoxNumber(@PathVariable int boxNumber) {
        List<MovementWithBoxDTO> movements = movementService.getMovementWithBoxByBoxNumber(boxNumber);
        return new ResponseEntity<>(movements, HttpStatus.OK);
    }
}
