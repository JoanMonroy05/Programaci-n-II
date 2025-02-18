package ejercicio01;

public class Ejercicio01 {

    public static void main(String[] args) {
        Gato gato =  new Gato();
        System.out.print("El gato hace: ");
        gato.hacerSonido();
        
        Perro perro = new Perro();
        System.out.print("El perro hace: ");
        perro.hacerSonido();
        
    }
    
}
