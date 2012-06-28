/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.presentation.web;

import br.edu.fasa.sistemaPousada.domainModel.IServicoRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.Servico;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author NAYARA
 */
@Named(value = "servico")
@SessionScoped
public class ServicoBean implements Serializable {
    @EJB
    IServicoRepositorio ejb;
    
    String descricao;
    String tipo;

    public void salvar(){
        Servico ser = new Servico();
        ser.setDescricao(descricao);
        ser.setTipo(tipo);
        ejb.salvar(ser);
    }
    
    /**
     * Creates a new instance of ServicoBean
     */
    public ServicoBean() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
