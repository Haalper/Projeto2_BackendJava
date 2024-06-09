package test.java;

import main.java.Cliente;
import main.java.dao.ClienteDAO;

public class ClienteDaoMock extends ClienteDAO {

    @Override
    public void salvar(Cliente cliente) {
        super.salvar(cliente.getId(), cliente);
    }

    @Override
    public Cliente buscarPorID(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }
}

//Esse arquivo cria um mock (simulação) da classe ClienteDAO para ser usado nos testes. Isso permite testar a lógica de
// serviço sem depender de uma implementação real do DAO