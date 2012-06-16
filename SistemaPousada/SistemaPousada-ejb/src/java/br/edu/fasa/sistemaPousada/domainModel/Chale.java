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
@Table(name="Chales")
public class Chale extends Servico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="Preco", nullable=false)
    private float preco;
    @Column(name="Cor", nullable=true)
    private String cor;
    @Column(name="Status", nullable=false)
    private boolean status;
    @Column(name="Capacidade", nullable=false)
    private int capacidade;

    public Chale() {
    }

    public Chale(Long id, String descricao, String tipo) {
        super(id, descricao, tipo);
    }

    public Chale(Long id, float preco, String cor, boolean status, int capacidade) {
        this.id = id;
        this.preco = preco;
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
        if (!(object instanceof Chale)) {
            return false;
        }
        Chale other = (Chale) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.fasa.sistemaPousada.domainModel.Chale[ id=" + id + " ]";
    }
    
}
