package XPTOVeiculos;

public class Carro {

     int codigo, anoFab, numPortas, quantDisp;
     String marca, cor, modelo, tipoComb;
     boolean basico;
     float preco;

     public void cadastrar(int c, String ma, String co, String mo, int f, int pts, String comb, int qd, float p, boolean bas){
        codigo = c;
        marca = ma;
        cor = co;
        modelo = mo;
        anoFab = f;
        numPortas = pts;
        tipoComb = comb;
        quantDisp = qd;
        preco = p;
        basico = bas;
     }

     public void alterar(int c, String ma, String co, String mo, int f, int pts, String comb, int qd, float p, boolean bas){
         codigo = c;
         marca = ma;
         cor = co;
         modelo = mo;
         anoFab = f;
         numPortas = pts;
         tipoComb = comb;
         quantDisp = qd;
         preco = p;
         basico = bas;
     }

     public void listar(){
         System.out.println("Código do carro: " + codigo + "\nMarca: " + marca + "\nCor: " + cor + "\nModelo: " + modelo + "\nAno de fabricação: " + anoFab + "\nNúmero de portas: " + numPortas + "\nTipo de combustível: " + tipoComb + "\nQuantidade disponível: " + quantDisp + "\nPreço: " + preco);
         if (basico){
             System.out.println("Carro do tipo básico.");
         } else {
             System.out.println("Carro do tipo completo.");
         }
     }
}
