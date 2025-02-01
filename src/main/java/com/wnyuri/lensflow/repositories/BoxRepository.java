package com.wnyuri.lensflow.repositories;

import com.wnyuri.lensflow.entities.Box;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface BoxRepository extends JpaRepository<Box, Long> {

    @Query("SELECT b FROM Box b WHERE CAST(b.number AS string) LIKE %:number%")
    List<Box> findByNumberContaining(@Param("number") String number);

}
