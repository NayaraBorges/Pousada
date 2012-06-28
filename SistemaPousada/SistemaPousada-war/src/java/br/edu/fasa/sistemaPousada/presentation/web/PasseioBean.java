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

    public void salvar(){
        Passeio pas = new Passeio();
        pas.setPreco(preco);
        //descricao e tipo
        ejb.salvar(pas);
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
