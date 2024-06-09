package main.java.Service;

import main.java.Produto;
import main.java.dao.ProdutoDAO;

public class ProdutoService extends main.java.Service.GenericService<Produto, Long> implements main.java.Service.IProdutoService {

    public ProdutoService(ProdutoDAO dao) {
        super(dao);
    }
}

//O ProdutoService herda de GenericService, o que significa que ele recebe e utiliza os métodos genéricos
// para salvar e buscar entidades (neste caso, Produto)  » delegando essas operações ao ProdutoDAO através do GenericService.
//
//Salvar: Quando você chama produtoService.salvar(produto), o método salvar do GenericService é chamado. Este método, por sua vez, chama dao.salvar, onde dao é a instância de ProdutoDAO passada no construtor.
//
//Buscar: Quando você chama produtoService.buscarPorID(id), o método buscarPorID do GenericService é chamado. Este método, por sua vez, chama dao.buscarPorID, onde dao é a instância de ProdutoDAO.
