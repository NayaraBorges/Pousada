/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.IRepositorio;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author NAYARA
 */
public class DAOGenerico <T> implements IRepositorio <T>{

    public DAOGenerico() {
    }
    
    @PersistenceContext (name="SistemaPousada-ejbPU")
    protected EntityManager manager;

    @Override
    public void salvar(T obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public T abrir(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void apagar(T obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<T> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
