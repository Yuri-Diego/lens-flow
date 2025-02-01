package com.wnyuri.lensflow.controllers;

import com.wnyuri.lensflow.dto.MovementDTO;
import com.wnyuri.lensflow.dto.MovementSheetDTO;
import com.wnyuri.lensflow.dto.MovementWithBoxDTO;
import com.wnyuri.lensflow.entities.MovementSheet;
import com.wnyuri.lensflow.mappers.MovementSheetMapper;
import com.wnyuri.lensflow.services.MovementService;
import com.wnyuri.lensflow.services.MovementSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/movement-sheets")
public class MovementSheetController {

    @Autowired
    private MovementSheetService movementSheetService;

    @Autowired
    private MovementService movementService;

    @GetMapping("/{sheetId}/movements")
    public ResponseEntity<List<MovementWithBoxDTO>> getMovementsWithBoxBySheetId(@PathVariable Long sheetId) {
        List<MovementWithBoxDTO> movements = movementService.getMovementsWithBoxBySheetId(sheetId);
        return ResponseEntity.ok(movements);
    }

}
