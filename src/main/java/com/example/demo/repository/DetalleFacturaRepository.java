package com.example.demo.repository;

import com.example.demo.models.DetalleFactura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura, String> {
}
