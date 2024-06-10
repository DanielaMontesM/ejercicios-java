package Actividad1;

public class Computador {

    private String id;
    private Float tamano;
    private Integer memoria;
    private String marca;

    public Computador() {
    }

    public Computador(String id, Float tamano, Integer memoria, String marca) {
        this.id = id;
        this.tamano = tamano;
        this.memoria = memoria;
        this.marca = marca;
    }

    public void PrenderComputador(){
        System.out.println("El computador " + marca + " se prendió");
    }

    public void ApagarComputador(){
        System.out.println("Apagar el computador " + marca);
    }

    public void ProyectarEnTV(){
        System.out.println("Se está proyectando en el TV el computador " + marca);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getTamano() {
        return tamano;
    }

    public void setTamano(Float tamano) {
        this.tamano = tamano;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}