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
@Table(name="Camping")
public class Camping implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="Localizacao")
    private String localizacao;
    @Column(name="Preco")
    private float preco;
    @Column(name="Capacidade")
    private int capacidade;
    @Column(name="Status")
    private boolean status;
    
    public Camping() {
    }

    public Camping(Long id, String localizacao, float preco, int capacidade, boolean status) {
        this.id = id;
        this.localizacao = localizacao;
        this.preco = preco;
        this.capacidade = capacidade;
        this.status = status;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
