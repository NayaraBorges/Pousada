/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.presentation.web;

import br.edu.fasa.sistemaPousada.domainModel.IRefeicaoRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.Refeicao;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author NAYARA
 */
@Named(value = "refeicao")
@SessionScoped
public class RefeicaoBean implements Serializable {
    @EJB
    IRefeicaoRepositorio ejb;
    
    int id;
    String nome;
    float preco;
    String tipo;
    String descricao;

    List<Refeicao> listagem;
    Refeicao refeicao;

    public void abrir(){
        if(id > 0)
            setRefeicao(ejb.abrir(id));
    }
    
    public String editar(){
        abrir();
        return "salvarRefeicao.xhtml";
    }
    
    public String apagar(){
        abrir();
        ejb.apagar(refeicao);
        listagem=null;
        return "listarRefeicao.xhtml";
    }
    
    public void salvar(){
        abrir();
        
        if(refeicao == null)
            refeicao = new Refeicao();
        
        refeicao.setNome(nome);
        refeicao.setPreco(preco);
        refeicao.setTipo(tipo);
        refeicao.setDescricao(descricao);
        
        ejb.salvar(refeicao);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Refeicao> getListagem() {
        return listagem;
    }

    public void setListagem(List<Refeicao> listagem) {
        this.listagem = listagem;
    }

    public Refeicao getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(Refeicao refeicao) {
        this.refeicao = refeicao;
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
     * Creates a new instance of RefeicaoBean
     */
    public RefeicaoBean() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
