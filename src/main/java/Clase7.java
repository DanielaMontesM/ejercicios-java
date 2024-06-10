
import javax.swing.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Clase7 {

    public static void main(String[] args) {
     /*   sumar(1,2);
        LocalDate.now();

//*/
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Valor de i: " + i);
//        }
//
//
//        int i = 1;
//        do {
//            System.out.println("Valor de i: " + i);
//            i++;
//        } while (i <= 5);
//
//
//        i = 1;
//        while (i <= 5) {
//            System.out.println("Valor de i: " + i);
//            i++;
//        }
//    }
//
//    private static int sumar(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    private int resta(int num1, int num2) {
//        return num1 - num2;
//    }

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        System.out.println("Hola");
//        numeros.sort(Integer::compare);
//        numeros.stream().forEach(System.out::println);

        System.out.println("par");
        numeros.stream().filter(n-> n%2==0).forEach(System.out::println);
        System.out.println("no pares");
        numeros.stream().filter(n->n%2==1).forEach(System.out::println);

        List<String> palabras = Arrays.asList("java", "Lambda", "stream", "code", "example", "api");

        //palabras.stream().map(p-> p.toUpperCase()).forEach(System.out::println);

       // palabras.stream().filter(p-> p.length()>4).forEach(System.out::println);

        palabras.stream().filter(p-> p.startsWith("L")).forEach(System.out::println);



}

}