/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.presentation.web;

import br.edu.fasa.sistemaPousada.domainModel.IVeiculoRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.Veiculo;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author NAYARA
 */
@Named(value = "veiculo")
@SessionScoped
public class VeiculoBean implements Serializable {
    @EJB
    IVeiculoRepositorio ejb;
    
    String nome;
    float preco;
    String placa;
    String cor;
    boolean status;
    int ano;
    String categoria;
    
    public void salvar(){
        Veiculo vei = new Veiculo();
        vei.setNome(nome);
        vei.setPreco(preco);
        vei.setPlaca(placa);
        vei.setCor(cor);
        vei.setStatus(status);
        vei.setAno(ano);
        vei.setCategoria(categoria);
        ejb.salvar(vei);
    
    // descricao e tipo
    }
    /**
     * Creates a new instance of VeiculoBean
     */
    public VeiculoBean() {
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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
