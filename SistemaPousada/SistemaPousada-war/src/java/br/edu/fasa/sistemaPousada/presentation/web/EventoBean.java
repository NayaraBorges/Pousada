/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.presentation.web;

import br.edu.fasa.sistemaPousada.domainModel.Evento;
import br.edu.fasa.sistemaPousada.domainModel.IEventoRepositorio;
import java.io.Serializable;
import java.util.List;
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
    
    int id;
    float preco;
    String tipo;
    String descricao;
    
    List<Evento> listagem;
    Evento evento;

    public void abrir(){
        if(id > 0)
            setEvento(ejb.abrir(id));
    }
    
    public String editar(){
        abrir();
        return "salvarEvento.xhtml";
    }
    
    public String apagar(){
        abrir();
        ejb.apagar(evento);
        listagem=null;
        return "listarEvento.xhtml";
    }
    
    public void salvar(){
        abrir();
        
        if(evento == null)
            evento = new Evento();
        
        evento.setDescricao(descricao);
        evento.setPreco(preco);
        evento.setTipo(tipo);
        
        ejb.salvar(evento);
    }
    
    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Evento> getListagem() {
        return listagem;
    }

    public void setListagem(List<Evento> listagem) {
        this.listagem = listagem;
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
