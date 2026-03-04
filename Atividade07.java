// Heitor Afonso Vieira de Almeida
// 1261947346

import java.util.Scanner;
public class Atividade07 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Distância percorrida (km): ");
        double distanciaPercorrida = leia.nextDouble();
        System.out.print("Combustível gasto (litros): ");
        double combustivelGasto = leia.nextDouble();

        double consumoMedio = distanciaPercorrida/combustivelGasto;

        System.out.print("\n Consumo médio: " + consumoMedio + " km/l");
    }
}
