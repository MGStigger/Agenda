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
public class PessoaJuridica extends Pessoa implements Autenticavel{

    private int cnpj;

    public PessoaJuridica(String nome, int telefone, String email, int cnpj){
        super(nome,telefone,email);
        this.cnpj = cnpj;
    }

    @Override
    public int getCNPJ(){
        return this.cnpj;
    }

    public void setCNPJ(int cnpj){
        this.cnpj = cnpj;
    }

    public String toString(){
        return "Tipo: Jurídica" + super.toString() + "     CNPJ: " + this.cnpj;
    }

}
