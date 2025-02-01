package com.wnyuri.lensflow.repositories;

import com.wnyuri.lensflow.entities.Movement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovementRepository extends JpaRepository<Movement, Long> {
}
