//El programa pedirá al usuario que ingrese un número entero positivo.
//        Luego, el programa imprimirá todos los números desde 1 hasta el número ingresado,
//        indicando si cada número es par o impar.

package Actividad2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite número entero positivo");
        int numero = scanner.nextInt();


        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println( i + " Es par ");
            } else {
                System.out.println( i + " Es impar ");
            }
        }

    }

}

