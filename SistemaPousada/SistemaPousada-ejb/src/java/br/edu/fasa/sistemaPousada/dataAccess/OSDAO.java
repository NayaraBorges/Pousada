/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.IOSRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.OS;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author NAYARA
 */
@Stateless
public class OSDAO extends DAOGenerico <OS> implements IOSRepositorio{

    public OSDAO() {
        super(OS.class);
    }
    
    @Override
    public Long getID(OS obj){
        return obj.getId();
    }

    @Override
    public List<OS> listarPorStatus(boolean status) {
        Query query=(Query) manager.createQuery("select u from OS u where u.status=:p order by u.status");
        query.setParameter("p", status);
        return query.getResultList();
    }

    @Override
    public List<OS> listarPorData(Date data) {
        Query query=(Query) manager.createQuery("select u from OS u where u.data=:p order by u.data");
        query.setParameter("p", data);
        return query.getResultList();
    }

    @Override
    public List<OS> listarTodos() {
        Query query=(Query) manager.createQuery("select u from OS u");
        return query.getResultList();
    }
    
}
