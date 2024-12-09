package XPTOVeiculos;

public class ProgramaCarro {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        carro1.cadastrar(01,"Renault", "Branco", "Kwid", 2017, 4, "Gasolina", 7,15000, true);
        carro1.listar();

        Carro carro2 = new Carro();
        carro2.cadastrar(02,"FIAT", "Prata", "UNO", 2021, 4, "Diesel", 12,23000, true);
        carro2.listar();
        carro2.alterar(02,"FIAT", "Prata", "UNO", 2021, 4, "Diesel", 9,21500, true);
    }
}
