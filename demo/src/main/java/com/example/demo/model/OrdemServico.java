package com.example.demo.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrdemServico {
    private Long id;

    private Cliente cliente;

    private String descricao;

    private BigDecimal preco;


}
