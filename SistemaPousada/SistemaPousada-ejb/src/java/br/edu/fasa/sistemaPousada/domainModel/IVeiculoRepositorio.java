/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.domainModel;

import java.util.List;

/**
 *
 * @author NAYARA
 */
public interface IVeiculoRepositorio extends IRepositorio <Veiculo>{
    List<Veiculo> listarPorNome(String nome);
    List<Veiculo> listarPorStatus(boolean status);
    List<Veiculo> listarPorTipo(String tipo);
}
