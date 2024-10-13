package com.facturaTest.services;

import com.facturaTest.model.Factura;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacturaService {
    private List<Factura> facturas = new ArrayList<>();
    private Long nextId = 1L;

    public void agregarFactura(Factura factura) {
        factura.setId(nextId++);
        facturas.add(factura);
    }

    public List<Factura> obtenerFacturas() {
        return facturas;
    }

    public void eliminarFactura(Long id) {
        facturas.removeIf(factura -> factura.getId().equals(id));
    }
}