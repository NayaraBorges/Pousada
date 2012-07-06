/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.*;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;


/**
 *
 * @author NAYARA
 */
@Stateless
public class ItemOSDAO extends DAOGenerico<ItemOS> implements IItemOSRepositorio{

    public ItemOSDAO() {
        super(Cliente.class);
    }   
    
    @Override
    public Long getID(ItemOS obj){
        return obj.getId();
    }
    
    @Override
    public List<ItemOS> listarPorData(Date data) {
        Query query=(Query) manager.createQuery("select u from ItemOS u where u.data=:p order by u.data");
        query.setParameter("p", data);
        return query.getResultList();
    }

    @Override
    public List<ItemOS> listarPorServico(Servico servico) {
        Query query=(Query) manager.createQuery("select u from ItemOS u where u.servico=:p order by u.servico");
        query.setParameter("p", servico);
        return query.getResultList();
    }

    @Override
    public List<ItemOS> listarPorOS(OS os) {
        Query query=(Query) manager.createQuery("select u from ItemOS u where u.os=:p order by u.os");
        query.setParameter("p", os);
        return query.getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<ItemOS> listarTodos() {
        Query query=(Query) manager.createQuery("select u from ItemOS u");
        return query.getResultList();
    }
    
}
