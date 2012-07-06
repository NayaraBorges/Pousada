/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.Funcionario;
import br.edu.fasa.sistemaPousada.domainModel.IFuncionarioRepositorio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author NAYARA
 */
@Stateless
public class FuncionarioDAO extends DAOGenerico<Funcionario> implements IFuncionarioRepositorio{

    public FuncionarioDAO() {
        super(Funcionario.class);
    }
    
    @Override
    public Long getID(Funcionario obj){
        return obj.getId();
    }

    @Override
    public List<Funcionario> listarPorNome(String nome) {
        Query query=(Query) manager.createQuery("select u from Funcionario u where u.nome=:p order by u.nome");
        query.setParameter("p", nome);
        return query.getResultList();
    }

    @Override
    public List<Funcionario> listarPorSetor(String setor) {
        Query query=(Query) manager.createQuery("select u from Funcionario u where u.setor=:p order by u.setor");
        query.setParameter("p", setor);
        return query.getResultList();
    }

    @Override
    public List<Funcionario> listarPorTurno(String turno) {
        Query query=(Query) manager.createQuery("select u from Funcionario u where u.turno=:p order by u.turno");
        query.setParameter("p", turno);
        return query.getResultList();
    }

    @Override
    public List<Funcionario> listarTodos() {
        Query query=(Query) manager.createQuery("select u from Camping u");
        return query.getResultList();
    }
    
}
