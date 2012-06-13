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
public interface IFornecedorRepositorio extends IRepositorio <Fornecedor>{
    List<Fornecedor> listarPorNome(String nome);
    List<Fornecedor> listarPorRazao_social(String razao_social);
    List<Fornecedor> listarPorCnpj(String cnpj);
    List<Fornecedor> listarPorInsc_estadual(String insc_estadual);
}
