package main.java.dao;

import main.java.Produto;

public interface IProdutoDAO {
    void salvar(Produto produto);
    Produto buscarPorID(Long id);
}
