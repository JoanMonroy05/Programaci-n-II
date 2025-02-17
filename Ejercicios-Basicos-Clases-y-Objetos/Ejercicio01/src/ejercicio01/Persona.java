package ejercicio01;

public class Persona {
    String nombre;
    String apellido;
    int edad;
    double altura;
    /* Constuctores */
    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
    }
    /* Getters and Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /* Métodos adicionales */
    public void cumplirAnios() {
        this.edad += 1;
    }

    public void mostrarInfo() {
        System.out.println("Nombres y Apelidos: " + this.nombre + " " + this.apellido);
        System.out.println("Edad: " + this.edad);
        System.out.println("Altura: " + this.altura);
    }
}
