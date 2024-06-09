//package test.java;
//
//import main.java.Cliente;
//import main.java.dao.ClienteDAO;
//import main.java.dao.IClienteDAO;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//public class ClienteDAOTest {
//
//    private IClienteDAO clienteDao;
//
//    private Cliente cliente;
//
//    public ClienteDAOTest() {
//        clienteDao = new ClienteDaoMock();
//    }
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
//
//        clienteDao.salvar(cliente);
//    }
//
//    @Test
//    public void pesquisarCliente() {
//        Cliente clienteConsultado = clienteDao.buscarPorCPF(cliente.getCpf());
//
//        Assert.assertNotNull(clienteConsultado);
//    }
//
//    @Test
//    public void salvarCliente() {
//        Boolean retorno = clienteDao.salvar(cliente);
//
//        Assert.assertTrue(retorno);
//    }
//
//    @Test
//    public void excluirCliente() {
//        clienteDao.excluir(cliente.getCpf());
//    }
//}
