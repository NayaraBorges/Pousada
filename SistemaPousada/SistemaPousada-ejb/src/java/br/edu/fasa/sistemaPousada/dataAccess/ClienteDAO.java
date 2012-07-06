/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.Chale;
import br.edu.fasa.sistemaPousada.domainModel.Cliente;
import br.edu.fasa.sistemaPousada.domainModel.IClienteRepositorio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author NAYARA
 */
@Stateless
public class ClienteDAO extends DAOGenerico<Cliente> implements IClienteRepositorio{

    public ClienteDAO() {
        super(Cliente.class);
    }
    
    @Override
    public Long getID(Cliente obj){
        return obj.getId();
    }

    @Override
    public List<Cliente> listarPorNome(String nome) {
        Query query=(Query) manager.createQuery("select u from Cliente u where u.nome=:p order by u.nome");
        query.setParameter("p", nome);
        return query.getResultList();
    }

    @Override
    public List<Cliente> listarTodos() {
        Query query=(Query) manager.createQuery("select u from Cliente u");
        return query.getResultList();
    }
    
    
    
}
