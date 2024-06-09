package test.java;

import main.java.Cliente;
import main.java.Service.ClienteService;
import main.java.Service.IClienteService;
import main.java.dao.IClienteDAO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteTest {

    private IClienteService clienteService;
    private Cliente cliente;

    //As variáveis privadas clienteService e cliente são declarações que permitem armazenar as instâncias dos objetos
    // IClienteService e Cliente, respectivamente.

    public ClienteTest() {
        IClienteDAO dao = new ClienteDaoMock();
        //cria a instancia do Mock fornecendo implementações concretas para os métodos declarados em IClienteDAO
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente(); // Cria uma nova instância de Cliente.
        cliente.setCpf(12345678910L); // Define o CPF do cliente.
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(119999999L);

        clienteService.salvar(cliente); // Salva o cliente usando o Service
    }

    @Test
    public void pesquisarCliente() {
        // Busca o cliente pelo CPF usando o serviço do cliente.
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

        // Verifica se o cliente consultado não é nulo.
        Assert.assertNotNull(clienteConsultado);
    }
}

//Esse arquivo testa a funcionalidade do ClienteService usando o mock ClienteDaoMock.