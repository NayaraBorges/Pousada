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
@Table(name="Servicos")
public class Servico implements Serializable{
    
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="Descricao")
    private String descricao;

    public Servico() {
    }

    public Servico(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
