/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.domainModel;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author NAYARA
 */
@Entity
@Table(name="Veiculos")
public class Veiculo implements Serializable{

    @Id
    @GeneratedValue
    private Long id;
    @Column(name="Nome")
    private String nome;
    @Column(name="Preco")
    private float preco;
    @Column(name="Placa")
    private String placa;
    @Column(name="Cor")
    private String cor;
    @Column(name="Status")
    private boolean status;
    @Column(name="ano")
    private int ano;
    @Column(name="Tipo")
    private String tipo;

    public Veiculo() {
    }

    public Veiculo(Long id, String nome, float preco, String placa, String cor, boolean status, int ano, String tipo) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.placa = placa;
        this.cor = cor;
        this.status = status;
        this.ano = ano;
        this.tipo = tipo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

}
