public abstract class Pessoa {

    private String nome;
    private int telefone;
    private String email;

    public Pessoa(String nome, int telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNOME(){
        return this.nome;
    }

    public int getTELEFONE(){
        return this.telefone;
    }

    public String getEMAIL(){
        return this.email;
    }

    public int getCPF(){return 0;}
    public int getCNPJ(){return 0;}

    public void setNOME(String nome){
        this.nome = nome;
    }

    public void setTELEFONE(int telefone){
        this.telefone = telefone;
    }
    
    public void setEMAIL(String email){
        this.email = email;
    }

    public String toString(){
        return  "     Nome: " + this.nome +
                "     Telefone: + " + this.telefone +
                "     E-mail: " + this.email;
    }

}