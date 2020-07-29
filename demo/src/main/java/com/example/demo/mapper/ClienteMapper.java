package com.example.demo.mapper;

import com.example.demo.model.Cliente;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClienteMapper {
    List<Cliente> findAll();
    void salvar(Cliente cliente);

}
