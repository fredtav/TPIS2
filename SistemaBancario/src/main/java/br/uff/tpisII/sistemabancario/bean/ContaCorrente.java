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
@Named(value = "contaCorrente")
@Dependent
public class ContaCorrente extends Conta{

    public ContaCorrente() {
    }
    
    public ContaCorrente(int numeroConta) {
        super.setNumeroConta(numeroConta);
    }
    
    private Cheque imprimeCheque(Conta conta, double valor) {
        Cheque c = new Cheque();
        c.setConta(conta);
        c.setValor(valor);
        
        return c;        
    }
    
    private void conpensaCheque(Cheque cheque) {
        this.saldo -= cheque.getValor();
        this.adicionarRegistro("Cheque compensado, valor: " + cheque.getValor() + ", destinarário: " + cheque.getNomeDestinario());
    }
    
    
}
