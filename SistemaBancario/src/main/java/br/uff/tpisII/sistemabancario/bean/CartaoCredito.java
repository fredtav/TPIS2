/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.tpisII.sistemabancario.bean;

import br.uff.tpisII.sistemabancario.model.Cartao;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author VíviannMagaly
 */
@Named(value = "cartaoCredito")
@Dependent
public class CartaoCredito extends Cartao {
    
    public CartaoCredito() {
    }
    
    private double totalLimite;
    private double saldoGasto;
    private Date vencimentoFatura;

    public Date getVencimentoFatura() {
        return vencimentoFatura;
    }

    public void setVencimentoFatura(Date vencimentoFatura) {
        this.vencimentoFatura = vencimentoFatura;
    }

    public double getSaldoGasto() {
        return saldoGasto;
    }

    public void setSaldoGasto(double saldoGasto) {
        this.saldoGasto = saldoGasto;
    }

    public double getTotalLimite() {
        return totalLimite;
    }

    public void setTtotalLimite(double totalLimite) {
        this.totalLimite = totalLimite;
    }
    
}
