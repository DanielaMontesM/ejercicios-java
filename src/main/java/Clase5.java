public class Clase5 {

    public static void main(String[] args) {

        int edad = 3;

        if (edad > 17) {
            System.out.println("es mayor de edad");
        } else {
            System.out.println("es menor de edad");
        }


        int diaSemana = 2;

        switch (diaSemana) {
            case 1:
                System.out.println("LUUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            default:
                System.out.println("Dia no valido");

        }
    }
}