package main.java;

import main.java.Service.Identificavel;

public class Produto implements Identificavel {

    private Long id;
    private String nome;
    private Double preco;


    public Long getId() {
        return id;
    }

    // Getters e Setters

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
