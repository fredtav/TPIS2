/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.tpisII.sistemabancario.bean;

import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author fred
 */
@Named(value = "nextPageBean")
@RequestScoped
public class NextPageBean {

    /**
     * Creates a new instance of NextPageBean
     */
    public NextPageBean() {
    }
    
    private String url;
    private int page;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public void redirecionar() throws IOException{
        if(page==1)
            FacesContext.getCurrentInstance().getExternalContext().redirect("homeClienteCorrente.xhtml");
        else
            if(page==2)
                FacesContext.getCurrentInstance().getExternalContext().redirect("homeClientePoupanca.xhtml");
    }
}
