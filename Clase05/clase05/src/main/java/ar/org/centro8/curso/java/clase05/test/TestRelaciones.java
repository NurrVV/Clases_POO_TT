package ar.org.centro8.curso.java.clase05.test;

import ar.org.centro8.curso.java.clase05.entities.ClientePersona;
import ar.org.centro8.curso.java.clase05.entities.Cuenta;

public class TestRelaciones {
    public static void main(String[] args) {
        /*
        Objetos MOCKS (simulaciones)
        Testeo con objetos simulados

        Tenemos visibilidad por defecto a clases del mismo paquete 
        y clases del paquete java.lang
        
        */
        System.out.println("--Cuenta 1--");
        Cuenta cuenta1 = new Cuenta(1, "ARS$"); //Como la clase tiene parámetros hay que sí o sí colocarlos acá
        cuenta1.depositar(50000);
        cuenta1.depositar(80000);
        cuenta1.debitar(20000);
        System.out.println(cuenta1);

        System.out.println("--Cuenta 2--");
        Cuenta cuenta2 = new Cuenta(2, "ARS$");
        cuenta2.depositar(100000);
        cuenta2.debitar(50000);
        System.out.println(cuenta2);

        System.out.println("--clientePersona1--");
        ClientePersona clientePersona1 = new ClientePersona(1, "David", 26, new Cuenta(3, "ARS$"));
        clientePersona1.getCuenta().depositar(30000);
        System.out.println(clientePersona1);

        System.out.println("--clientePersona2--");
        ClientePersona clientePersona2 = new ClientePersona(2, "Ana", 24, clientePersona1.getCuenta()); //se apunta a la misma cuenta que el cliente1, no es que se copia sino que es la misma
        clientePersona2.getCuenta().debitar(10000);
        System.out.println(clientePersona2);
        System.out.println(clientePersona1);

    }
    
}
