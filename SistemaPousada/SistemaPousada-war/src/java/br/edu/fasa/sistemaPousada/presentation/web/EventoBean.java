/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.presentation.web;

import br.edu.fasa.sistemaPousada.domainModel.Evento;
import br.edu.fasa.sistemaPousada.domainModel.IEventoRepositorio;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author NAYARA
 */
@Named(value = "evento")
@SessionScoped
public class EventoBean implements Serializable {
    @EJB
    IEventoRepositorio ejb;
    
    float preco;
    String tipo;
    String descricao;

    public void salvar(){
        Evento eve = new Evento();
        eve.setPreco(preco);
        eve.setTipo(tipo);
        eve.setDescricao(descricao);
        //descricao e tipo -> pai
        ejb.salvar(eve);
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
    
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * Creates a new instance of EventoBean
     */
    public EventoBean() {
    }
}
