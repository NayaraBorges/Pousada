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
@Table(name="Passeios")
public class Passeio implements Serializable{
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

    public Passeio() {
    }

    public Passeio(Long id, float preco, String descricao, Date data, Time hora) {
        this.id = id;
        this.preco = preco;
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
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
    
}
