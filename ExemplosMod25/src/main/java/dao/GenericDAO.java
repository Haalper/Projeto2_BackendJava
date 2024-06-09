package main.java.dao;

import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO<T, ID> {

    protected Map<ID, T> database = new HashMap<>();
    //Cria um mapa protegido chamado database que simula o banco de dados.

    public void salvar(ID id, T entity) {
        database.put(id, entity);
    }

    public T buscarPorID(ID id) {
        return database.get(id);
    }
}
