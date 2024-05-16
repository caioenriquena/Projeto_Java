import java.util.ArrayList;

public class OperacoesFuncionario {


    // ArrayList<Administracao> admins = new ArrayList<>();
    Administracao administracao;
    Atendimento atendimento;
    DiretorGeral diretorGeral;
    Midia midia;


    public OperacoesFuncionario() {
    }

    public void cadastrarAdmin(Funcionario funcionario) {
        if (administracao == null) {
            administracao = new Administracao();
        }
        administracao.getFuncionarios().add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void cadastrarAtendente(Funcionario funcionario) {
        if (atendimento == null) {
            atendimento = new Atendimento();
        }
        atendimento.getFuncionarios().add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void cadastrarDG(Funcionario funcionario) {
        if (diretorGeral == null) {
            diretorGeral = new DiretorGeral();
        }
        diretorGeral.getFuncionarios().add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void cadastrarDM(Funcionario funcionario) {
        if (midia == null) {
            midia = new Midia();
        }
        midia.getFuncionarios().add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void listaGeral() {
        try {
            System.out.println("\nDepartamento: Administração");

            for (Funcionario f : administracao.getFuncionarios()) {
                System.out.println(f);
                System.out.println("*".repeat(30));
            }
            System.out.println("\nDepartamento: Atendimento");
            for (Funcionario f : atendimento.getFuncionarios()) {
                System.out.println(f);
                System.out.println("*".repeat(30));
            }
            System.out.println("\nDepartamento: Direção Geral");
            for (Funcionario f : diretorGeral.getFuncionarios()) {
                System.out.println(f);
                System.out.println("*".repeat(30));
            }
            System.out.println("\nDepartamento: Mídia");
            for (Funcionario f : midia.getFuncionarios()) {
                System.out.println(f);
                System.out.println("*".repeat(30));
            }
        }catch (NullPointerException e ) {
            System.out.println("Departamento vazio");
        }


    }
}


