/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.presentation.web;

import br.edu.fasa.sistemaPousada.domainModel.IRefeicaoRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.Refeicao;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author NAYARA
 */
@Named(value = "refeicao")
@SessionScoped
public class RefeicaoBean implements Serializable {
    @EJB
    IRefeicaoRepositorio ejb;
    
    String nome;
    float preco;
    String tipo;
    String descricao;

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

    public void salvar(){
        Refeicao ref = new Refeicao();
        ref.setNome(nome);
        ref.setPreco(preco);
        ref.setTipo(tipo);
        ref.setDescricao(descricao);
        //descricao e tipo
        ejb.salvar(ref);
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
