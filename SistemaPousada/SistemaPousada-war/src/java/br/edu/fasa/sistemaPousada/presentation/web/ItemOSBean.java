/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.presentation.web;

import br.edu.fasa.sistemaPousada.domainModel.IItemOSRepositorio;
import br.edu.fasa.sistemaPousada.domainModel.ItemOS;
import br.edu.fasa.sistemaPousada.domainModel.OS;
import br.edu.fasa.sistemaPousada.domainModel.Servico;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;

/**
 *
 * @author NAYARA
 */
@Named(value = "itemOS")
@SessionScoped
public class ItemOSBean implements Serializable {
    @EJB
    IItemOSRepositorio ejb;
    
    Date data;
    Date hora;   
    Servico servico;
    OS os;
    
    public void salvar(){
        ItemOS ios = new ItemOS();
        ios.setData(data);
        ios.setHora(hora);
        ios.setServico(servico);
        ios.setOs(os);
        ejb.salvar(ios);
    }
    /**
     * Creates a new instance of ItemOSBean
     */
    public ItemOSBean() {
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
    
}
