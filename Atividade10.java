// Heitor Afonso Vieira de Almeida
// 1261947346

import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Distância (km): ");
        double distancia = leia.nextDouble();
        System.out.print("Velocidade média (km/h): ");
        double velocidadeMedia = leia.nextDouble();
        
        double tempoHoras = distancia/velocidadeMedia;
        int horas = (int) tempoHoras;
        int minutos = (int) ((tempoHoras - horas) * 60);

        System.out.println("Tempo estimado: " + horas + " horas  e " + minutos + " minutos");
    }
}
