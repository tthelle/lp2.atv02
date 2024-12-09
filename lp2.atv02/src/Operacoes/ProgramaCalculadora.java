package Operacoes;
import java.util.Scanner;

public class ProgramaCalculadora {
    public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);

            System.out.print("Insira o primeiro número: ");
            float a = teclado.nextFloat();

            System.out.print("Insira o segundo número: ");
            float b = teclado.nextFloat();

            System.out.println("Escolha a operação a ser realizada:");
            System.out.println("1: Soma");
            System.out.println("2: Subtração");
            System.out.println("3: Multiplicação");
            System.out.println("4: Divisão");
            System.out.print("Digite o número correspondente à operação: ");
            int operacao = teclado.nextInt();

            float resultado;
            switch (operacao) {
                case 1:
                    resultado = Calculadora.Soma(a, b);
                    System.out.println("Resultado da soma: " + resultado);
                    break;
                case 2:
                    resultado = Calculadora.Subtracao(a, b);
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case 3:
                    resultado = Calculadora.Multiplicacao(a, b);
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case 4:
                    resultado = Calculadora.Divisao(a, b);
                    if (!Float.isNaN(resultado)) {
                        System.out.println("Resultado da divisão: " + resultado);
                    }
                    break;
                default:
                    System.out.println("Selecione uma opção válida.");
            }
            teclado.close();
        }
    }
