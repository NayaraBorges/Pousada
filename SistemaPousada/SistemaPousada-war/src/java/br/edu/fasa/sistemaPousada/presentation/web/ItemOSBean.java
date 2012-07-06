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
import java.util.List;
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
    
    int id;
    Date data;
    Date hora;   
    Servico servico;
    OS os;
    
    List<ItemOS> listagem;
    ItemOS itemOs;
    
    public void abrir(){
        if(id > 0)
            setItemOs(ejb.abrir(id));
    }
    
    public String editar(){
        abrir();
        return "salvarItemOs.xhtml";
    }
    
    public String apagar(){
        abrir();
        ejb.apagar(itemOs);
        listagem=null;
        return "listarItemOs.xhtml";
    }
    
    public void salvar(){
        abrir();
        
        if(itemOs == null)
            itemOs = new ItemOS();
        
        itemOs.setData(data);
        itemOs.setHora(hora);
        itemOs.setServico(servico);
        itemOs.setOs(os);
        
        ejb.salvar(itemOs);
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ItemOS getItemOs() {
        return itemOs;
    }

    public void setItemOs(ItemOS itemOs) {
        this.itemOs = itemOs;
    }

    public List<ItemOS> getListagem() {
        return listagem;
    }

    public void setListagem(List<ItemOS> listagem) {
        this.listagem = listagem;
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
