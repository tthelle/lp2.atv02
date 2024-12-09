package FaculdadeXPTO;

public class Professor {
    String nome, titulacao, formacao, disciplinas;
    int cargaHoraria;
    float salario;

    public void cadastrar(String n, String t, String f, int c, String d, float s){
        nome = n;
        titulacao = t;
        formacao = f;
        cargaHoraria = c;
        disciplinas = d;
        salario = s;
    }

    public void alterar(String n, String t, String f, int c, float s){
        nome = n;
        titulacao = t;
        formacao = f;
        cargaHoraria = c;
        salario = s;
    }

    public void alterarDisciplina(String d){
        disciplinas = d;
    }

    public void dadosProfessor(){
        System.out.println("Nome: " + nome + "\nTitulação: " + titulacao + "\nFormação: " + formacao + "\nCarga horária: " + cargaHoraria + "\nDisciplinas: " + disciplinas + "\nSalário: " + salario);
    }
}
