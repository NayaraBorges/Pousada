/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.domainModel;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author NAYARA
 */
@Remote
public interface IRefeicaoRepositorio extends IRepositorio <Refeicao>{
    List<Refeicao> listarPorNome(String nome);
    
}
