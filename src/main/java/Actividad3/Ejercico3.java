//Escribe un programa que verifique si una cadena de texto es un palíndromo.
//Un palíndromo es una palabra, frase, número u otra secuencia de caracteres que se lee igual de adelante hacia atrás
//y de atrás hacia adelante (ignorando espacios, puntuación y mayúsculas).

package Actividad3;

import java.util.Scanner;

public class Ejercico3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite cadena de texto");
        String palabrasOriginal = scanner.nextLine();
        System.out.println("Frase del Usuario: " + palabrasOriginal);

        palabrasOriginal = palabrasOriginal.toUpperCase();
        //System.out.println("Frase en mayúsculas: " + palabrasOriginal);

        palabrasOriginal = palabrasOriginal.replaceAll(" ", "");
        //System.out.println("Frase en mayúsculas y sin espacios: " + palabrasOriginal);

        //System.out.println(palabrasOriginal.charAt(4));
        String palabrasAlReves = "";

        for (int i = palabrasOriginal.length() - 1; i >= 0; i--) {
            // System.out.println(palabrasOriginal.charAt(i));
            palabrasAlReves = palabrasAlReves + palabrasOriginal.charAt(i);
        }
        System.out.println("Palabra al revés es: " + palabrasAlReves);


        if (palabrasOriginal.equals(palabrasAlReves)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }

    }
}
