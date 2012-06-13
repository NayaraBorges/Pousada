/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.sistemaPousada.domainModel;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author NAYARA
 */
public class OS {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="Total")
    private float total;
    @Column(name="Status")
    private boolean status;
    @Column(name="Data")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;

    public OS() {
    }

    public OS(Long id, float total, boolean status, Date data) {
        this.id = id;
        this.total = total;
        this.status = status;
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
}
