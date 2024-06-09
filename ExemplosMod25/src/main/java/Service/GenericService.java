package main.java.Service;

import main.java.Service.Identificavel;
import main.java.dao.GenericDAO;

public abstract class GenericService<T extends Identificavel, ID> {

    protected GenericDAO<T, ID> dao;
// Armazena uma instância do DAO genérico que será usada para acessar dados.

    public GenericService(GenericDAO<T, ID> dao) {
        this.dao = dao;
    }
    //construtor >> Recebe um DAO genérico e o atribui ao atributo dao.
    // o acesso de GerericService ao banco de dados simulado DAO se faz através do construtor

    public void salvar(T entity) {
        dao.salvar((ID) entity.getId(), entity);
    }


    public T buscarPorID(ID id) {
        return dao.buscarPorID(id);
    }

}


//Dao é a nossa simulação de banco de dados;
//Service é onde fica nossa lógica de negócio;


//GenericService cria uma instância do banco de dados (dao)
//essa instância do banco de dados é colocada dentro dos métodos ...
// salvar e buscarPorId através de "dao.salvar" e "dao.buscarPorID", que delegam essas respectivas funções ao DAO