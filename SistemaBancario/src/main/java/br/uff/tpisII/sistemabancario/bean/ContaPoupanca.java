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
@Named(value = "poupanca")
@Dependent
public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
    }
    
    public ContaPoupanca(int numeroConta) {
        super.setNumeroConta(numeroConta);
    }
    
    public double calculaRendimento() {
        return 0;
        // Não imagino como calcule, vamos deixar assim enquanto ninguém tem uma ideia
        // para colocar aqui
    }
    
}
