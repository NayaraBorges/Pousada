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
@Table(name="Clientes")
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="Nome", length=255, nullable=false)
    private String nome;
    @Column(name="Cpf", length=11, nullable=false)
    private String cpf;
    @Column(name="Identidade", length=8, nullable=false)
    private String identidade;
    @Column(name="Naturalidade", nullable=false)
    private String naturalidade;
    @Column(name="Email", nullable=false)
    private String email;
    @Column(name="Telefone", length=10, nullable=false)
    private String telefone;
    @Column(name="Telefone1", length=10, nullable=false)
    private String telefone1;
    @Column(name="End_rua", nullable=false)
    private String end_rua;
    @Column(name="End_bairro", nullable=false)
    private String end_bairro;
    @Column(name="End_numero", nullable=false)
    private int end_numero;
    @Column(name="End_complemento", nullable=false)
    private String end_complemento;
    @Column(name="End_cidade", nullable=false)
    private String end_cidade;
    @Column(name="End_cep", length=8, nullable=false)
    private String end_cep;
    @Column(name="End_Estado", nullable=false)
    private String end_estado;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String cpf, String identidade, String naturalidade, String email, String telefone, String telefone1, String end_rua, String end_bairro, int end_numero, String end_complemento, String end_cidade, String end_cep, String end_estado) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.identidade = identidade;
        this.naturalidade = naturalidade;
        this.email = email;
        this.telefone = telefone;
        this.telefone1 = telefone1;
        this.end_rua = end_rua;
        this.end_bairro = end_bairro;
        this.end_numero = end_numero;
        this.end_complemento = end_complemento;
        this.end_cidade = end_cidade;
        this.end_cep = end_cep;
        this.end_estado = end_estado;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnd_bairro() {
        return end_bairro;
    }

    public void setEnd_bairro(String end_bairro) {
        this.end_bairro = end_bairro;
    }

    public String getEnd_cep() {
        return end_cep;
    }

    public void setEnd_cep(String end_cep) {
        this.end_cep = end_cep;
    }

    public String getEnd_cidade() {
        return end_cidade;
    }

    public void setEnd_cidade(String end_cidade) {
        this.end_cidade = end_cidade;
    }

    public String getEnd_complemento() {
        return end_complemento;
    }

    public void setEnd_complemento(String end_complemento) {
        this.end_complemento = end_complemento;
    }

    public String getEnd_estado() {
        return end_estado;
    }

    public void setEnd_estado(String end_estado) {
        this.end_estado = end_estado;
    }

    public int getEnd_numero() {
        return end_numero;
    }

    public void setEnd_numero(int end_numero) {
        this.end_numero = end_numero;
    }

    public String getEnd_rua() {
        return end_rua;
    }

    public void setEnd_rua(String end_rua) {
        this.end_rua = end_rua;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.fasa.sistemaPousada.domainModel.Cliente[ id=" + id + " ]";
    }
    
}
