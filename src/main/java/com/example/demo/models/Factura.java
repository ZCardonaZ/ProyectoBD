package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Date;

@Entity
public class Factura {
    @Id
    private String codFactura;

    @ManyToMany
    private Cliente cliente;

    private Date fechaEmision;
    private double importeTotal;


}
