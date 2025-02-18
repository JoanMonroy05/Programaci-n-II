package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Ciculo circulo = new Ciculo();
        Rectangulo rect = new Rectangulo();
        
        System.out.println("Calulo del circulo");
        System.out.print("Ingresa el radio: ");
        double radio = scanner.nextDouble();
        circulo.setRadio(radio);
        circulo.calcularArea();
        
        System.out.println("\n Calculo del Rectangulo");
        System.out.print("Ingresa la base del triangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingresa la altura del triangulo: ");
        double altura = scanner.nextDouble();
        rect.setAltura(altura);
        rect.setBase(base);
        rect.calcularArea();
    }
    
}
