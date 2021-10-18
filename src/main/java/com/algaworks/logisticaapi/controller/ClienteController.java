package com.algaworks.logisticaapi.controller;

import com.algaworks.logisticaapi.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){
        Cliente cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Joao");
        cliente1.setEmail("joao@email.com");
        cliente1.setTelefone("11999899452");

        return Arrays.asList(cliente1, cliente1);
    }
}
