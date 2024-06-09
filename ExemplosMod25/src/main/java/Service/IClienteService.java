package main.java.Service;

import main.java.Cliente;

public interface IClienteService {
    void salvar(Cliente cliente);
    Cliente buscarPorCPF(Long cpf);
}




