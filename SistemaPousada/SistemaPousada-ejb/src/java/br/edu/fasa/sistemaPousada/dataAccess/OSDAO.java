/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.IOSRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.OS;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author NAYARA
 */
@Stateless
public class OSDAO extends DAOGenerico <OS> implements IOSRepositorio{

    public OSDAO() {
        super(OS.class);
    }

    @Override
    public List<OS> listarPorStatus(boolean status) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<OS> listarPorData(Date data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<OS> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
