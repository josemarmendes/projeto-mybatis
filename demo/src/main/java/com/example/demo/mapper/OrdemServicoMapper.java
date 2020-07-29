package com.example.demo.mapper;

import com.example.demo.model.Cliente;
import com.example.demo.model.OrdemServico;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdemServicoMapper {
    List<OrdemServico> findAll();

    List<OrdemServico> findByCliente(Cliente cliente);

    void salvarOrdemServico(OrdemServico ordemServico);

}
