// Heitor Afonso Vieira de Almeida
// 1261947346

import java.util.Scanner;
public class Atividade05 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a nota 1: ");
        double notaUm = leia.nextDouble();
        System.out.print("Digite a nota 2: ");
        double notaDois = leia.nextDouble();
        System.out.print("Digite a nota 3: ");
        double notaTres = leia.nextDouble();

        double media = (notaUm + notaDois + notaTres)/3;

        System.out.printf("\n Média: " + "%.2f", media);
    }
}
