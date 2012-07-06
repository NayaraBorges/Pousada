/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.presentation.web;

import br.edu.fasa.sistemaPousada.domainModel.Cliente;
import br.edu.fasa.sistemaPousada.domainModel.IOSRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.OS;
import br.edu.fasa.sistemaPousada.domainModel.Servico;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author NAYARA
 */
@Named(value = "os")
@SessionScoped
public class OSBean implements Serializable {
    @EJB
    IOSRepositorio ejb;
    
    int id;
    boolean status;
    List<Servico> itens;
    Cliente cliente;
    
    List<OS> listagem;
    OS os;
    
    public void abrir(){
        if(id > 0)
            setOs(ejb.abrir(id));
    }
    
    public String editar(){
        abrir();
        return "salvarOs.xhtml";
    }
    
    public String apagar(){
        abrir();
        ejb.apagar(os);
        listagem=null;
        return "listarOs.xhtml";
    }
    
    public void salvar(){
        abrir();
        
        if(os == null)
            os = new OS();
        
        os.setItens(itens);
        os.setCliente(cliente);
        os.setStatus(status);
        
        ejb.salvar(os);
    }

    public List<OS> getListagem() {
        return listagem;
    }

    public void setListagem(List<OS> listagem) {
        this.listagem = listagem;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
