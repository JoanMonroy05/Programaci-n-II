package ejercicio2;

public class Ciculo extends Figura{
    private double radio;

    public Ciculo() {
    }

    public Ciculo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("El área es: " + (Math.pow(this.radio, 2) * Math.PI));
    }
    
    
}
