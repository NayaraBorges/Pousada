/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.Evento;
import br.edu.fasa.sistemaPousada.domainModel.IEventoRepositorio;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author NAYARA
 */
@Stateless
public class EventoDAO extends DAOGenerico<Evento> implements IEventoRepositorio{

    public EventoDAO() {
        super(Evento.class);
    }
    
    @Override
    public Long getID(Evento obj){
        return obj.getId();
    }

    @Override
    public List<Evento> listarPorDescricao(String descricao) {
        Query query=(Query) manager.createQuery("select u from Evento u where u.descricao=:p order by u.descricao");
        query.setParameter("p", descricao);
        return query.getResultList();
    }

    @Override
    public List<Evento> listarPorData(Date data) {
        Query query=(Query) manager.createQuery("select u from Evento u where u.data=:p order by u.data");
        query.setParameter("p", data);
        return query.getResultList();
    }

    @Override
    public List<Evento> listarTodos() {
        Query query=(Query) manager.createQuery("select u from Evento u");
        return query.getResultList();
    }
    
}
