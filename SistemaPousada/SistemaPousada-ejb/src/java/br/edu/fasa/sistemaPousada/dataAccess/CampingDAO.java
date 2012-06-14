/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.Camping;
import br.edu.fasa.sistemaPousada.domainModel.ICampingRepositorio;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author NAYARA
 */
@Stateless
public class CampingDAO extends DAOGenerico<Camping> implements ICampingRepositorio{

    public CampingDAO() {
    }

    @Override
    public List<Camping> listarPorStatus(boolean status) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Camping> listarPorLocalizacao(String localizacao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Camping> listarPorCapacidade(int capacidade) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
