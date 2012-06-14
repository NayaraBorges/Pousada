/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.IProdutoRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.Produto;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author NAYARA
 */
@Stateless
public class ProdutoDAO extends DAOGenerico<Produto> implements IProdutoRepositorio{

    public ProdutoDAO() {
    }

    @Override
    public List<Produto> listarPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
