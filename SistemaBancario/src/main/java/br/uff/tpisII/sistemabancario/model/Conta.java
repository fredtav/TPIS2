/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.tpisII.sistemabancario.model;

import br.uff.tpisII.sistemabancario.bean.Registro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Víviann Magaly
 */
public abstract class Conta {
    
    private int numeroConta;    
    private Date data;    
    protected double saldo;
    private List<Registro> registros = new ArrayList<>();
    private List<Cartao> cartoes = new ArrayList<>();

    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void realizarPagamento(double valor) {
        this.saldo -= valor;
        adicionarRegistro("Realizando pagamento de valor: " + valor);
    }    
    
    public double depositar(double valor) {
        this.saldo += valor;
        adicionarRegistro("Realizando depósito de valor: " + valor);
        
        return valor;
    }
    
    public void transferir(Conta conta, double valor) {
        this.saldo -= valor;
        conta.saldo += valor;
        
        adicionarRegistro("Realizando transfêrencia de valor: " 
                + valor + ", para a conta número: " + conta.numeroConta);
    }
    
    public double consultaSaldo() {
        return getSaldo();
    }
    
    public List<Registro> retirarExtrato(Date since) {
        List<Registro> extrato = new ArrayList<>();
        
        for(Registro r : registros) {
            if(r.getData().after(since)) {
                extrato.add(r);
            }
        }        
        return extrato;
    }
    
    protected void adicionarRegistro(String mensagem) {
        Registro registro = new Registro();
        registro.gravar(mensagem);
        this.registros.add(registro);
    }
    
    public void adicionaCartao(Cartao cartao) {
        this.cartoes.add(cartao);
    }
}
