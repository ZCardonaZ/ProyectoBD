package com.example.demo.controller;

import com.example.demo.models.Cliente;
import com.example.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;


    @PutMapping("/{codCliente}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable String codCliente, @RequestBody Cliente clienteDetails) {
        Cliente updatedCliente = clienteService.updateCliente(codCliente, clienteDetails);
        return new ResponseEntity<>(updatedCliente, HttpStatus.OK);
    }


    @DeleteMapping("/{codCliente}")
    public ResponseEntity<Void> deleteCliente(@PathVariable String codCliente) {
        clienteService.deleteCliente(codCliente);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
