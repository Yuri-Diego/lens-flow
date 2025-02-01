package com.wnyuri.lensflow.repositories;

import com.wnyuri.lensflow.entities.MovementSheet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface MovementSheetRepository extends JpaRepository<MovementSheet, Long> {

    // Busca MovementSheets pela data de criacao exata
    List<MovementSheet> findByDate(LocalDate date);

}
