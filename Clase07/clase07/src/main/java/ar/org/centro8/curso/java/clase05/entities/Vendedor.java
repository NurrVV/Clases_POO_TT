package ar.org.centro8.curso.java.clase05.entities;

// Extends --> dice que hereda de - Vendedor HEREDA de Persona

public class Vendedor extends Persona{
    private int nroLegajo;
    private double sueldoBasico;

    public Vendedor(String nombre, int edad, Direccion direccion, int nroLegajo, double sueldoBasico) {
        super(nombre, edad, direccion); //super()--> LLAMA A UN CONSTRUCTOR DE LA SUPERCLASE
        this.nroLegajo = nroLegajo;
        this.sueldoBasico = sueldoBasico;
    }
    //Botón derecho\SourceAction\Override-Implement Methods
    @Override
    public void saludar() {
        // TODO Auto-generated method stub
        System.out.println("Hola, soy un vendedor!");
    }
    @Override
    public String toString() {
        return super.toString() + "Vendedor [nroLegajo=" + nroLegajo + ", sueldoBasico=" + sueldoBasico + "]";
    }
    public int getNroLegajo() {
        return nroLegajo;
    }
    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }
    public double getSueldoBasico() {
        return sueldoBasico;
    }
    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    
}
