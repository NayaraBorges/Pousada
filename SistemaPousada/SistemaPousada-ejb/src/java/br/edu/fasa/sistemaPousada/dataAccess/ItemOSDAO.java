/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.dataAccess;

import br.edu.fasa.sistemaPousada.domainModel.*;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author NAYARA
 */
@Stateless
public class ItemOSDAO extends DAOGenerico<ItemOS> implements IItemOSRepositorio{

    public ItemOSDAO() {
        super(Cliente.class);
    }   
    
    @Override
    public Long getID(ItemOS obj){
        return obj.getId();
    }
    
    @Override
    public List<ItemOS> listarPorData(Date data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<ItemOS> listarPorServico(Servico servico) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<ItemOS> listarPorOS(OS os) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<ItemOS> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
