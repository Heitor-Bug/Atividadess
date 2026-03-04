// Heitor Afonso Vieira de Almeida
// 1261947346

import java.util.Scanner;
public class atividade_2 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor de X: ");
        int x = leia.nextInt();
        System.out.println("Digite o valor de Y: ");
        int y = leia.nextInt();
        int resto = x%y;
        System.out.println("O resto da divisão de " + x + " por " + y + " é: " + resto);
    }
}
