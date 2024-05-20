import java.util.Objects;

public class Funcionario {
    private String nome, cpf, endereco, email, telefone, cargo;
    private double salario, bruto;
    private String matricula;


    public Funcionario() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getBruto() {
        return bruto;
    }

    public void setBruto(double bruto) {
        this.bruto = bruto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double calcularSalarioLiquido(){
        return bruto - (bruto * 0.11);
    }

    @Override
    public String toString() {
        return
                "\nCargo: " + cargo +
                "\nNome: " + nome +
                "\nCpf: " + cpf +
                "\nEndereco: " + endereco +
                "\nEmail: " + email +
                "\nTelefone: " + telefone +
                "\nMatricula: " + matricula +
                "\nSalário: " + bruto +
                "\nSalário Líquido: " + calcularSalarioLiquido();
    }



    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, matricula);
    }
}
