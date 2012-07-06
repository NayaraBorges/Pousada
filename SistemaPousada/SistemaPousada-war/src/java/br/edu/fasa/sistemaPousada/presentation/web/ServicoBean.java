/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.presentation.web;

import br.edu.fasa.sistemaPousada.domainModel.IServicoRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.Servico;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author NAYARA
 */
@Named(value = "servico")
@SessionScoped
public class ServicoBean implements Serializable {
    @EJB
    IServicoRepositorio ejb;
    
    int id;
    String descricao;
    String tipo;

    List<Servico> listagem;
    Servico servico;
    public void abrir(){
        if(id > 0)
            setServico(ejb.abrir(id));
    }
    
    public String editar(){
        abrir();
        return "salvarServico.xhtml";
    }
    
    public String apagar(){
        abrir();
        ejb.apagar(servico);
        listagem=null;
        return "listarServico.xhtml";
    }
    
    public void salvar(){
        abrir();
        
        if(servico == null)
            servico = new Servico();
        
        servico.setTipo(tipo);
        servico.setDescricao(descricao);
        
        ejb.salvar(servico);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Servico> getListagem() {
        return listagem;
    }

    public void setListagem(List<Servico> listagem) {
        this.listagem = listagem;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
    /**
     * Creates a new instance of ServicoBean
     */
    public ServicoBean() {
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
    
    
}
