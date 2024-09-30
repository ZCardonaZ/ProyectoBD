package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity

public class DetalleFactura {
    @Id
    private String codFactura;

    @ManyToMany
    private Producto producto;

    private int cantidad;
    private double subtotal;

    // Getters y Setters
}
