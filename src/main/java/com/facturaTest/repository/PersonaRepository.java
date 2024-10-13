package com.facturaTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.facturaTest.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Integer> {

    

}
