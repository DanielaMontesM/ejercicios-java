package Actividad0;

import java.util.Scanner;


public class PesoDolar {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Digite el valor de pesos que desea convertir");
        double valor = scanner.nextDouble();

        double dolar= 3848;
        String valorRedondeado = String.format("%.2f", valor/dolar);

        System.out.println("el resultado de la conversión es " + valorRedondeado + " dólares.");

        scanner.close();

    }
}
