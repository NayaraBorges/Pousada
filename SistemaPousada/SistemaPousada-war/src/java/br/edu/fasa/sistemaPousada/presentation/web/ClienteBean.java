/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.presentation.web;

import br.edu.fasa.sistemaPousada.domainModel.Cliente;
import br.edu.fasa.sistemaPousada.domainModel.IClienteRepositorio;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author User
 */
@Named(value = "cliente")
@SessionScoped
public class ClienteBean implements Serializable {
    @EJB
    IClienteRepositorio ejb;
    
    Cliente cliente;
    
    String id;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        this.id = cliente.getId().toString();
        this.nome = cliente.getNome();
        
    }
    
    List<Cliente> listagem;

    public List<Cliente> getListagem() {
        return listagem;
    }

    public void setListagem(List<Cliente> listagem) {
        this.listagem = listagem;
    }
    
    
    
    String nome;
    String cpf;
    String identidade;
    String naturalidade;
    String email;
    String telefone;
    String telefone1;
    String end_rua;
    String end_bairro;
    int end_numero;
    String end_complemento;
    String end_cidade;
    String end_cep;
    String end_estado;

    public void salvar(){
        Cliente cli = new Cliente();
        cli.setNome(nome);
        cli.setCpf(cpf);
        cli.setIdentidade(identidade);
        cli.setNaturalidade(naturalidade);
        cli.setEmail(email);
        cli.setTelefone(telefone);
        cli.setTelefone1(telefone1);
        cli.setEnd_rua(end_rua);
        cli.setEnd_bairro(end_bairro);
        cli.setEnd_numero(end_numero);
        cli.setEnd_complemento(end_complemento);
        cli.setEnd_cidade(end_cidade);
        cli.setEnd_cep(end_cep);
        cli.setEnd_estado(end_estado);
        ejb.salvar(cli);
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


    /**
     * Creates a new instance of ClienteBean
     */
    public ClienteBean() {
    }

}
