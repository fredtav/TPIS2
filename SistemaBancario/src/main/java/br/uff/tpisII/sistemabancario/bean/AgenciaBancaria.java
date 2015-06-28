/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.tpisII.sistemabancario.bean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author VíviannMagaly
 */
@Named(value = "agenciaBancaria")
@Dependent
public class AgenciaBancaria {

 
    public AgenciaBancaria() {
    }
    
    private int codAgencia;
    private String nomeAgencia;

    public int getCodAgencia() {
        return codAgencia;
    }

    public void setCodAgencia(int codAgencia) {
        this.codAgencia = codAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }
    
}
