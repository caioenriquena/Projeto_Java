import java.util.ArrayList;
import java.util.List;

public class Atendimento {

    private List<Funcionario> funcionarios;

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
        return "Departamento: Atendimento" + super.toString();
    }
}
