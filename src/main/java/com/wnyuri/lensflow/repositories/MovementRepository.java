package com.wnyuri.lensflow.repositories;

import com.wnyuri.lensflow.entities.Movement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovementRepository extends JpaRepository<Movement, Long> {

    List<Movement> findByMovementSheetId(Long sheetId);

    List<Movement> findByBoxNumber(int boxNumber);

}
