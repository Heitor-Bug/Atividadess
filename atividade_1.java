// Heitor Afonso Vieira de Almeida
// 1261947346

import java.util.Scanner;
public class atividade_1 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double a = leia.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double b = leia.nextDouble();
        double divisao = a/b;
        double soma = a+b;
        double subtracao = a-b;
        double multiplicacao = a*b;
        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);
    }
}
