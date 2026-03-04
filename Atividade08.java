// Heitor Afonso Vieira de Almeida
// 1261947346

import java.util.Scanner;
public class Atividade08 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = leia.nextDouble();

        double fahrenheit = (celsius*9.0/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.print("\n Fahrenheit: " + fahrenheit + " °F");
        System.out.print("\n Kelvin: " + kelvin + " K");
    }
}
