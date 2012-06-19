/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.IRefeicaoRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.Refeicao;
import java.util.List;
import javax.ejb.Stateless;

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
    public List<Refeicao> listarPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Refeicao> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
