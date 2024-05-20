import java.util.ArrayList;
import java.util.List;
public class OperacoesFuncionario {

    private Administracao administracao;
    private Atendimento atendimento;
    private DiretorGeral diretorGeral;
    private Midia midia;

    private List<Double> salariosAdmin;
    private List<Double> salariosAtendimento;
    private List<Double> salariosDirecao;
    private List<Double> salariosMidia;

    public OperacoesFuncionario() {
        salariosAdmin = new ArrayList<>();
        salariosAtendimento = new ArrayList<>();
        salariosDirecao = new ArrayList<>();
        salariosMidia = new ArrayList<>();
    }

    public void cadastrarAdmin(Funcionario funcionario) {
        if (administracao == null) {
            administracao = new Administracao();
        }
        administracao.getFuncionarios().add(funcionario);
        salariosAdmin.add(funcionario.calcularSalarioLiquido());
        System.out.println("Funcionário cadastrado com sucesso no departamento de Administração!");
    }

    public void cadastrarAtendente(Funcionario funcionario) {
        if (atendimento == null) {
            atendimento = new Atendimento();
        }
        atendimento.getFuncionarios().add(funcionario);
        salariosAtendimento.add(funcionario.calcularSalarioLiquido());
        System.out.println("Funcionário cadastrado com sucesso no departamento de Atendimento!");
    }

    public void cadastrarDG(Funcionario funcionario) {
        if (diretorGeral == null) {
            diretorGeral = new DiretorGeral();
        }
        diretorGeral.getFuncionarios().add(funcionario);
        salariosDirecao.add(funcionario.calcularSalarioLiquido());
        System.out.println("Funcionário cadastrado com sucesso no departamento de Direção Geral!");
    }

    public void cadastrarDM(Funcionario funcionario) {
        if (midia == null) {
            midia = new Midia();
        }
        midia.getFuncionarios().add(funcionario);
        salariosMidia.add(funcionario.calcularSalarioLiquido());
        System.out.println("Funcionário cadastrado com sucesso no departamento de Mídia!");
    }
    public void listarSalariosPorDepartamento() {
        System.out.println("Salários por Departamento:");

        if (administracao != null) {
            System.out.println("Administração:");
            for (Double salario : salariosAdmin) {
                System.out.println(salario);
            }
        }

        if (atendimento != null) {
            System.out.println("Atendimento:");
            for (Double salario : salariosAtendimento) {
                System.out.println(salario);
            }
        }

        if (diretorGeral != null) {
            System.out.println("Direção Geral:");
            for (Double salario : salariosDirecao) {
                System.out.println(salario);
            }
        }

        if (midia != null) {
            System.out.println("Mídia:");
            for (Double salario : salariosMidia) {
                System.out.println(salario);
            }
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

