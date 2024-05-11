public class Funcionario {
    private String nome, cpf, endereco, email, telefone, cargo;
    private Double salario, matricula, bruto;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getBruto() {
        return bruto;
    }

    public void setBruto(Double bruto) {
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getMatricula() {
        return matricula;
    }

    public void setMatricula(Double matricula) {
        this.matricula = matricula;
    }

    public void calcularSalario(){
        salario = bruto - (bruto * 0.11);
    }
}
