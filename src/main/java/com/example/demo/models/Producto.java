package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Producto {

    @Id
    private String codProducto;
    private String descripcion;
    private double precioUnitario;
}
