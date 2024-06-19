import java.util.ArrayList;
import java.util.List;

public class Midia{
    private List<Funcionario> funcionarios;
    public Midia(){
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
        return "Departamento: Mídia" + super.toString();
    }
}
