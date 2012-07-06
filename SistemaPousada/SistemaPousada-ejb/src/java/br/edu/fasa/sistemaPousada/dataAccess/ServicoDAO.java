/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.IServicoRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.Servico;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author NAYARA
 */
@Stateless
public class ServicoDAO extends DAOGenerico <Servico> implements IServicoRepositorio{

    public ServicoDAO() {
        super(Servico.class);
    }
    
    @Override
    public Long getID(Servico obj){
        return obj.getId();
    }

    @Override
    public List<Servico> listarPorDescricao(String descricao) {
        Query query=(Query) manager.createQuery("select u from Servico u where u.descricao=:p order by u.descricao");
        query.setParameter("p", descricao);
        return query.getResultList();
    }

    @Override
    public List<Servico> listarTodos() {
        Query query=(Query) manager.createQuery("select u from Servico u");
        return query.getResultList();
    }
    
}
