package ar.org.centro8.curso.java.clase05.entities;

public class Cliente extends Persona{
    private int nroCliente;
    private Cuenta cuenta;
    
    public Cliente(String nombre, int edad, Direccion direccion, int nroCliente, Cuenta cuenta) {
        super(nombre, edad, direccion);
        this.nroCliente = nroCliente;
        this.cuenta = cuenta;
    }

    @Override
    public void saludar() {
        // TODO Auto-generated method stub
        System.out.println("Hola, soy un cliente!");
         
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente [cuenta=" + cuenta + ", nroCliente=" + nroCliente + "]";
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    
    
    
}
