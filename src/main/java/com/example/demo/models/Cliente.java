package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Cliente {
    @Id
    private String codCliente;
    private String nombres;
    private String distrito;
    private String telefono;


}
