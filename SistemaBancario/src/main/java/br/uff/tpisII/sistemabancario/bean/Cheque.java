/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.tpisII.sistemabancario.bean;

import br.uff.tpisII.sistemabancario.model.Conta;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author VíviannMagaly
 */
@Named(value = "cheque")
@Dependent
public class Cheque {

    public Cheque() {
    }
    
    private Conta contaRemetente;
    private String nomeDestinario;
    private double valor;

    public Conta getContaRemetente() {
        return contaRemetente;
    }

    public void setContaRemetente(Conta contaRemetente) {
        this.contaRemetente = contaRemetente;
    }

    public String getNomeDestinario() {
        return nomeDestinario;
    }

    public void setNomeDestinario(String nomeDestinario) {
        this.nomeDestinario = nomeDestinario;
    }

    public Conta getConta() {
        return contaRemetente;
    }

    public void setConta(Conta conta) {
        this.contaRemetente = conta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
