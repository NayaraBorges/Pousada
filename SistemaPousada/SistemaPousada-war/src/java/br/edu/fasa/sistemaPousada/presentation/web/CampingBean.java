/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.presentation.web;

import br.edu.fasa.sistemaPousada.domainModel.Camping;
import br.edu.fasa.sistemaPousada.domainModel.ICampingRepositorio;
import java.io.Serializable;
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
    
    int capacidade;
    String localizacao;
    float preco;
    boolean status;
    String tipo;
    String descricao;
        
    public void salvar(){
        Camping cam = new Camping();
        cam.setCapacidade(capacidade);
        cam.setLocalizacao(localizacao);
        cam.setPreco(preco);
        cam.setStatus(status);
        cam.setTipo(localizacao);
        cam.setDescricao(localizacao);
        ejb.salvar(cam);
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
