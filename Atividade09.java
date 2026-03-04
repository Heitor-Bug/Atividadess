// Heitor Afonso Vieira de Almeida
// 1261947346

import java.util.Scanner;
public class Atividade09 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Preço do produto: ");
        double precoProduto = leia.nextDouble();
        System.out.print("Valor pago: ");
        double valorPago = leia.nextDouble();

        double troco = valorPago-precoProduto;

        System.out.print("\nTroco: R$" + troco);
    }
}
