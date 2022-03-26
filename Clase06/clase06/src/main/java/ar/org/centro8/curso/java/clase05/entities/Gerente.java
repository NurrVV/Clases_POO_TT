package ar.org.centro8.curso.java.clase05.entities;

public class Gerente {
    private int nroLegajo;
    private String nombre;
    private Auto limosina;

    public Gerente(int nroLegajo, String nombre, String marca, String modelo){
        this.nroLegajo = nroLegajo;
        this.nombre = nombre;
        this.limosina = new Auto(marca, modelo, "Negro");
    }

    @Override
    public String toString() {
        return "Gerente [limosina=" + limosina + ", nombre=" + nombre + ", nroLegajo=" + nroLegajo + "]";
    }
    
    
}
