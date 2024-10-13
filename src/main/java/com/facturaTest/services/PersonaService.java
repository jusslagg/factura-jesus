package com.facturaTest.services;
import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.beans.factory.annotation.Autowired;
import com.facturaTest.model.Persona;
import com.facturaTest.repository.PersonaRepository;
import com.facturaTest.repository.FacturaRepository;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import scala.util.control.Exception;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;


    public List<Persona> obtenerPersona() {
        return personaRepository.findAll();
    }

    public Persona obtenerPersonaPorId(int id) {
        return personaRepository.findById(id).orElse(null);
    }

    public void eliminarPersona(int id) {
        personaRepository.deleteById(id);
    }

    public void agregarUnaPersona(Persona persona) {
        this.personaRepository.save(persona);
    }

}