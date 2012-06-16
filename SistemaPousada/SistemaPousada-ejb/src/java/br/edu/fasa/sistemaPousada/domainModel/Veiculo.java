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
public class Veiculo extends Servico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="Nome", nullable=false)
    private String nome;
    @Column(name="Preco", nullable=false)
    private float preco;
    @Column(name="Placa", length= 7, nullable=false)
    private String placa;
    @Column(name="Cor", nullable=true)
    private String cor;
    @Column(name="Status", nullable=false)
    private boolean status;
    @Column(name="ano", nullable=true)
    private int ano;
    @Column(name="Tipo", nullable=false)
    private String tipo;

    public Veiculo() {
    }

    public Veiculo(Long id, String descricao, String tipo) {
        super(id, descricao, tipo);
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
        if (!(object instanceof Veiculo)) {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.fasa.sistemaPousada.domainModel.Veiculo[ id=" + id + " ]";
    }
    
}
