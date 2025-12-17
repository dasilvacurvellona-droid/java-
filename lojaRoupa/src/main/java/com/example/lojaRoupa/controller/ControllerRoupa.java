package com.example.lojaRoupa.controller;

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
   //Registrar uma roupa do banco
    @PostMapping
    public void CadastrarRoupa(@RequestBody String roupa) {
        System.out.println("Roupa cadastrada: " + roupa);

    }

}
