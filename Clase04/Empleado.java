public class Empleado {
    private int nroLegajo;
    private String nombre;
    private String apellido;
    private double sueldoBasico;

    //BOTÓN DERECHO SOURCE ACTION --> Generate Constructors
    public Empleado(int nroLegajo, String nombre, String apellido, double sueldoBasico) {
        this.nroLegajo = nroLegajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
    }
    //BOTÓN DERECHO SOURCE ACTION --> toString
    @Override
    public String toString() {
        return "Empleado [apellido=" + apellido + ", nombre=" + nombre + ", nroLegajo=" + nroLegajo + ", sueldoBasico="
                + sueldoBasico + "]";
    }

    //BOTÓN DERECHO SOURCE ACTION --> Generate Getters & Setters

    //Método GET: Devuelve atributo
    //Método SET: Permite ingresar atributo y cambiarlo
    //No cambiarle el nombre Get ni Set en Java porque no le gusta
    public int getNroLegajo() {
        
        return nroLegajo;
    }
    public void setNroLegajo(int nroLegajo) {
        //insert into control (user, ip, fecha, hora, nombre, terminal, acción) PARA BUCHONEAR QUIÉN FUE EL QUE HIZO EL CAMBIO
        this.nroLegajo = nroLegajo;
    }
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
    public double getSueldoBasico() {
        return sueldoBasico;
    }
    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    
/*
Si una línea se va a utilizar en distintos métodos, hay que crearla como un ASPECTO
El paradigma de aspectos te pone la línea mientras se ejecuta el código

Los objetos tienen un ciclo de vida muy corto, lo que persiste es la base de datos

En un videojuego son todos objetos en memoria



*/
    

//ATRIBUTOS





}