package com.example.lojaRoupa.controller;

import com.example.lojaRoupa.model.DadosRoupas;
import com.example.lojaRoupa.model.Roupa;
import com.example.lojaRoupa.model.RoupaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//Controller - Respnsavel por receber as requisições em HTPP
//Rest- API rest

// Funcionanmento do REST - ela usa metodos HTTP para realizar operaçoes
//Metodo get - Busca informçoes - dados
//Metodo post - Cria informações - dados
//Metodo put - Atualiza informações - dados
//Metodo delete - Remove informações - dados
@RestController
//Nosso controller terá o seguinte endpoint
//httpt://localhost:8080/roupas
@RequestMapping("/roupas") // Define a URL do controller
@CrossOrigin(origins = "*") // Permite requisições de qualquer origem
public class ControllerRoupa {
    @Autowired
    private RoupaRepository roupaRepository;
   //Registrar uma roupa do banco
    @PostMapping
    public void CadastrarRoupa(@RequestBody DadosRoupas dadosRoupas) {
        roupaRepository.save(new Roupa(dadosRoupas));
        System.out.println("Roupa cadastrada: " + dadosRoupas);

    }

}
