package test.java;

import main.java.Produto;
import main.java.Service.IProdutoService;
import main.java.Service.ProdutoService;
import main.java.dao.ProdutoDAO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProdutoTest {

    private IProdutoService produtoService;
    private Produto produto;

    public ProdutoTest() {
        ProdutoDAO dao = new ProdutoDaoMock();
        produtoService = new ProdutoService(dao);
    }

    @Before
    public void init() {
        produto = new Produto();
        produto.setId(1L);
        produto.setNome("Produto 1");
        produto.setPreco(10.0);

        produtoService.salvar(produto);
    }

    @Test
    public void pesquisarProduto() {
        Produto produtoConsultado = produtoService.buscarPorID(produto.getId());
        Assert.assertNotNull(produtoConsultado);
    }
}

//Esse arquivo testa a funcionalidade do ProdutoService usando o mock ProdutoDaoMock.