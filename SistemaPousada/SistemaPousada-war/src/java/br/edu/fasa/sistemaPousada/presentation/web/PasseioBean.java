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
import java.util.List;
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
    
    int id;
    float preco;
    String tipo;
    String descricao;
    
    List<Passeio> listagem;
    Passeio passeio;
    
    public void abrir(){
        if(id > 0)
            setPasseio(ejb.abrir(id));
    }
    
    public String editar(){
        abrir();
        return "salvarPasseio.xhtml";
    }
    
    public String apagar(){
        abrir();
        ejb.apagar(passeio);
        listagem=null;
        return "listarPasseio.xhtml";
    }
    
    public void salvar(){
        abrir();
        
        if(passeio == null)
            passeio = new Passeio();
        
        passeio.setPreco(preco);
        passeio.setTipo(tipo);
        passeio.setDescricao(descricao);
        
        ejb.salvar(passeio);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Passeio> getListagem() {
        return listagem;
    }

    public void setListagem(List<Passeio> listagem) {
        this.listagem = listagem;
    }

    public Passeio getPasseio() {
        return passeio;
    }

    public void setPasseio(Passeio passeio) {
        this.passeio = passeio;
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
