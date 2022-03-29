package ar.org.centro8.curso.java.clase05.entities;

public class Representante {
    private int nroLegajo;
    private String nombre;
    private Auto auto;

    public Representante(int nroLegajo, String nombre) {
        this.nroLegajo = nroLegajo;
        this.nombre = nombre;
    }

    public Representante(int nroLegajo, String nombre, String marca, String modelo, String color) {
        this.nroLegajo = nroLegajo;
        this.nombre = nombre;
        this.auto = new Auto(marca, modelo, color);
    }

    public void cambiarAuto(String marca, String modelo, String color){
        this.auto = new Auto(marca, modelo, color);
    }

    @Override
    public String toString() {
        return "Representante [auto=" + auto + ", nombre=" + nombre + ", nroLegajo=" + nroLegajo + "]";
    }
    
}
