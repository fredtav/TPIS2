/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.tpisII.sistemabancario.bean;

import br.uff.tpisII.sistemabancario.model.Cartao;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author VíviannMagaly
 */
@ManagedBean
@RequestScoped
public class CartaoDebito extends Cartao {
    
    public CartaoDebito(){
    }
    
    private double saldo;
    private double limiteDiario;
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteDiario() {
        return limiteDiario;
    }

    public void setLimiteDiario(double limiteDiario) {
        this.limiteDiario = limiteDiario;
    }
    
    public void sacarDinheiro(double valor){
        this.saldo -= valor;
    }
    
    public void transferir(double valor, int conta){
        
    }
    
}
