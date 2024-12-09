package EmpresaXPTO;

public class ProgramaFuncionario {
    public static void main(String[] args){
        Funcionario func1 = new Funcionario();
        func1.cadastrar("Jonas", 23101997, 2134567899, 987678546,"Recursos Humanos", "Ipiraense", 12300, "RH", "Ensino superior", 9765);
        func1.alterar("Alice", 23101997, 2134567899, 987678546,"Recursos Humanos", "Ipiraense", 12300, "RH", "Ensino superior", 9765);

        func1.dadosFuncionario();
    }
}
