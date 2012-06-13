/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.domainModel;

import javax.persistence.*;

/**
 *
 * @author NAYARA
 */
@Entity
@Table(name="Produtos")
public class Produto {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="Nome")
    private String nome;
    @Column(name="Preco")
    private float preco;
    @Column(name="Descricao")
    private String descricao;
    @Column(name="Embalagem")
    private String embalagem;
    @Column(name="Estoque")
    private String estoque;

    public Produto() {
    }

    public Produto(Long id, String nome, float preco, String descricao, String embalagem, String estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.embalagem = embalagem;
        this.estoque = estoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
}
