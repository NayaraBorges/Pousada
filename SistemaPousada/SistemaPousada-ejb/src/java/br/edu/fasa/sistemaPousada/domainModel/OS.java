/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.domainModel;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author NAYARA
 */
@Entity
@Table(name="OS")
public class OS implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="Status", nullable=false)
    private boolean status;
    @ManyToMany(cascade=CascadeType.ALL)
    List<Servico> itens;
    @ManyToOne(cascade= CascadeType.MERGE, fetch= FetchType.EAGER)
    @JoinColumn(name="Cliente")
    private Cliente cliente;

    public OS() {
    }

    public OS(Long id, boolean status, List<Servico> itens, Cliente cliente) {
        this.id = id;
        this.status = status;
        this.itens = itens;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Servico> getItens() {
        return itens;
    }

    public void setItens(List<Servico> itens) {
        this.itens = itens;
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
        if (!(object instanceof OS)) {
            return false;
        }
        OS other = (OS) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.fasa.sistemaPousada.domainModel.OS[ id=" + id + " ]";
    }
    
}
