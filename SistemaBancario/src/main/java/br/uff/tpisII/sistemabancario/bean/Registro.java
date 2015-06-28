/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.tpisII.sistemabancario.bean;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author VíviannMagaly
 */
@Named(value = "registro")
@Dependent
public class Registro {
   
    public Registro() {
    }
    
    private String mensagem;
    private Date data;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public void gravar(String mensagem) {
        this.setMensagem(mensagem);
        this.data = GregorianCalendar.getInstance().getTime();
    }
}
