import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;

public class OperacoesFuncionario {

    private List<Funcionario> administracao;
    private List<Funcionario> atendimento;
    private List<Funcionario> diretorGeral;
    private List<Funcionario> midia;

    private static final String FILE_PATH = "funcionarios.json";

    public OperacoesFuncionario() {
        administracao = new ArrayList<>();
        atendimento = new ArrayList<>();
        diretorGeral = new ArrayList<>();
        midia = new ArrayList<>();
        loadFromFile();

    }

    public void cadastrarAdmin(Funcionario funcionario) {
        administracao.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso no departamento de Administração!");
        salvarParaArquivo();
    }

    public void cadastrarAtendente(Funcionario funcionario) {
        atendimento.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso no departamento de Atendimento!");
        salvarParaArquivo();
    }

    public void cadastrarDG(Funcionario funcionario) {
        diretorGeral.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso no departamento de Direção Geral!");
        salvarParaArquivo();
    }

    public void cadastrarDM(Funcionario funcionario) {
        midia.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso no departamento de Mídia!");
        salvarParaArquivo();
    }

    public void listarSalariosPorDepartamento() {
        System.out.println("===Folha de Pagamento===");
        listarSalarios(administracao, "Administração");
        listarSalarios(atendimento, "Atendimento");
        listarSalarios(diretorGeral, "Direção Geral");
        listarSalarios(midia, "Mídia");
    }

    private void listarSalarios(List<Funcionario> funcionarios, String departamento) {
        for (Funcionario f : funcionarios) {
            System.out.println("Departamento: " + departamento);
            System.out.println("Funcionário: " + f.getNome());
            System.out.println("Matrícula: " + f.getMatricula());
            System.out.println("Salário Bruto: R$" + f.getBruto());
            System.out.println("Bônus: R$" + f.getBonus());
            System.out.println("Salário líquido (Salário bruto - 11% de impostos + Bônus): R$" + f.calcularSalarioLiquido());
            System.out.println("*".repeat(30));
        }
    }

    public void listaGeral() {
        listarFuncionarios(administracao, "Administração");
        listarFuncionarios(atendimento, "Atendimento");
        listarFuncionarios(diretorGeral, "Direção Geral");
        listarFuncionarios(midia, "Mídia");
    }

    private void listarFuncionarios(List<Funcionario> funcionarios, String departamento) {
        if (!funcionarios.isEmpty()) {
            System.out.println("\nDepartamento: " + departamento);
            for (Funcionario f : funcionarios) {
                System.out.println(f);
                System.out.println("*".repeat(30));
            }
        }
    }

    public void salvarParaArquivo() {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonObject jsonObject = new JsonObject();
            jsonObject.add("administracao", gson.toJsonTree(administracao));
            jsonObject.add("atendimento", gson.toJsonTree(atendimento));
            jsonObject.add("diretorGeral", gson.toJsonTree(diretorGeral));
            jsonObject.add("midia", gson.toJsonTree(midia));
            gson.toJson(jsonObject, writer);
            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
    }


