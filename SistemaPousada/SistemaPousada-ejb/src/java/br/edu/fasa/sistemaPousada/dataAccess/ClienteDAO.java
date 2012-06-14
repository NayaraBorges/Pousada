/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.Cliente;
import br.edu.fasa.sistemaPousada.domainModel.IClienteRepositorio;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author NAYARA
 */
@Stateless
public class ClienteDAO extends DAOGenerico<Cliente> implements IClienteRepositorio{

    public ClienteDAO() {
    }

    @Override
    public List<Cliente> listarPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
