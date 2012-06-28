/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.presentation.web;

import br.edu.fasa.sistemaPousada.domainModel.Camping;
import br.edu.fasa.sistemaPousada.domainModel.ICampingRepositorio;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author NAYARA
 */
@Named(value = "camping")
@SessionScoped
public class CampingBean implements Serializable {
    @EJB
    ICampingRepositorio ejb;
    
    String localizacao;
    float preco;
    int capacidade;
    boolean status;
    
    public void salvar(){
        Camping cam = new Camping();
        cam.setCapacidade(capacidade);
        cam.setLocalizacao(localizacao);
        cam.setPreco(preco);
        cam.setStatus(status);
        // classe pai cam.setTipo(tipo);
        // classe pai cam.setDescricao(descricao);
        ejb.salvar(cam);
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

    /**
     * Creates a new instance of CampingBean
     */
    public CampingBean() {
    }
}
