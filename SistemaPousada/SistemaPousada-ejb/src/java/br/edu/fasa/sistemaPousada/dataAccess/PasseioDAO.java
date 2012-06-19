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
    public List<Passeio> listarPorDescricao(String descricao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Passeio> listarPorData(Date data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Passeio> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
