/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.IRefeicaoRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.Refeicao;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author NAYARA
 */
@Stateless
public class RefeicaoDAO extends DAOGenerico<Refeicao> implements IRefeicaoRepositorio{

    public RefeicaoDAO() {
        super(Refeicao.class);
    }
    
    @Override
    public Long getID(Refeicao obj){
        return obj.getId();
    }

    @Override
    public List<Refeicao> listarPorNome(String nome) {
        Query query=(Query) manager.createQuery("select u from Refeicao u where u.nome=:p order by u.nome");
        query.setParameter("p", nome);
        return query.getResultList();
    }

    @Override
    public List<Refeicao> listarTodos() {
        Query query=(Query) manager.createQuery("select u from Refeicao u");
        return query.getResultList();
    }
    
}
