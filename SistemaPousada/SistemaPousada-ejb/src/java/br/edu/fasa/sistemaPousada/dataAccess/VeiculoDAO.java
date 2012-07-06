/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.IVeiculoRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.Veiculo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author NAYARA
 */
@Stateless
public class VeiculoDAO extends DAOGenerico <Veiculo> implements IVeiculoRepositorio{

    public VeiculoDAO() {
        super(Veiculo.class);
    }
    
    @Override
    public Long getID(Veiculo obj){
        return obj.getId();
    }

    @Override
    public List<Veiculo> listarPorNome(String nome) {
        Query query=(Query) manager.createQuery("select u from Veiculo u where u.nome=:p order by u.nome");
        query.setParameter("p", nome);
        return query.getResultList();
    }

    @Override
    public List<Veiculo> listarPorStatus(boolean status) {
        Query query=(Query) manager.createQuery("select u from Veiculo u where u.status=:p order by u.status");
        query.setParameter("p", status);
        return query.getResultList();
    }

    @Override
    public List<Veiculo> listarPorTipo(String tipo) {
        Query query=(Query) manager.createQuery("select u from Veiculo u where u.tipo=:p order by u.tipo");
        query.setParameter("p", tipo);
        return query.getResultList();
    }

    @Override
    public List<Veiculo> listarTodos() {
        Query query=(Query) manager.createQuery("select u from Veiculo u");
        return query.getResultList();
    }
    
}
