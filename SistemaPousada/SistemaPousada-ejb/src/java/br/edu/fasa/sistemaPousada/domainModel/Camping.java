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
public class Camping extends Servico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="Localizacao", nullable=false)
    private String localizacao;
    @Column(name="Preco", nullable=false)
    private float preco;
    @Column(name="Capacidade", nullable=false)
    private int capacidade;
    @Column(name="Status", nullable=false)
    private boolean status;

    public Camping() {
    }

    public Camping(Long id, String descricao, String tipo) {
        super(id, descricao, tipo);
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
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Camping)) {
            return false;
        }
        Camping other = (Camping) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.fasa.sistemaPousada.domainModel.Camping[ id=" + id + " ]";
    }
    
}
