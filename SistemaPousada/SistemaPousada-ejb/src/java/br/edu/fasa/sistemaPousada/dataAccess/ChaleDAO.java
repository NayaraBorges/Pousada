/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.Chale;
import br.edu.fasa.sistemaPousada.domainModel.IChaleRepositorio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author NAYARA
 */
@Stateless
public class ChaleDAO extends DAOGenerico<Chale> implements IChaleRepositorio{

    public ChaleDAO() {
        super(Chale.class);
    }
    
    @Override
    public Long getID(Chale obj){
        return obj.getId();
    }

    @Override
    public List<Chale> listarPorDescricao(String descricao) {
        Query query=(Query) manager.createQuery("select u from Chale u where u.descricao=:p order by u.descricao");
        query.setParameter("p", descricao);
        return query.getResultList();
    }

    @Override
    public List<Chale> listarPorStatus(boolean status) {
        Query query=(Query) manager.createQuery("select u from Chale u where u.status=:p1 order by u.status");
        query.setParameter("p", status);
        return query.getResultList();
    }

    @Override
    public List<Chale> listarTodos() {
        Query query=(Query) manager.createQuery("select u from Chale u");
        return query.getResultList();
    }
    
}
