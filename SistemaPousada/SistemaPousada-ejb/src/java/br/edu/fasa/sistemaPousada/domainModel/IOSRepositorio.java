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
public interface IOSRepositorio extends IRepositorio <OS>{
    List<OS> listarPorStatus(boolean status);
    List<OS> listarPorData(Date data);
}
