package ar.org.centro8.curso.java.clase05.test;

import ar.org.centro8.curso.java.clase05.entities.Cliente;
import ar.org.centro8.curso.java.clase05.entities.Cuenta;
import ar.org.centro8.curso.java.clase05.entities.Direccion;
import ar.org.centro8.curso.java.clase05.entities.Persona;
import ar.org.centro8.curso.java.clase05.entities.Vendedor;

public class TestHerencia {
    public static void main(String[] args) {
        
        System.out.println("--dir1--");
        Direccion dir1 = new Direccion("Medrano", 161, "1", "a", "Morón");
        System.out.println(dir1);

        System.out.println("--dir2--");
        Direccion dir2 = new Direccion("Lima", 200, "2", "B");
        System.out.println(dir2);

        /* 
        System.out.println("--persona1--");
        Persona p1 = new Persona("Karina",38,dir1); //DA ERROR EN EL CONSTRUCTOR CUANDO ES CLASE ABSTRACTA, DEBIDO A QUE NO SE PUEDE CREAR OBJETO DE UNA CLASE ABSTRACTA
        System.out.println(p1);
        p1.saludar();

        System.out.println("--persona2--");
        Persona p2 = new Persona("Laura",26,p1.getDireccion());
        System.out.println(p2);
        p2.saludar();
        */

        System.out.println("--vendedor1--");
        Vendedor v1 = new Vendedor("Mariano", 28, dir2, 1, 100000);
        System.out.println(v1);
        v1.saludar();

        System.out.println("--vendedor2--");
        Vendedor v2 = new Vendedor("Carlotta", 21, new Direccion("Lima", 22, "1", "a"), 2, 150000);
        System.out.println(v2);
        v2.saludar();

        System.out.println("--Cuenta 1--");
        Cuenta cuenta1 = new Cuenta(1, "ARS$"); //Como la clase tiene parámetros hay que sí o sí colocarlos acá
        cuenta1.depositar(50000);
        cuenta1.depositar(80000);
        cuenta1.debitar(20000);
        System.out.println(cuenta1);

        System.out.println("--Cuenta 2--");
        Cuenta cuenta2 = new Cuenta(2, "ARS$"); // al decir new se le está asignando un nuevo lugar de memoria
        cuenta2.depositar(100000);
        cuenta2.debitar(50000);
        System.out.println(cuenta2);

        System.out.println("--cliente1--");
        Cliente cliente1 = new Cliente("Joaquín", 38, dir1, 1, cuenta1);
        System.out.println(cliente1);
        cliente1.saludar();

        System.out.println("--cliente2--");
        Cliente cliente2 = new Cliente("Enriquetto", 37, dir2, 2, cuenta2);
        System.out.println(cliente2);
        cliente2.saludar();

        System.out.println(cliente1.getClass()); //MENCIONA DATOS DE CLASE
        System.out.println(cliente1.getClass().getName());//NOMBRE ABREVIADO DE LA CLASE
        System.out.println(cliente1.getClass().getSimpleName()); //SOLAMENTE NOMBRE DE LA CLASE
        System.out.println(cliente1.getClass().getSuperclass()); //NOMBRE DE LA SUPERCLASE
        System.out.println(cliente1.getClass().getSuperclass().getName());

        System.out.println(cliente1.getClass().getSuperclass().getSuperclass().getSuperclass());

        System.out.println("".getClass().getName()); //PARA SABER CLASE DE OBJETO STRING
        System.out.println("".getClass().getSuperclass().getName());

        //EN JAVA OBJECT ES UN CONTENEDOR GLOBAL, sirve para tutti

        Persona p1 = new Vendedor("Doratti", 23, dir2, 4, 50000);
        Persona p2 = new Cliente("Martotta", 22, dir1, 5, cuenta2);

        p1.saludar();
        p2.saludar();

        //OPERADOR DE CASTEO 
        Vendedor vx=(Vendedor)p1; //Se castea para que pueda ser visto como un vendedor
        //OPERADOR TERNARIO
        Vendedor vy=(p1 instanceof Vendedor) ? (Vendedor) p1:null;

        


        /*

            POLIMORFISMO o POLIFORMISMO
            Dos objetos del mismo tipo pueden tener comportamientos distintos

         

         */





    }
        
    }
    

