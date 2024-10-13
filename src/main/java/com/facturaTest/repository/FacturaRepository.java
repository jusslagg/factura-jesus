package com.facturaTest.repository;

import java.util.List;

import com.facturaTest.model.Factura;

public interface FacturaRepository {

    Factura save(Factura factura);

    void deleteById(int id);

    List<Factura> findAll();

    Object findById(int id);

    void deleteById(Long id);

}
