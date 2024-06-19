
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
                    operacoesFuncionario.listarSalariosPorDepartamento();
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
                    OperacoesFuncionario.cadastroAdmin(input, operacoesFuncionario);

                    break;

                case 2:
                    OperacoesFuncionario.cadastroAtendimento(input, operacoesFuncionario);
                    break;

                case 3:
                    OperacoesFuncionario.cadastroDirecao(input, operacoesFuncionario);
                    break;

                case 4:
                    OperacoesFuncionario.cadastroMidia(input, operacoesFuncionario);
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

}