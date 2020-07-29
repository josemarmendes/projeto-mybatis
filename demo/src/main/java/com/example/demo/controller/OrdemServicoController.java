package com.example.demo.controller;

import com.example.demo.mapper.OrdemServicoMapper;
import com.example.demo.model.OrdemServico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordemservico")
public class OrdemServicoController {

    private final OrdemServicoMapper ordemServicoMapper;

    public OrdemServicoController(OrdemServicoMapper ordemServicoMapper) {
        this.ordemServicoMapper = ordemServicoMapper;
    }

    @GetMapping
    public ResponseEntity<List<OrdemServico>> listarOrdemServico() {
        return ResponseEntity.ok(ordemServicoMapper.findAll());
    }

    @PostMapping
    public ResponseEntity<OrdemServico> salvarOrdemServico(@RequestBody OrdemServico ordemServico) {

        ordemServicoMapper.salvarOrdemServico(ordemServico);
        return ResponseEntity.ok(ordemServico);

    }
}
