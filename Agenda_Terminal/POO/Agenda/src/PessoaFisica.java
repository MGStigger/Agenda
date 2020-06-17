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