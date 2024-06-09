package main.java.dao;

import main.java.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

    @Override
    public void salvar(Cliente cliente) {
        super.salvar(cliente.getId(), cliente);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return super.buscarPorID(cpf);
    }
}

//ClienteDAO e ProdutoDAO usam a estrutura do GenericDAO para armazenar e recuperar Cliente e Produto no mapa database,
// que simula o banco de dados.
//
//Isso é possível pois ambas as classes herdam GenericDAO.
//
//super.salvar e super.buscar chamam os respectivos métodos definidos na classe pai (GenericDAO)
// que armazena a entidade no mapa.
