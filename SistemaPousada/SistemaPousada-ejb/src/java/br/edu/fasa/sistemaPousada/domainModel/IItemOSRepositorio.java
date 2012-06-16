/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.domainModel;

import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author NAYARA
 */
@Remote
public interface IItemOSRepositorio extends IRepositorio<ItemOS>{
    List<ItemOS> listarPorData(Date data);
    List<ItemOS> listarPorServico(Servico servico);
    List<ItemOS> listarPorOS(OS os);
       
}
