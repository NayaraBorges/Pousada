/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.Evento;
import br.edu.fasa.sistemaPousada.domainModel.IEventoRepositorio;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author NAYARA
 */
@Stateless
public class EventoDAO extends DAOGenerico<Evento> implements IEventoRepositorio{

    public EventoDAO() {
    }

    @Override
    public List<Evento> listarPorDescricao(String descricao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Evento> listarPorData(Date data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
