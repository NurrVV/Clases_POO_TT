package ar.org.centro8.curso.java.clase05.entities;

//CLASE ABSTRACTA: Clase que no se puede instanciar. No se pueden crear objetos de la clase. Sí de clases hijas
//PERSONA ES LA SUPERCLASE --> public abstract class Persona {}
//Va a funcionar igual si no se la declara abstracta, pero por cuestiones de seguridad conviene que lo sea.

//FINAL: Una clase final es una clase que no puede tener clases hijas. Sí se pueden crear objetos de la clase final.
//También se la llama clase sellada

//VOID: Cuando no devuelve nada

//MÉTODO ABSTRACTOS: Son métodos que no tienen cuerpo, es decir que no tienen código. 
                    //Sólo pueden existir en clases abstractas
                    //Las clases hijas deben usar sí o sí los métodos de las clases abstractas

public abstract class Persona {
    private String nombre;
    private int edad;
    private Direccion direccion;

    public Persona(String nombre, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    /* 
    public void saludar(){
        System.out.println("Hola, soy una persona!");
    }
    */

    //Un método abstracto es uno que no tiene código
    public abstract void saludar(); //Cada clase hija deberá decir cómo saludar


    @Override
    public String toString() {
        return "Persona [direccion=" + direccion + ", edad=" + edad + ", nombre=" + nombre + "]";
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public Direccion getDireccion() {
        return direccion;
    }


    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    
    
    
}
