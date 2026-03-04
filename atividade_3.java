// Heitor Afonso Vieira de Almeida
// 1261947346

import java.util.Scanner;
public class atividade_3 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor em dólar: ");
        double dolar = leia.nextDouble();
        double cotacao = 4.95;
        double real = dolar*cotacao;
        System.out.println("Valor convertido: R$" + real);
    }
}
