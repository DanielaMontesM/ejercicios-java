package Actividad1;

public class Principal {
    public static void main(String[] args) {

        Computador miComputador = new Computador();
        miComputador.setTamano(16.0f);
        miComputador.setMarca("Lenovo");
        miComputador.PrenderComputador();
        miComputador.ApagarComputador();
        System.out.println("El tamaño de la pantalla de mi computador es:" + miComputador.getTamano());


        System.out.println();

        Computador pcLuis = new Computador("1", 14.0f, 512, "DELL");
        pcLuis.PrenderComputador();

    }
}
