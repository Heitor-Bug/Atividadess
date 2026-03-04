// Heitor Afonso Vieira de Almeida
// 1261947346

import java.util.Scanner;
public class Atividade03 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o valor em dólar: ");
        double dolar = leia.nextDouble();
        double cotacao = 4.95;
        double real = dolar*cotacao;
        System.out.print("\n Valor convertido: R$" + real);
    }
}
