package ar.org.centro8.curso.java.entities;

public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private static int velocidad;

    /*
        STATIC: 
    
    */

    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

        //como el atributo velocidad es static, el método que lo usa también tiene que ser static
    public static void acelerar(int kilometros){
        velocidad += kilometros;
    }
        //como el atributo velocidad es static, el método que lo usa también tiene que ser static
    public static void frenar(int kilometros){
        velocidad-=kilometros;

    }

    @Override
    public String toString() {
        return "Auto [color=" + color + ", marca=" + marca + ", modelo=" + modelo + "]";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getVelocidad() {
        return velocidad;
    }

    public static void setVelocidad(int velocidad) {
        Auto.velocidad = velocidad;
    }
    
    
    
}
