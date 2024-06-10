public class Persona {

    public Persona() {
    }

    public Persona(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Persona(String id, short edad, char genero, String nombreCompleto, float altura) {
        this.id = id;
        this.edad = edad;
        this.genero = genero;
        this.nombreCompleto = nombreCompleto;
        this.altura = altura;
    }

    public String id;
    public short edad;
    public char genero;
    public String nombreCompleto;
    public float altura;

    void correr() {

    }

    void trabajr() {

    }

    void dormir() {

    }

    void comer() {

    }

    void estudiar() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
