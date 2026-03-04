// Heitor Afonso Vieira de Almeida
// 1261947346


import java.util.Scanner;
public class Atividade06 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a base (em cm): ");
        double base = leia.nextDouble();
        System.out.print("Digite a altura (em cm): ");
        double altura = leia.nextDouble();

        double areaRetangulo = base*altura;

        System.out.print("\n Área do retângulo: " + areaRetangulo + " cm²");
    }
}
