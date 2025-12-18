package com.example.lojaRoupa.model;

public record DadosRoupas(
        String marca,
        String tipo,
        String tamanho,
        int quantidade,
        double preco
) {
}
