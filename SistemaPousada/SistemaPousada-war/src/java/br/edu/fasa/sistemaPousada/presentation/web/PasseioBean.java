/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.presentation.web;

import br.edu.fasa.sistemaPousada.domainModel.IPasseioRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.Passeio;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author NAYARA
 */
@Named(value = "passeio")
@SessionScoped
public class PasseioBean implements Serializable {
    @EJB
    IPasseioRepositorio ejb;
    
    float preco;
    String tipo;
    String descricao;

    public void salvar(){
        Passeio pas = new Passeio();
        pas.setPreco(preco);
        pas.setTipo(tipo);
        pas.setDescricao(descricao);
        //descricao e tipo
        ejb.salvar(pas);
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
    
    
    /**
     * Creates a new instance of PasseioBean
     */
    public PasseioBean() {
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
