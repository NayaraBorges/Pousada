/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.presentation.web;

import br.edu.fasa.sistemaPousada.domainModel.Camping;
import br.edu.fasa.sistemaPousada.domainModel.ICampingRepositorio;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author User
 */
@Named(value = "camping")
@SessionScoped
public class CampingBean implements Serializable {
    @EJB
    ICampingRepositorio ejb;
    
    int id;
    int capacidade;
    String localizacao;
    float preco;
    boolean status;
    String tipo;
    String descricao;
    
    List<Camping> listagem;
    Camping camping;

    public void abrir(){
        if(id > 0)
            setCamping(ejb.abrir(id));
    }
    
    public String editar(){
        abrir();
        return "salvarCamping.xhtml";
    }
    
    public String apagar(){
        abrir();
        ejb.apagar(camping);
        listagem=null;
        return "listarCamping.xhtml";
    }
    
    public void salvar(){
        abrir();
        
        if(camping == null)
            camping = new Camping();
        
        camping.setCapacidade(capacidade);
        camping.setLocalizacao(localizacao);
        camping.setPreco(preco);
        camping.setStatus(status);
        camping.setTipo(tipo);
        camping.setDescricao(descricao);
        
        ejb.salvar(camping);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public Camping getCamping() {
        return camping;
    }

    public void setCamping(Camping camping) {
        this.camping = camping;
        this.capacidade = camping.getCapacidade();
        this.descricao = camping.getDescricao();
        this.localizacao = camping.getLocalizacao();
        this.preco = camping.getPreco();
        this.status = camping.isStatus();
        this.tipo = camping.getTipo();
        
    }

    public List<Camping> getListagem() {
        if (listagem==null){
            listagem=ejb.listarTodos();
        }
        return listagem;
    }

    public void setListagem(List<Camping> listagem) {
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
     * Creates a new instance of CampingBean
     */
    public CampingBean() {
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
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
