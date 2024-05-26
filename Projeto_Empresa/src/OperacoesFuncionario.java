import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperacoesFuncionario {

    private Administracao administracao;
    private Atendimento atendimento;
    private DiretorGeral diretorGeral;
    private Midia midia;



    public OperacoesFuncionario() {

    }

    public void cadastrarAdmin(Funcionario funcionario) {
        if (administracao == null) {
            administracao = new Administracao();
        }
        administracao.getFuncionarios().add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso no departamento de Administração!");
    }

    public void cadastrarAtendente(Funcionario funcionario) {
        if (atendimento == null) {
            atendimento = new Atendimento();
        }
        atendimento.getFuncionarios().add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso no departamento de Atendimento!");
    }

    public void cadastrarDG(Funcionario funcionario) {
        if (diretorGeral == null) {
            diretorGeral = new DiretorGeral();
        }
        diretorGeral.getFuncionarios().add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso no departamento de Direção Geral!");
    }

    public void cadastrarDM(Funcionario funcionario) {
        if (midia == null) {
            midia = new Midia();
        }
        midia.getFuncionarios().add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso no departamento de Mídia!");
    }
    public void listarSalariosPorDepartamento() {
        System.out.println("===Folha de Pagamento===");

        try {
            if (administracao != null && administracao.getFuncionarios() != null) {

                for (Funcionario f : administracao.getFuncionarios()) {
                    System.out.println("Departamento: " + Departamentos.ADMINISTRACAO.getDpto());
                    System.out.println("Funcionario: " + f.getNome());
                    System.out.println("Matrícula: " + f.getMatricula());
                    System.out.println("Salário Bruto: R$" + f.getBruto());
                    System.out.println("Bônus: R$" + f.getBonus());

                    System.out.println("Salário líquido (Salário bruto - 11% de impostos + Bônus): R$" + f.calcularSalarioLiquido());
                    System.out.println("*".repeat(30));
                }
            }

            if (atendimento != null && atendimento.getFuncionarios() != null) {

                for (Funcionario f : atendimento.getFuncionarios()) {
                    System.out.println("Departamento: " + Departamentos.ATENDIMENTO.getDpto());
                    System.out.println("Funcionario: " + f.getNome());
                    System.out.println("Matrícula: " + f.getMatricula());
                    System.out.println("Salário Bruto: R$" + f.getBruto());
                    System.out.println("Bônus: R$" + f.getBonus());
                    System.out.println("Salário líquido (Salário bruto - 11% de impostos + Bônus): R$" + f.calcularSalarioLiquido());
                    System.out.println("*".repeat(30));
                }
            }

            if (diretorGeral != null && diretorGeral.getFuncionarios() != null) {

                for (Funcionario f : diretorGeral.getFuncionarios()) {
                    System.out.println("Departamento: " + Departamentos.DIRECAOGERAL.getDpto());
                    System.out.println("Funcionario: " + f.getNome());
                    System.out.println("Matrícula: " + f.getMatricula());
                    System.out.println("Salário Bruto: R$" + f.getBruto());
                    System.out.println("Bônus: R$" + f.getBonus());
                    System.out.println("Salário líquido (Salário bruto - 11% de impostos + Bônus): R$" + f.calcularSalarioLiquido());
                    System.out.println("*".repeat(30));
                }
            }

            if (midia != null && midia.getFuncionarios() != null) {

                for (Funcionario f : midia.getFuncionarios()) {
                    System.out.println("Departamento: " + Departamentos.MIDIA.getDpto());
                    System.out.println("Funcionario: " + f.getNome());
                    System.out.println("Matrícula: " + f.getMatricula());
                    System.out.println("Salário Bruto: R$" + f.getBruto());
                    System.out.println("Bônus: R$" + f.getBonus());
                    System.out.println("Salário líquido (Salário bruto - 11% de impostos + Bônus): R$" + f.calcularSalarioLiquido());
                    System.out.println("*".repeat(30));
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Departamento vazio");
        }
    }

    public void listaGeral() {
        try {
            if (administracao != null && administracao.getFuncionarios() != null) {
                System.out.println("\nDepartamento: Administração");
                for (Funcionario f : administracao.getFuncionarios()) {
                    System.out.println(f);
                    System.out.println("*".repeat(30));
                }
            }

            if (atendimento != null && atendimento.getFuncionarios() != null) {
                System.out.println("\nDepartamento: Atendimento");
                for (Funcionario f : atendimento.getFuncionarios()) {
                    System.out.println(f);
                    System.out.println("*".repeat(30));
                }
            }

            if (diretorGeral != null && diretorGeral.getFuncionarios() != null) {
                System.out.println("\nDepartamento: Direção Geral");
                for (Funcionario f : diretorGeral.getFuncionarios()) {
                    System.out.println(f);
                    System.out.println("*".repeat(30));
                }
            }

            if (midia != null && midia.getFuncionarios() != null) {
                System.out.println("\nDepartamento: Mídia");
                for (Funcionario f : midia.getFuncionarios()) {
                    System.out.println(f);
                    System.out.println("*".repeat(30));
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Departamento vazio");
        }
    }

    public static void cadastroAdmin(Scanner input, OperacoesFuncionario operacoesFuncionario) {
        System.out.println("==ADMINISTRAÇÃO==");
        System.out.println("Escolha o cargo do funcionário:\n1 - Gerente Administratvo 2 - Assitente Administrativo");
        int op = input.nextInt();
        input.nextLine();
        Funcionario funcionario = new Funcionario();
        if(op == 1){
            funcionario.setCargo("Gerente Administrativo");
            funcionario.setBruto(5000.00);

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
        System.out.println("Bônus salarial: R$");
        funcionario.setBonus(input.nextDouble());
        input.nextLine();
        funcionario.calcularSalarioLiquido();
        operacoesFuncionario.cadastrarAdmin(funcionario);

    }

    public static void cadastroMidia(Scanner input, OperacoesFuncionario operacoesFuncionario) {
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
        System.out.println("Bônus salarial: R$");
        funcionario.setBonus(input.nextDouble());
        input.nextLine();
        funcionario.calcularSalarioLiquido();
        operacoesFuncionario.cadastrarDM(funcionario);
    }

    public static void cadastroDirecao(Scanner input, OperacoesFuncionario operacoesFuncionario) {
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
        System.out.println("Bônus salarial: R$");
        funcionario.setBonus(input.nextDouble());
        input.nextLine();
        funcionario.calcularSalarioLiquido();
        operacoesFuncionario.cadastrarDG(funcionario);
    }

    public static void cadastroAtendimento(Scanner input,OperacoesFuncionario operacoesFuncionario) {
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
        System.out.println("Bônus salarial: R$");
        funcionario.setBonus(input.nextDouble());
        input.nextLine();
        funcionario.calcularSalarioLiquido();
        operacoesFuncionario.cadastrarAtendente(funcionario);
    }
}

