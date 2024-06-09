package main.java.Service;

import main.java.Cliente;
import main.java.Service.GenericService;
import main.java.dao.GenericDAO;
import main.java.dao.IClienteDAO;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    public ClienteService(IClienteDAO dao) {
        super((GenericDAO<Cliente, Long>) dao);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return ((IClienteDAO) dao).buscarPorCPF(cpf); // Cast para a interface específica
    }
}





//package main.java;
//
//import main.java.dao.ClienteDAO;
//import main.java.dao.IClienteDAO;
//
//public class ClienteService implements IClienteService {
//
//    private IClienteDAO clienteDAO;
//
//    public ClienteService(IClienteDAO clienteDAO) {
//        this.clienteDAO = clienteDAO;
//        //IClienteDAO clienteDAO: Este é um parâmetro do construtor. Quando uma instância de ClienteService é criada,
//        // uma implementação de IClienteDAO deve ser passada para o construtor.
//    }
//
//    @Override
//    public Boolean salvar(Cliente cliente) {
//        return clienteDAO.salvar(cliente);
//    }
//
//    @Override
//    public Cliente buscarPorCPF(Long cpf) {
//        return clienteDAO.buscarPorCPF(cpf);
//    }
//
//    @Override
//    public void excluir(Long cpf) {
//        //clienteDAO.excluir(cpf);
//    }
//}
