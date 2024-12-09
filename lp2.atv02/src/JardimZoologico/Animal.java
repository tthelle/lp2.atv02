package JardimZoologico;

public class Animal {
    String especie, nome, localNasc;
    int anoNasc,numRegistro;

    public void cadastrar(String e, int nasc, String n, int num, String l){
        especie = e;
        anoNasc = nasc;
        nome = n;
        numRegistro = num;
        localNasc = l;
    }

    public void alterar(String e, int nasc, String n, int num, String l){
        especie = e;
        anoNasc = nasc;
        nome = n;
        numRegistro = num;
        localNasc = l;
    }

    public void informacoes(){
        System.out.println("Espécie: " + especie + "\nAno de nascimento: " + anoNasc + "\nNome: " + nome + "\nNúmero do registro: " + numRegistro + "\nLocal de nascimento: " + localNasc);
    }
}
