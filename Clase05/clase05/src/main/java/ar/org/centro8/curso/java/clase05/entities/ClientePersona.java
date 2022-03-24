package ar.org.centro8.curso.java.clase05.entities;

public class ClientePersona {
    private int nro;
    private String nombre;
    private int edad;
    private Cuenta cuenta;

/*
Este constructor permite que un cliente pueda ser creado sin tener una cuenta
Se le puede agregar después una cuenta por set
*/
    public ClientePersona(int nro, String nombre, int edad){
        this.nro=nro;
        this.nombre=nombre;
        this.edad=edad;
    }

/*
Este constructor obliga a crear un cliente con una cuenta
Una cuenta puede pertenecer a varios clientes, así como está
*/
    public ClientePersona(int nro, String nombre, int edad, Cuenta cuenta){
        this.nro=nro;
        this.nombre=nombre;
        this.edad=edad;
        this.cuenta=cuenta;
   
    }

    @Override
    public String toString() {
        return "ClientePersona [cuenta=" + cuenta + ", edad=" + edad + ", nombre=" + nombre + ", nro=" + nro + "]";
    }

    public int getNro() {
        return nro;
    }



    public String getNombre() {
        return nombre;
    }



    public int getEdad() {
        return edad;
    }



    public Cuenta getCuenta() {
        return cuenta;
    }



    
    
}
