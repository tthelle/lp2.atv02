package FaculdadeXPTO;

public class ProgramaProfessor {
    public static void main(String[] args){
        Professor prof1 = new Professor();
        prof1.cadastrar("Josefo", "Doutor", "Biologia", 20, "Animais I", 7000);
        prof1.alterar("Josefo", "Doutor", "Biologia", 20, 6300);
        prof1.alterarDisciplina("Animais II, Corpo Humano I - Sistema Imunológico");
        prof1.dadosProfessor();

        Professor prof2 = new Professor();
        prof2.cadastrar("Amanda", "Mestra", "Ciências Sociais", 26, "Ciência Política", 12000);
        prof2.alterar("Amanda", "Mestra", "Ciências Sociais", 28, 1500);
        prof2.alterarDisciplina("Ciências Polìticas, Sociologia");
        prof2.dadosProfessor();
    }
}
