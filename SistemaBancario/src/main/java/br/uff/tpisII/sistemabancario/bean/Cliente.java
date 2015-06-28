/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.tpisII.sistemabancario.bean;

import br.uff.tpisII.sistemabancario.model.Conta;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import javax.faces.validator.FacesValidator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 *
 * @author Víviann Magaly
 */
@Named(value = "cliente")
@SessionScoped
@FacesValidator
public class Cliente implements Serializable {

    public Cliente() {
        this.contas = new ArrayList<>();
    }    
    
    private int codCliente;

    @NotNull
    private String nameCompleto;    
    
    @Pattern(regexp = "^([0-9]{3})\\.([0-9]{3})\\.([0-9]{3})\\-([0-9]{2})$")
    private String cpf;

    @Pattern(regexp = "^(\\+[0-9]{2})?\\([0-9]{2}\\)[0-9]{4}\\-[0-9]{4}$")
    private String telefone;
    
    private String endereco;
    
    private List<Conta> contas;

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getName() {
        return nameCompleto;
    }

    public void setName(String name) {
        this.nameCompleto = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void abrirNovaConta(Conta conta) {    
        contas.add(conta);            
    }
    
    public void fecharConta(Conta c) {
        contas.remove(c);
    }    
    
}
