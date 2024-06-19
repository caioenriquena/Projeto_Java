import java.util.ArrayList;
import java.util.List;

public class DiretorGeral {

    private List<Funcionario> funcionarios;
    public DiretorGeral(){
        this.funcionarios = new ArrayList<>();
    }

    public List<Funcionario> getFuncionarios() {
        if(funcionarios == null){
            funcionarios = new ArrayList<Funcionario>();
        }
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "Departamento: Direção geral" + super.toString();
    }
}
