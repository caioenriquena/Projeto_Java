import java.util.ArrayList;
import java.util.List;
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
                    System.out.println("Salário líquido: R$" + f.calcularSalarioLiquido());
                    System.out.println("*".repeat(30));
                }
            }

            if (atendimento != null && atendimento.getFuncionarios() != null) {

                for (Funcionario f : atendimento.getFuncionarios()) {
                    System.out.println("Departamento: " + Departamentos.ATENDIMENTO.getDpto());
                    System.out.println("Funcionario: " + f.getNome());
                    System.out.println("Matrícula: " + f.getMatricula());
                    System.out.println("Salário líquido: R$" + f.calcularSalarioLiquido());
                    System.out.println("*".repeat(30));
                }
            }

            if (diretorGeral != null && diretorGeral.getFuncionarios() != null) {

                for (Funcionario f : diretorGeral.getFuncionarios()) {
                    System.out.println("Departamento: " + Departamentos.DIRECAOGERAL.getDpto());
                    System.out.println("Funcionario: " + f.getNome());
                    System.out.println("Matrícula: " + f.getMatricula());
                    System.out.println("Salário líquido: R$" + f.calcularSalarioLiquido());
                    System.out.println("*".repeat(30));
                }
            }

            if (midia != null && midia.getFuncionarios() != null) {

                for (Funcionario f : midia.getFuncionarios()) {
                    System.out.println("Departamento: " + Departamentos.MIDIA.getDpto());
                    System.out.println("Funcionario: " + f.getNome());
                    System.out.println("Matrícula: " + f.getMatricula());
                    System.out.println("Salário líquido: R$" + f.calcularSalarioLiquido());
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
}

