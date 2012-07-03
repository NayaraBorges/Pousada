/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.Chale;
import br.edu.fasa.sistemaPousada.domainModel.IChaleRepositorio;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author NAYARA
 */
@Stateless
public class ChaleDAO extends DAOGenerico<Chale> implements IChaleRepositorio{

    public ChaleDAO() {
        super(Chale.class);
    }
    
    @Override
    public Long getID(Chale obj){
        return obj.getId();
    }

    @Override
    public List<Chale> listarPorDescricao(String descricao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Chale> listarPorStatus(boolean status) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Chale> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
