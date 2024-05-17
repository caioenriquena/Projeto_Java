
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    exibirMenuPrincipal();

    }

    public static void exibirMenuPrincipal() {
        Scanner input = new Scanner(System.in);
        String repetir = "S";
        OperacoesFuncionario operacoesFuncionario = new OperacoesFuncionario();
        do{
            System.out.println("=====MENU PRINCIPAL=====");
            System.out.println("Escolha a opção:");
            System.out.println("1 - Cadastrar, 2 - Listar, 3 - Folha de Pagamento, 0 - Encerrar");
            int opcaoPrincipal = input.nextInt();
            input.nextLine();


            switch (opcaoPrincipal) {

                case 1:

                    cadastrarFuncionarios(input, operacoesFuncionario);

                    break;
                case 2:
                    operacoesFuncionario.listaGeral();
                    break;
                case 3:
                    // Lógica para folha de pagamento
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }



        }while(repetir.equalsIgnoreCase("S"));

    }




    private static void cadastrarFuncionarios(Scanner input, OperacoesFuncionario operacoesFuncionario) {
        String escolha = "s";

        do {

            System.out.println("=====CADASTRO DE FUNCIONÁRIOS=====");
            System.out.println("Escolha o departamento:");
            System.out.println("1 - Administração, 2 - Atendimento, 3 - Direção geral, 4 - Mídia, 5 - Voltar, 0 - Encerrar");
            int opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {

                case 1:
                    cadastroAdmin(input, operacoesFuncionario);

                    break;

                case 2:
                    cadastroAtendimento(input, operacoesFuncionario);
                    break;

                case 3:
                    cadastroDirecao(input, operacoesFuncionario);
                    break;

                case 4:
                    cadastroMidia(input, operacoesFuncionario);
                    break;
                case 5:
                    exibirMenuPrincipal();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("Deseja repetir? S ou N: ");
            escolha = input.nextLine();


        } while (escolha.equalsIgnoreCase("S"));

    }

    private static void cadastroMidia(Scanner input, OperacoesFuncionario operacoesFuncionario) {
        System.out.println("==MÍDIA==");
        System.out.println("Escolha o cargo do funcionário:\n1 - Diretor de Mídia 2 - Planejador de Mídia 3 - Comprador de Mídia");
        Funcionario funcionario = new Funcionario();
        int op2 = input.nextInt();
        input.nextLine();
        if(op2== 1){
            funcionario.setCargo("Diretor de Mídia");
            funcionario.setBruto(6500.00);
        }else if(op2 == 2){
            funcionario.setCargo("Planejador de Mídia");
            funcionario.setBruto(4500.00);
        }else if(op2 == 3){
            funcionario.setCargo("Comprador de Mídia");
            funcionario.setBruto(4000.00);
        }
        System.out.println("Digite o nome do funcionário: ");
        funcionario.setNome(input.nextLine());
        System.out.println("Digite a matrícula: ");
        funcionario.setMatricula(input.nextLine());
        System.out.println("Digite o CPF: ");
        funcionario.setCpf(input.nextLine());
        System.out.println("Digite o endereço: ");
        funcionario.setEndereco(input.nextLine());
        System.out.println("Digite o telefone: ");
        funcionario.setTelefone(input.nextLine());
        System.out.println("Digite o email: ");
        funcionario.setEmail(input.nextLine());
        operacoesFuncionario.cadastrarDM(funcionario);
    }

    private static void cadastroDirecao(Scanner input, OperacoesFuncionario operacoesFuncionario) {
        System.out.println("==DIREÇÃO GERAL==");
        Funcionario funcionario = new Funcionario();
        funcionario.setBruto(10000.00);
        funcionario.setCargo("Diretor Geral");
        System.out.println("Digite o nome do funcionário: ");
        funcionario.setNome(input.nextLine());
        System.out.println("Digite a matrícula: ");
        funcionario.setMatricula(input.nextLine());
        System.out.println("Digite o CPF: ");
        funcionario.setCpf(input.nextLine());
        System.out.println("Digite o endereço: ");
        funcionario.setEndereco(input.nextLine());
        System.out.println("Digite o telefone: ");
        funcionario.setTelefone(input.nextLine());
        System.out.println("Digite o email: ");
        funcionario.setEmail(input.nextLine());
        operacoesFuncionario.cadastrarDG(funcionario);
    }

    private static void cadastroAtendimento(Scanner input,OperacoesFuncionario operacoesFuncionario) {
        System.out.println("==ATENDIMENTO==");

        System.out.println("Escolha o cargo do funcionário:\n1 - Diretor de Atendimento 2 - Atendimento ao cliente");
        int op1 = input.nextInt();
        Funcionario funcionario = new Funcionario();
        input.nextLine();
        if(op1== 1){
            funcionario.setCargo("Diretor de Atendimento");
            funcionario.setBruto(6000.00);
        }else if(op1 == 2){
            funcionario.setCargo("Atendimento ao cliente");
            funcionario.setBruto(3500.00);
        }
        System.out.println("Digite o nome do funcionário: ");
        funcionario.setNome(input.nextLine());
        System.out.println("Digite a matrícula: ");
        funcionario.setMatricula(input.nextLine());
        System.out.println("Digite o CPF: ");
        funcionario.setCpf(input.nextLine());
        System.out.println("Digite o endereço: ");
        funcionario.setEndereco(input.nextLine());
        System.out.println("Digite o telefone: ");
        funcionario.setTelefone(input.nextLine());
        System.out.println("Digite o email: ");
        funcionario.setEmail(input.nextLine());
        operacoesFuncionario.cadastrarAtendente(funcionario);
    }

    private static void cadastroAdmin(Scanner input, OperacoesFuncionario cp) {
        System.out.println("==ADMINISTRAÇÃO==");
        System.out.println("Escolha o cargo do funcionário:\n1 - Gerente Administratvo 2 - Assitente Administrativo");
        int op = input.nextInt();
        input.nextLine();
        Funcionario funcionario = new Funcionario();
        if(op == 1){
            funcionario.setCargo("Gerente Administrativo");
            funcionario.setBruto(5000.00);
            funcionario.calcularSalario();
        }else if(op == 2){
            funcionario.setCargo("Assistente Administrativo");
            funcionario.setBruto(2500.00);
        }
        System.out.println("Digite o nome do funcionário: ");
        funcionario.setNome(input.nextLine());
        System.out.println("Digite a matrícula: ");
        funcionario.setMatricula(input.nextLine());
        System.out.println("Digite o CPF: ");
        funcionario.setCpf(input.nextLine());
        System.out.println("Digite o endereço: ");
        funcionario.setEndereco(input.nextLine());
        System.out.println("Digite o telefone: ");
        funcionario.setTelefone(input.nextLine());
        System.out.println("Digite o email: ");
        funcionario.setEmail(input.nextLine());
        cp.cadastrarAdmin(funcionario);

    }
}