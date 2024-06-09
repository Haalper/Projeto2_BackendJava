package main.java.dao;

import main.java.Produto;

public class ProdutoDAO extends GenericDAO<Produto, Long> implements IProdutoDAO {

    @Override
    public void salvar(Produto produto) {
        super.salvar(produto.getId(), produto);
    }

    @Override
    public Produto buscarPorID(Long id) {
        return super.buscarPorID(id);
    }
}

//ClienteDAO e ProdutoDAO usam a estrutura do GenericDAO para armazenar e recuperar Cliente e Produto no mapa database,
// que simula o banco de dados.
//
//Isso é possível pois ambas as classes herdam GenericDAO.
//
//super.salvar e super.buscar chamam os respectivos métodos definidos na classe pai (GenericDAO)
// que armazena a entidade no mapa.
