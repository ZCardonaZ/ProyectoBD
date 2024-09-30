package com.example.demo.service;

import com.example.demo.models.Cliente;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente updateCliente(String codCliente, Cliente clienteDetails) {
        Optional<Cliente> optionalCliente = clienteRepository.findById(codCliente);
        if (optionalCliente.isPresent()) {
            Cliente cliente = optionalCliente.get();
            cliente.setNombres(clienteDetails.getNombres());
            cliente.setDistrito(clienteDetails.getDistrito());
            cliente.setTelefono(clienteDetails.getTelefono());
            return clienteRepository.save(cliente);
        } else {
            throw new RuntimeException("Cliente no encontrado con el código: " + codCliente);
        }
    }

    public void deleteCliente(String codCliente) {
        if (clienteRepository.existsById(codCliente)) {
            clienteRepository.deleteById(codCliente);
        } else {
            throw new RuntimeException("Cliente no encontrado con el código: " + codCliente);
        }
    }
}
