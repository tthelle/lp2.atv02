package JardimZoologico;

public class ProgramaAnimal {
    public static void main(String[] args){
        Animal animal1 = new Animal();
        animal1.cadastrar("Panda", 2015, "Juraci", 0034, "China");
        animal1.informacoes();

        Animal animal2 = new Animal();
        animal2.cadastrar("Girafa", 2022, "Gilberto", 0214, "Austrália");
        animal2.informacoes();

        animal2.alterar("Girafa", 2022, "Gilberto", 0314, "Austrália");
        animal2.informacoes();
    }
}
