package com.facturaTest.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.facturaTest.model.Factura;
import com.facturaTest.repository.FacturaRepository;

@Service
public class FacturaService {
    
    @Autowired
    private FacturaRepository facturaRepository;

    public Factura obteneFacturaPorId(int id) {
        return (Factura) facturaRepository.findById(id);
    }

    public List<Factura> obtenerFactura() {
    return facturaRepository.findAll();
    }

    public Factura agregarUna(Factura factura) {
        return facturaRepository.save(factura);
    }

    public void eliminarFactura(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'eliminarFactura'");
    }

}