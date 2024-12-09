package EmpresaXPTO;

public class Funcionario {
    String nome, endereco, naturalidade, profissao, grauInstrucao;
    int nascimento, matricula;
    float salario, funciCpf, funciRg;

    public void cadastrar(String no, int na, float rg, float cpf, String e, String nat, float s, String p, String i, int m){
        nome = no;
        nascimento = na;
        funciRg = rg;
        funciCpf = cpf;
        endereco = e;
        naturalidade = nat;
        salario = s;
        profissao = p;
        grauInstrucao = i;
        matricula = m;
    }

    public void alterar(String no, int na, float rg, float cpf, String e, String nat, float s, String p, String i, int m){
        nome = no;
        nascimento = na;
        funciRg = rg;
        funciCpf = cpf;
        endereco = e;
        naturalidade = nat;
        salario = s;
        profissao = p;
        grauInstrucao = i;
        matricula = m;
    }

    public void dadosFuncionario(){
        System.out.println("Nome: " + nome + "\nData de Nascimento: " + nascimento + "\nRG: " + funciRg + "\nCPF: " + funciCpf + "\nEndereço: " + endereco + "\nNaturalidade: " + naturalidade + "\nSalário: " + salario + "\nProfissão: " + profissao + "\nGrau de Instrução: " + grauInstrucao + "\nMatrícula: " + matricula);
    }
}
