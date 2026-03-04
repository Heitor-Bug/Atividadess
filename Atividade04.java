// Heitor Afonso Vieira de Almeida
// 1261947346

import java.util.Scanner;
public class Atividade04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o salário atual: ");
        double salarioAtual = leia.nextDouble();
        double salarioNovo = salarioAtual*1.07;
        System.out.print("Salário original: R$" + salarioAtual);
        System.out.print("\n Novo salário: R$" + salarioNovo);        
    }    
}
