/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.Funcionario;
import br.edu.fasa.sistemaPousada.domainModel.IFuncionarioRepositorio;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author NAYARA
 */
@Stateless
public class FuncionarioDAO extends DAOGenerico<Funcionario> implements IFuncionarioRepositorio{

    public FuncionarioDAO() {
        super(Funcionario.class);
    }

    @Override
    public List<Funcionario> listarPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Funcionario> listarPorSetor(String setor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Funcionario> listarPorTurno(String turno) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Funcionario> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
