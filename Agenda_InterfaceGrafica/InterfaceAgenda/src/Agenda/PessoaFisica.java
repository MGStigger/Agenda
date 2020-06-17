/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

/**
 *
 * @author MGStigger
 */
public class PessoaFisica extends Pessoa implements Autenticavel {

    private int cpf;

    public PessoaFisica(String nome, int telefone, String email, int cpf){
        super(nome,telefone,email);
        this.cpf = cpf;
    }

    @Override
    public int getCPF(){
        return this.cpf;
    }

    public void setCPF(int cpf){
        this.cpf = cpf;
    }

    public String toString(){
        return "Tipo: Física" + super.toString() + "     CPF: " + this.cpf;
    }

}