// Heitor Afonso Vieira de Almeida
// 1261947346

import java.util.Scanner;
public class Atividade01 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double a = leia.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double b = leia.nextDouble();
        double divisao = a/b;
        double soma = a+b;
        double subtracao = a-b;
        double multiplicacao = a*b;
        System.out.print("\n Soma = " + soma);
        System.out.print("\n Subtração = " + subtracao);
        System.out.print("\n Multiplicação = " + multiplicacao);
        System.out.print("\n Divisão = " + divisao);
    }
}
