/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.domainModel;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author NAYARA
 */
@Entity
@Table(name="Chales")
public class Chale implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="Preco")
    private float preco;
    @Column(name="Descricao")
    private String descricao;
    @Column(name="Data")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    @Column(name="Hora")
    @Temporal(javax.persistence.TemporalType.TIME)
    private Time hora;
    @Column(name="Cor")
    private String cor;
    @Column(name="Status")
    private boolean status;
    @Column(name="Capacidade")
    private int capacidade;

    public Chale() {
    }

    public Chale(Long id, float preco, String descricao, Date data, Time hora, String cor, boolean status, int capacidade) {
        this.id = id;
        this.preco = preco;
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
        this.cor = cor;
        this.status = status;
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
