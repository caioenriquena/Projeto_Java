import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String repetir;
        CadastrarFuncionario cp = new CadastrarFuncionario();

        do{

            Administracao admin = new Administracao();
            Atendimento atend = new Atendimento();
            DiretorGeral diretorGeral = new DiretorGeral();
            Midia midia = new Midia();

            System.out.println("=====CADASTRO DE FUNCIONÁRIOS=====");
            System.out.println("Escolha o departamento:");
            System.out.println("1 - Administração, 2 - Atendimento, 3 - Direção geral, 4 - Mídia");
            int opcao = input.nextInt();
            input.nextLine();
            switch (opcao){

                case 1:
                    System.out.println("==ADMINISTRAÇÃO==");
                    System.out.println("Escolha o cargo do funcionário:\n1 - Gerente Administratvo 2 - Assitente Administrativo");
                    int op = input.nextInt();
                    input.nextLine();
                    if(op == 1){
                        admin.setCargo("Gerente Administratvo");
                        admin.setSalario(5000.00);
                    }else if(op == 2){
                        admin.setCargo("Assitente Administratvo");
                        admin.setSalario(2500.00);
                    }
                    System.out.println("Digite o nome do funcionário: ");
                    admin.setNome(input.nextLine());
                    System.out.println("Digite a matrícula: ");
                    admin.setMatricula(input.nextInt());
                    input.nextLine();
                    System.out.println("Digite o CPF: ");
                    admin.setCpf(input.nextLine());
                    System.out.println("Digite o endereço: ");
                    admin.setEndereco(input.nextLine());
                    System.out.println("Digite o telefone: ");
                    admin.setTelefone(input.nextLine());
                    System.out.println("Digite o email: ");
                    admin.setEmail(input.nextLine());
                    cp.cadastrarAdmin(admin);
                    break;

                case 2:
                    System.out.println("==ATENDIMENTO==");

                    System.out.println("Escolha o cargo do funcionário:\n1 - Diretor de Atendimento 2 - Atendimento ao cliente");
                    int op1 = input.nextInt();
                    input.nextLine();
                    if(op1== 1){
                        atend.setCargo("Diretor de Atendimento");
                        atend.setSalario(6000.00);
                    }else if(op1 == 2){
                        atend.setCargo("Atendimento ao cliente");
                        atend.setSalario(3500.00);
                    }
                    System.out.println("Digite o nome do funcionário: ");
                    atend.setNome(input.nextLine());
                    System.out.println("Digite a matrícula: ");
                    atend.setMatricula(input.nextInt());
                    input.nextLine();
                    System.out.println("Digite o CPF: ");
                    atend.setCpf(input.nextLine());
                    System.out.println("Digite o endereço: ");
                    atend.setEndereco(input.nextLine());
                    System.out.println("Digite o telefone: ");
                    atend.setTelefone(input.nextLine());
                    System.out.println("Digite o email: ");
                    atend.setEmail(input.nextLine());
                    cp.cadastrarAtendente(atend);
                    break;

                case 3:
                    System.out.println("==DIREÇÃO GERAL==");
                    diretorGeral.setSalario(10000.00);
                    diretorGeral.setCargo("Diretor Geral");
                    System.out.println("Digite o nome do funcionário: ");
                    diretorGeral.setNome(input.nextLine());
                    System.out.println("Digite a matrícula: ");
                    diretorGeral.setMatricula(input.nextInt());
                    input.nextLine();
                    System.out.println("Digite o CPF: ");
                    diretorGeral.setCpf(input.nextLine());
                    System.out.println("Digite o endereço: ");
                    diretorGeral.setEndereco(input.nextLine());
                    System.out.println("Digite o telefone: ");
                    diretorGeral.setTelefone(input.nextLine());
                    System.out.println("Digite o email: ");
                    diretorGeral.setEmail(input.nextLine());
                    cp.cadastrarDG(diretorGeral);
                    break;

                case 4:
                    System.out.println("==MÍDIA==");
                    System.out.println("Escolha o cargo do funcionário:\n1 - Diretor de Mídia 2 - Planejador de Mídia 3 - Comprador de Mídia");
                    int op2 = input.nextInt();
                    input.nextLine();
                    if(op2== 1){
                        midia.setCargo("Diretor de Mídia");
                        midia.setSalario(6500.00);
                    }else if(op2 == 2){
                        midia.setCargo("Planejador de Mídia");
                        midia.setSalario(4500.00);
                    }else if(op2 == 3){
                        midia.setCargo("Comprador de Mídia");
                        midia.setSalario(4000.00);
                    }
                    System.out.println("Digite o nome do funcionário: ");
                    midia.setNome(input.nextLine());
                    System.out.println("Digite a matrícula: ");
                    midia.setMatricula(input.nextInt());
                    input.nextLine();
                    System.out.println("Digite o CPF: ");
                    midia.setCpf(input.nextLine());
                    System.out.println("Digite o endereço: ");
                    midia.setEndereco(input.nextLine());
                    System.out.println("Digite o telefone: ");
                    midia.setTelefone(input.nextLine());
                    System.out.println("Digite o email: ");
                    midia.setEmail(input.nextLine());
                    cp.cadastrarDM(midia);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("Deseja repetir? S ou N: ");
            repetir = input.nextLine();

        }while(repetir.equalsIgnoreCase("S"));
        cp.listaGeral();
    }
}