/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.Fornecedor;
import br.edu.fasa.sistemaPousada.domainModel.IFornecedorRepositorio;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author NAYARA
 */
@Stateless
public class FornecedorDAO extends DAOGenerico<Fornecedor> implements IFornecedorRepositorio{

    public FornecedorDAO() {
    }

    @Override
    public List<Fornecedor> listarPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Fornecedor> listarPorRazao_social(String razao_social) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Fornecedor> listarPorCnpj(String cnpj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Fornecedor> listarPorInsc_estadual(String insc_estadual) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
