package test.java;

import main.java.Produto;
import main.java.dao.ProdutoDAO;

public class ProdutoDaoMock extends ProdutoDAO {

    @Override
    public void salvar(Produto produto) {
        super.salvar(produto.getId(), produto);
    }

    @Override
    public Produto buscarPorID(Long id) {
        Produto produto = new Produto();
        produto.setId(id);
        return produto;
    }
}

//Esse arquivo cria um mock da classe ProdutoDAO para ser usado nos testes.