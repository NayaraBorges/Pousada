/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.Camping;
import br.edu.fasa.sistemaPousada.domainModel.ICampingRepositorio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author NAYARA
 */
@Stateless
public class CampingDAO extends DAOGenerico<Camping> implements ICampingRepositorio{

    public CampingDAO() {
        super(Camping.class);
    }

    @Override
    public List<Camping> listarTodos() {
        Query query=(Query) manager.createQuery("select u from Camping u");
        return query.getResultList();
    }

    @Override
    public List<Camping> listarPorStatus(boolean status) {
        Query query=(Query) manager.createQuery("select u from Camping u where u.status=:p1 order by u.descricao");
        query.setParameter("p", status);
        return query.getResultList();
    }

    @Override
    public List<Camping> listarPorLocalizacao(String localizacao) {
        Query query=(Query) manager.createQuery("select u from Camping u where u.localizacao=:p1 order by u.descricao");
        query.setParameter("p1", localizacao);
        return query.getResultList();
    }

    @Override
    public List<Camping> listarPorCapacidade(int capacidade) {
        Query query=(Query) manager.createQuery("select u from Camping u where u.capacidade=:p1 order by u.capacidade");
        query.setParameter("p1", capacidade);
        return query.getResultList();
    }

    @Override
    public Long getID(Camping obj){
        return obj.getId();
    }
    
}
