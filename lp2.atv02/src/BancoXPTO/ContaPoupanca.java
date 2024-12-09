package BancoXPTO;

public class ContaPoupanca {
    String nome, agencia;
    float pessoaRg, pessoaCpf;
    int numero;
    float saldo;

    public void cadastrar(String n, float rg, float cpf, float s, int num, String a){
       nome = n;
       pessoaRg = rg;
       pessoaCpf = cpf;
       saldo = s;
       numero = num;
       agencia = a;
    }

    public void alterar(String n, float rg, float cpf, float s, int num, String a){
        nome = n;
        pessoaRg = rg;
        pessoaCpf = cpf;
        saldo = s;
        numero = num;
        agencia = a;
    }

    public void imprimirSaldo(){
        System.out.println("Saldo da conta: " + saldo);
    }
}
