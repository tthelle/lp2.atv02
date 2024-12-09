package BancoXPTO;

public class ProgramaConta {
    public static void main(String[] args) {
        ContaPoupanca conta1 = new ContaPoupanca();
        conta1.cadastrar("Daniel", 984754234, 654376567, 13890, 0001, "Bradesco");
        conta1.imprimirSaldo();

        conta1.alterar("Daniel", 984754234, 654376567, 34000, 0001, "Bradesco");
        conta1.imprimirSaldo();

        ContaPoupanca conta2 = new ContaPoupanca();
        conta2.cadastrar("Bianca", 987654321, 999999999, 4560, 0002, "Sicoob");
        conta2.imprimirSaldo();

        conta2.alterar("Bianca", 987654321, 999999999, 2300, 0002, "Sicoob");
        conta2.imprimirSaldo();
    }
}
