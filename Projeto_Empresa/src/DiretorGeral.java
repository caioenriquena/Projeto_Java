import java.util.ArrayList;
import java.util.List;

public class DiretorGeral extends Funcionario{

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

//    public String departamento, formacao;
//    public int tempoServico;
//
//
//
//    public String getDepartamento() {
//        return departamento;
//    }
//
//    public void setDepartamento(String departamento) {
//        this.departamento = departamento;
//    }
//
//    public String getFormacao() {
//        return formacao;
//    }
//
//    public void setFormacao(String formacao) {
//        this.formacao = formacao;
//    }
//
//    public int getTempoServico() {
//        return tempoServico;
//    }
//
//    public void setTempoServico(int tempoServico) {
//        this.tempoServico = tempoServico;
//    }


    @Override
    public String toString() {
        return "Departamento: Direção geral" + super.toString();
    }
}
