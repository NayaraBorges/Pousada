/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.presentation.web;

import br.edu.fasa.sistemaPousada.domainModel.Chale;
import br.edu.fasa.sistemaPousada.domainModel.IChaleRepositorio;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author NAYARA
 */
@Named(value = "chale")
@SessionScoped
public class ChaleBean implements Serializable {
    @EJB
    IChaleRepositorio ejb;
    
    float preco;
    String cor;
    boolean status;
    int capacidade;
    
    public void salvar(){
        Chale cha = new Chale();
        cha.setCapacidade(capacidade);
        cha.setCor(cor);
        cha.setPreco(preco);
        cha.setStatus(status);
        //classe pai tem descricao e tipo
        ejb.salvar(cha);
    }

    
    /**
     * Creates a new instance of ChaleBean
     */
    public ChaleBean() {
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
