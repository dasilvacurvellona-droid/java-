package com.example.lojaRoupa.model;



import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// informa qual tabela do banco de dados essa classe representa
@Table(name = "roupa")

//informa que essa classe é uma entidade do JPA
//mapea a classe para uma tabela do banco de dados
@Entity (name = "roupa")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Roupa {
    @Id // informa que esse atributo é a chave primaria da tabela
     @GeneratedValue (strategy = GenerationType.IDENTITY) // informa que o banco gera o id
    private int id;
    private  String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double preco;

    public Roupa(DadosRoupas dadosRoupas) {
        this.marca = dadosRoupas.marca();
        this.tipo = dadosRoupas.tipo();
        this.tamanho = dadosRoupas.tamanho();
        this.quantidade = dadosRoupas.quantidade();
        this.preco = dadosRoupas.preco();

    }
}
