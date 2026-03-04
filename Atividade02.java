// Heitor Afonso Vieira de Almeida
// 1261947346

import java.util.Scanner;
public class Atividade02 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o valor de X: ");
        int x = leia.nextInt();
        System.out.print("Digite o valor de Y: ");
        int y = leia.nextInt();
        int resto = x%y;
        System.out.print("\n O resto da divisão de " + x + " por " + y + " é: " + resto);
    }
}
