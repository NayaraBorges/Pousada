/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.presentation.web;

import br.edu.fasa.sistemaPousada.domainModel.Cliente;
import br.edu.fasa.sistemaPousada.domainModel.IOSRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.OS;
import br.edu.fasa.sistemaPousada.domainModel.Servico;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author NAYARA
 */
@Named(value = "os")
@SessionScoped
public class OSBean implements Serializable {
    @EJB
    IOSRepositorio ejb;
    
    boolean status;
    List<Servico> itens;
    Cliente cliente;

    public void salvar(){
        OS os = new OS();
        os.setStatus(status);
        os.setItens(itens);
        os.setCliente(cliente);
        ejb.salvar(os);
    }

    /**
     * Creates a new instance of OSBean
     */
    public OSBean() {
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
    
    
}
