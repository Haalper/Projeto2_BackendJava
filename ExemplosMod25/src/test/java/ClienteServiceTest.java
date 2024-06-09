//package test.java;
//
//import main.java.Cliente;
//import main.java.ClienteService;
//import main.java.IClienteService;
//import main.java.dao.IClienteDAO;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//public class ClienteServiceTest {
//
//    private IClienteService clienteService; //dependencia do nosso servico ???
//
//    private Cliente cliente;  //mudançaA2
//
//    public ClienteServiceTest() {
//        IClienteDAO dao = new ClienteDaoMock(); //Cria uma instância de ClienteDaoMock e a passa para ClienteService.
//        clienteService = new ClienteService(dao);
//    }
//
//    // o construtor ClienteTest >> Cria uma instância de ClienteDaoMock e a passa para ClienteService.
//    //Isso permite q os métodos salvar e buscarPorCPF da ClienteService sejam testados sem acessar um banco de dados.
//
//    @Before
//    public void init() {
//        cliente = new Cliente();    //mudançaA2
//        cliente.setCpf(12345678910L);
//        cliente.setNome("Rodrigo");
//        cliente.setCidade("São Paulo");
//        cliente.setEnd("End");
//        cliente.setEstado("SP");
//        cliente.setNumero(10);
//        cliente.setTel(119999999L);
//    }
//
//    @Test
//    public void pesquisarCliente() {
//
//
//        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
//
//        Assert.assertNotNull(clienteConsultado);
//    }
//
//    @Test
//    public void salvarCliente() {
//        Boolean retorno = clienteService.salvar(cliente);
//
//        Assert.assertTrue(retorno);
//    }
//
//    @Test
//    public void excluirCliente() {
//        clienteService.excluir(cliente.getCpf());
//    }
//}