    private void loadFromFile() {
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
            Type listType = new TypeToken<List<Funcionario>>() {}.getType();

            administracao = gson.fromJson(jsonObject.get("administracao"), listType);
            atendimento = gson.fromJson(jsonObject.get("atendimento"), listType);
            diretorGeral = gson.fromJson(jsonObject.get("diretorGeral"), listType);
            midia = gson.fromJson(jsonObject.get("midia"), listType);

            if (administracao == null) administracao = new ArrayList<>();
            if (atendimento == null) atendimento = new ArrayList<>();
            if (diretorGeral == null) diretorGeral = new ArrayList<>();
            if (midia == null) midia = new ArrayList<>();

            System.out.println("Dados carregados com sucesso!");
        } catch (IOException e) {
            System.out.println("Nenhum dado encontrado para carregar: " + e.getMessage());
        }
    }


    public static void cadastroAdmin(Scanner input, OperacoesFuncionario operacoesFuncionario) {
        System.out.println("==ADMINISTRAÇÃO==");
        System.out.println("Escolha o cargo do funcionário:\n1 - Gerente Administratvo 2 - Assitente Administrativo");
        int op = input.nextInt();
        input.nextLine();
        Funcionario funcionario = new Funcionario();
        if(op == 1){
            funcionario.setCargo("Gerente Administrativo");
            funcionario.setBruto(5000.00);

        }else if(op == 2){
            funcionario.setCargo("Assistente Administrativo");
            funcionario.setBruto(2500.00);

        }
        System.out.println("Digite o nome do funcionário: ");
        funcionario.setNome(input.nextLine());
        System.out.println("Digite a matrícula: ");
        funcionario.setMatricula(input.nextLine());
        System.out.println("Digite o CPF: ");
        funcionario.setCpf(input.nextLine());
        System.out.println("Digite o endereço: ");
        funcionario.setEndereco(input.nextLine());
        System.out.println("Digite o telefone: ");
        funcionario.setTelefone(input.nextLine());
        System.out.println("Digite o email: ");
        funcionario.setEmail(input.nextLine());
        System.out.println("Bônus salarial: R$");
        funcionario.setBonus(input.nextDouble());
        input.nextLine();
        funcionario.calcularSalarioLiquido();
        operacoesFuncionario.cadastrarAdmin(funcionario);

    }

    public static void cadastroMidia(Scanner input, OperacoesFuncionario operacoesFuncionario) {
        System.out.println("==MÍDIA==");
        System.out.println("Escolha o cargo do funcionário:\n1 - Diretor de Mídia 2 - Planejador de Mídia 3 - Comprador de Mídia");
        Funcionario funcionario = new Funcionario();
        int op2 = input.nextInt();
        input.nextLine();
        if(op2== 1){
            funcionario.setCargo("Diretor de Mídia");
            funcionario.setBruto(6500.00);

        }else if(op2 == 2){
            funcionario.setCargo("Planejador de Mídia");
            funcionario.setBruto(4500.00);

        }else if(op2 == 3){
            funcionario.setCargo("Comprador de Mídia");
            funcionario.setBruto(4000.00);

        }
        System.out.println("Digite o nome do funcionário: ");
        funcionario.setNome(input.nextLine());
        System.out.println("Digite a matrícula: ");
        funcionario.setMatricula(input.nextLine());
        System.out.println("Digite o CPF: ");
        funcionario.setCpf(input.nextLine());
        System.out.println("Digite o endereço: ");
        funcionario.setEndereco(input.nextLine());
        System.out.println("Digite o telefone: ");
        funcionario.setTelefone(input.nextLine());
        System.out.println("Digite o email: ");
        funcionario.setEmail(input.nextLine());
        System.out.println("Bônus salarial: R$");
        funcionario.setBonus(input.nextDouble());
        input.nextLine();
        funcionario.calcularSalarioLiquido();
        operacoesFuncionario.cadastrarDM(funcionario);
    }

    public static void cadastroDirecao(Scanner input, OperacoesFuncionario operacoesFuncionario) {
        System.out.println("==DIREÇÃO GERAL==");
        Funcionario funcionario = new Funcionario();
        funcionario.setBruto(10000.00);

        funcionario.setCargo("Diretor Geral");
        System.out.println("Digite o nome do funcionário: ");
        funcionario.setNome(input.nextLine());
        System.out.println("Digite a matrícula: ");
        funcionario.setMatricula(input.nextLine());
        System.out.println("Digite o CPF: ");
        funcionario.setCpf(input.nextLine());
        System.out.println("Digite o endereço: ");
        funcionario.setEndereco(input.nextLine());
        System.out.println("Digite o telefone: ");
        funcionario.setTelefone(input.nextLine());
        System.out.println("Digite o email: ");
        funcionario.setEmail(input.nextLine());
        System.out.println("Bônus salarial: R$");
        funcionario.setBonus(input.nextDouble());
        input.nextLine();
        funcionario.calcularSalarioLiquido();
        operacoesFuncionario.cadastrarDG(funcionario);
    }

    public static void cadastroAtendimento(Scanner input,OperacoesFuncionario operacoesFuncionario) {
        System.out.println("==ATENDIMENTO==");

        System.out.println("Escolha o cargo do funcionário:\n1 - Diretor de Atendimento 2 - Atendimento ao cliente");
        int op1 = input.nextInt();
        Funcionario funcionario = new Funcionario();
        input.nextLine();
        if(op1== 1){
            funcionario.setCargo("Diretor de Atendimento");
            funcionario.setBruto(6000.00);

        }else if(op1 == 2){
            funcionario.setCargo("Atendimento ao cliente");
            funcionario.setBruto(3500.00);

        }
        System.out.println("Digite o nome do funcionário: ");
        funcionario.setNome(input.nextLine());
        System.out.println("Digite a matrícula: ");
        funcionario.setMatricula(input.nextLine());
        System.out.println("Digite o CPF: ");
        funcionario.setCpf(input.nextLine());
        System.out.println("Digite o endereço: ");
        funcionario.setEndereco(input.nextLine());
        System.out.println("Digite o telefone: ");
        funcionario.setTelefone(input.nextLine());
        System.out.println("Digite o email: ");
        funcionario.setEmail(input.nextLine());
        System.out.println("Bônus salarial: R$");
        funcionario.setBonus(input.nextDouble());
        input.nextLine();
        funcionario.calcularSalarioLiquido();
        operacoesFuncionario.cadastrarAtendente(funcionario);
    }
}

