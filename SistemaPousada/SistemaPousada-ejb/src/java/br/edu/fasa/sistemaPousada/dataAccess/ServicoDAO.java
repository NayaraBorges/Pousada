/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.IServicoRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.Servico;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author NAYARA
 */
@Stateless
public class ServicoDAO extends DAOGenerico <Servico> implements IServicoRepositorio{

    public ServicoDAO() {
    }

    @Override
    public List<Servico> listarPorDescricao(String descricao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}