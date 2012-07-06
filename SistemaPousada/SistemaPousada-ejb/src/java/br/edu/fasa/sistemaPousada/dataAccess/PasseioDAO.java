/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.IPasseioRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.Passeio;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author NAYARA
 */
@Stateless
public class PasseioDAO extends DAOGenerico <Passeio> implements IPasseioRepositorio{

    public PasseioDAO() {
        super(Passeio.class);
    }
    
    @Override
    public Long getID(Passeio obj){
        return obj.getId();
    }

    @Override
    public List<Passeio> listarPorDescricao(String descricao) {
        Query query=(Query) manager.createQuery("select u from Passeio u where u.descricao=:p order by u.descricao");
        query.setParameter("p", descricao);
        return query.getResultList();
    }

    @Override
    public List<Passeio> listarPorData(Date data) {
        Query query=(Query) manager.createQuery("select u from Passeio u where u.data=:p order by u.data");
        query.setParameter("p", data);
        return query.getResultList();
    }

    @Override
    public List<Passeio> listarTodos() {
        Query query=(Query) manager.createQuery("select u from Passeio u");
        return query.getResultList();
    }
    
}
