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
public abstract class DAOGenerico <T> implements IRepositorio <T>{

    private Class type;
    
    @PersistenceContext(name="SistemaPousada-ejbPU")
    protected EntityManager manager;
    
    protected EntityManager getManager() {
        return manager;
    }
    
    public DAOGenerico(Class t) {
        type = t;
    }   
    
    @Override
    public boolean salvar(T obj) {
         try {
            getManager().persist(obj);
            return true;
        } catch (Exception e) {  
            e.printStackTrace();
            return false;          
        }
    }

    @Override
    public T abrir(long id) {
        return (T)getManager().find(type, id);
    }
    
    
    @Override
    public boolean apagar(T obj) {
       try {
            getManager().remove(obj);
            return true;
        } catch (Exception e) {  
            e.printStackTrace();
            return false;  
        }
    }

    @Override
    public abstract List<T> listarTodos();

    
    
}
