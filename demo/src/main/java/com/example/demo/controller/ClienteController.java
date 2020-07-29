package com.example.demo.controller;

import com.example.demo.mapper.ClienteMapper;
import com.example.demo.model.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteMapper clienteMapper;

    public ClienteController(ClienteMapper clienteMapper) {
        this.clienteMapper = clienteMapper;
    }


    @GetMapping
    public ResponseEntity<List<Cliente>> getCliente(){
        return ResponseEntity.ok(clienteMapper.findAll());
    }

    @PostMapping
    public ResponseEntity<Cliente> salvarCliente(@RequestBody Cliente cliente){
        clienteMapper.salvar(cliente);
        return ResponseEntity.ok(cliente);
    }
}
