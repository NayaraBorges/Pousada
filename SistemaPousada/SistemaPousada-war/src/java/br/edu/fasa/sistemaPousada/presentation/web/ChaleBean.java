/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.presentation.web;

import br.edu.fasa.sistemaPousada.domainModel.Chale;
import br.edu.fasa.sistemaPousada.domainModel.IChaleRepositorio;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author NAYARA
 */
@Named(value = "chale")
@SessionScoped
public class ChaleBean implements Serializable {
    @EJB
    IChaleRepositorio ejb;
    
    int id;
    float preco;
    String cor;
    boolean status;
    int capacidade;
    String tipo;
    String descricao;
    
    List<Chale> listagem;
    Chale chale;
    
    public void abrir(){
        if(id > 0)
            setChale(ejb.abrir(id));
    }
    
    public String editar(){
        abrir();
        return "salvarChale.xhtml";
    }
    
    public String apagar(){
        abrir();
        ejb.apagar(chale);
        listagem=null;
        return "listarChale.xhtml";
    }
    
    public void salvar(){
        abrir();
        
        if(chale == null)
            chale = new Chale();
        
        chale.setCapacidade(capacidade);
        chale.setCor(cor);
        chale.setPreco(preco);
        chale.setStatus(status);
        chale.setTipo(tipo);
        chale.setDescricao(descricao);
        
        ejb.salvar(chale);
    }

    
    
    public Chale getChale() {
        return chale;
    }

    public void setChale(Chale chale) {
        this.chale = chale;
    }

    public List<Chale> getListagem() {
        return listagem;
    }

    public void setListagem(List<Chale> listagem) {
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
       
    /**
     * Creates a new instance of ChaleBean
     */
    public ChaleBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
