/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.IVeiculoRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.Veiculo;
import java.util.List;
import javax.ejb.Stateless;

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
    public List<Veiculo> listarPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Veiculo> listarPorStatus(boolean status) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Veiculo> listarPorTipo(String tipo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Veiculo> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
