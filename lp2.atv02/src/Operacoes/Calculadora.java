package Operacoes;

public class Calculadora {
    public static float Soma(float a, float b){
        return a + b;
    }

    public static float Subtracao(float a, float b){
        return a - b;
    }

    public static float Multiplicacao(float a, float b){
        return a * b;
    }

    public static float Divisao(float a, float b){
        if (b != 0){
            return a / b;
        } else {
            System.out.println("Não é possível realizar a operação.");
            return Float.NaN;
        }
    }
}
