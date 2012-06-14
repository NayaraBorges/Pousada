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
@Table(name="Funcionarios")
public class Funcionario implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="Nome",length=255,nullable=false)  //false = not null
    private String nome;
    @Column(name="Cpf")
    private String cpf;
    @Column(name="Identidade")
    private String identidade;
    @Column(name="Naturalidade")
    private String naturalidade;
    @Column(name="Email")
    private String email;
    @Column(name="Telefone")
    private String telefone;
    @Column(name="End_rua")
    private String end_rua;
    @Column(name="End_bairro")
    private String end_bairro;
    @Column(name="End_numero")
    private int end_numero;
    @Column(name="End_complemento")
    private int end_complemento;
    @Column(name="End_cidade")
    private String end_cidade;
    @Column(name="End_cep")
    private String end_cep;
    @Column(name="Turno")
    private String turno;
    @Column(name="Setor")
    private String setor;
    @Column(name="End_Estado")
    private String end_estado;

    
    public Funcionario() {
    }

    public Funcionario(Long id, String nome, String cpf, String identidade, String naturalidade, String email, String telefone, String end_rua, String end_bairro, int end_numero, int end_complemento, String end_cidade, String end_cep, String turno, String setor, String end_estado) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.identidade = identidade;
        this.naturalidade = naturalidade;
        this.email = email;
        this.telefone = telefone;
        this.end_rua = end_rua;
        this.end_bairro = end_bairro;
        this.end_numero = end_numero;
        this.end_complemento = end_complemento;
        this.end_cidade = end_cidade;
        this.end_cep = end_cep;
        this.turno = turno;
        this.setor = setor;
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

    public int getEnd_complemento() {
        return end_complemento;
    }

    public void setEnd_complemento(int end_complemento) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    
}
