package main.java.dao;

import main.java.Cliente;

public interface IClienteDAO {
    void salvar(Cliente cliente);
    Cliente buscarPorCPF(Long cpf);
}
