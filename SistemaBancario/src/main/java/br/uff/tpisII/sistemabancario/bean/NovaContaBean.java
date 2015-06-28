/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.tpisII.sistemabancario.bean;

import br.uff.tpisII.sistemabancario.model.Cartao;
import br.uff.tpisII.sistemabancario.model.Conta;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author VíviannMagaly
 */
@Named(value = "novaContaBean")
@RequestScoped
public class NovaContaBean {

    public NovaContaBean() {
    }
    
    private int tipoConta;
    private Conta conta;
    private CartaoDebito cartao;
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(CartaoDebito cartao) {
        this.cartao = cartao;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void criarConta() {
        if(tipoConta == 1) 
            this.conta = new ContaCorrente(conta.getNumeroConta());            
         else 
            this.conta = new ContaPoupanca(conta.getNumeroConta());        
        
        this.conta.adicionaCartao(cartao);
        this.cartao.setContaAssiciada(conta);            
        this.cliente.abrirNovaConta(conta);
    }
}
