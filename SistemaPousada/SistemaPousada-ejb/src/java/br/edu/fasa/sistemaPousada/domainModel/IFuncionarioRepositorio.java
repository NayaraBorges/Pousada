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
public interface IFuncionarioRepositorio extends IRepositorio <Funcionario>{
     List<Funcionario> listarPorNome(String nome);
     List<Funcionario> listarPorSetor(String setor);
     List<Funcionario> listarPorTurno(String turno);
}
