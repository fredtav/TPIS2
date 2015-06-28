/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.tpisII.sistemabancario.model;

/**
 *
 * @author VíviannMagaly
 */
public abstract class Cartao {
    
    public Cartao() {
    }
    
    private int numeroCartao;
    private String senhaCartao;
    private String titularCartao;
    private Conta contaAssiciada;

    public Conta getContaAssiciada() {
        return contaAssiciada;
    }

    public void setContaAssiciada(Conta contaAssiciada) {
        this.contaAssiciada = contaAssiciada;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getSenhaCartao() {
        return senhaCartao;
    }

    public void setSenhaCartao(String senhaCartao) {
        this.senhaCartao = senhaCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }
}
