import java.util.ArrayList;

public class CadastrarFuncionario {

    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    ArrayList<Administracao> admins = new ArrayList<>();
    ArrayList<Atendimento> atendimentos = new ArrayList<>();
    ArrayList<DiretorGeral> diretoresGerais = new ArrayList<>();
    ArrayList<Midia> diretoresMidia = new ArrayList<>();

    public void cadastrarAdmin(Administracao admin){
        admins.add(admin);
        System.out.println("Funcionário cadastrado com sucesso!");
    }
    public void cadastrarAtendente(Atendimento atend){
        atendimentos.add(atend);
        System.out.println("Funcionário cadastrado com sucesso!");
    }
    public void cadastrarDG(DiretorGeral dg){
        diretoresGerais.add(dg);
        System.out.println("Funcionário cadastrado com sucesso!");
    }
    public void cadastrarDM(Midia dm){
        diretoresMidia.add(dm);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void listaGeral() {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.addAll(atendimentos);
        funcionarios.addAll(admins);
        funcionarios.addAll(diretoresGerais);
        funcionarios.addAll(diretoresMidia);

        for (Funcionario f : funcionarios) {
            if (f instanceof Administracao) {
                System.out.println(f);
                System.out.println("*".repeat(30));
            } else if (f instanceof Atendimento) {
                System.out.println(f);
                System.out.println("*".repeat(30));
            } else if (f instanceof DiretorGeral){
                System.out.println(f);
                System.out.println("*".repeat(30));
            }else if (f instanceof Midia){
                System.out.println(f);
                System.out.println("*".repeat(30));
            }
        }
    }

}
