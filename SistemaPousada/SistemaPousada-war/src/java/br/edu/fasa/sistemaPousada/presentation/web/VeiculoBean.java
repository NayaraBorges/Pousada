/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.presentation.web;

import br.edu.fasa.sistemaPousada.domainModel.IVeiculoRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.Veiculo;
import java.io.Serializable;
import java.util.List;
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
    
    int id;
    String nome;
    float preco;
    String placa;
    String cor;
    boolean status;
    int ano;
    String categoria;
    String tipo;
    String descricao;

    List<Veiculo> listagem;
    Veiculo veiculo;
    
    public void abrir(){
        if(id > 0)
            setVeiculo(ejb.abrir(id));
    }
    
    public String editar(){
        abrir();
        return "salvarVeiculo.xhtml";
    }
    
    public String apagar(){
        abrir();
        ejb.apagar(veiculo);
        listagem=null;
        return "listarVeiculo.xhtml";
    }
    
    public void salvar(){
        abrir();
        
        if(veiculo == null)
            veiculo = new Veiculo();
        
        veiculo.setNome(nome);
        veiculo.setPlaca(placa);
        veiculo.setPreco(preco);
        veiculo.setStatus(status);
        veiculo.setTipo(tipo);
        veiculo.setDescricao(descricao);
        veiculo.setCor(cor);
        veiculo.setAno(ano);
        veiculo.setCategoria(categoria);
        veiculo.setTipo(tipo);
        veiculo.setDescricao(descricao);
        
        ejb.salvar(veiculo);
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Veiculo> getListagem() {
        return listagem;
    }

    public void setListagem(List<Veiculo> listagem) {
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
