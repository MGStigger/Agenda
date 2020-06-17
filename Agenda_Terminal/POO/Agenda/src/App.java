import java.util.Scanner;

public class App extends Agenda{

    public static void main(String[] args) throws Exception {
        
        App obj = new App();

        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println(" ");
            System.out.println("********************************** AGENDA ***********************************");
            System.out.println("0 – Sair     1 – Cadastrar     2 – Remover     3 – Imprimir Lista de Contatos");
            System.out.println(" ");
            System.out.print("Entre com uma opção: ");

            opcao = sc.nextInt();

            switch(opcao){

                case 0:
                    System.out.println("");
                    System.out.println("– – – – – – AGENDA ENCERRADA – – – – – –");
                    System.out.println("");
                    System.exit(0);
                    break;

                case 1:
                    obj.cadastrar();
                    break;

                case 2:
                    obj.remover();
                    break;

                case 3:
                    obj.imprimir();
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }

    public static void cls(){
        for(int i = 0; i < 25; i++){
            System.out.println("");
        }
    }

    private void imprimir(){

        if(Contatos.size() == 0){
            cls();
            System.out.println("Nenhuma pessoa foi cadastrada.");
        }
        else{
            cls();
            Contatos.forEach((lista) -> System.out.println(lista.toString()));
            System.out.println("");
            System.out.println("");
        }

    }

    private void remover(){

        Scanner sc = new Scanner(System.in);

        cls();
        System.out.println("***************** AGENDA *****************");
        System.out.println("");
        System.out.print("Digite o nome, telefone, email ou CPF/CNPJ: ");

        String var = sc.next();

        for(Pessoa excluir : Contatos) {

            if(excluir.getNOME().equals(var) || excluir.getEMAIL().equals(var)){
                
                Contatos.remove(excluir);
                cls();
                System.out.println("– – – – – – CONTATO EXCLUÍDO COM SUCESSO – – – – – –");
                System.out.println("");
                System.out.println("");
                break;

            }

            int var_int = Integer.parseInt(var);

            if(excluir.getTELEFONE() == var_int || excluir.getCPF() == var_int || 
               excluir.getCNPJ() == var_int){

                Contatos.remove(excluir);
                cls();
                System.out.println("– – – – – – CONTATO EXCLUÍDO COM SUCESSO – – – – – –");
                System.out.println("");
                System.out.println("");
                break;
            }

            else{
                System.out.println("Informação inválida!");
            }

        }

    }

    private void cadastrar(){
        
        int opcao = 0;

        String nome = null;
        int telefone = 0;
        String email = null;
        int cpf = 0;
        int cnpj = 0;

        Scanner sc = new Scanner(System.in);

        cls();
        System.out.println("***************** AGENDA *****************");
        System.out.println(" 1 – Pessoa Física     2 – Pessoa Jurídica");
        System.out.println(" ");
        System.out.print("Entre com uma opção: ");

        opcao = sc.nextInt();        

        switch(opcao){

            case 1:
                System.out.println("");
                System.out.println("");
                System.out.println("***************** AGENDA *****************");
                System.out.print("Digite o nome: ");
                nome = sc.next();
                System.out.print("Digite o telefone: ");
                telefone = sc.nextInt();
                System.out.print("Digite o e-mail: ");
                email = sc.next();
                System.out.print("Digite o CPF: ");
                cpf = sc.nextInt();
                Pessoa pessoafisica = new PessoaFisica(nome, telefone, email, cpf);
                Contatos.add(pessoafisica);
                cls();
                System.out.println("– – – – – – CADASTRO REALIZADO COM SUCESSO – – – – – –");
                System.out.println("");
                System.out.println("");
                break;

            case 2:
                System.out.println("");
                System.out.println("");
                System.out.println("***************** AGENDA *****************");
                System.out.print("Digite o nome: ");
                nome = sc.next();
                System.out.print("Digite o telefone: ");
                telefone = sc.nextInt();
                System.out.print("Digite o e-mail: ");
                email = sc.next();
                System.out.print("Digite o CNPJ: ");
                cnpj = sc.nextInt();
                Pessoa pessoajuridica = new PessoaJuridica(nome, telefone, email, cnpj);
                Contatos.add(pessoajuridica);
                cls();
                System.out.println("– – – – – – CADASTRO REALIZADO COM SUCESSO – – – – – –");
                System.out.println("");
                System.out.println("");
                break;

            default:
            System.out.println("Opção Inválida!");
        }
    }
}