package main.java.Service;

import main.java.Produto;

public interface IProdutoService {
    void salvar(Produto produto);
    Produto buscarPorID(Long id);
}
