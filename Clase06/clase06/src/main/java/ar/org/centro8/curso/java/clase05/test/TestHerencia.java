package ar.org.centro8.curso.java.clase05.test;

import ar.org.centro8.curso.java.clase05.entities.Direccion;

public class TestHerencia {
    public static void main(String[] args) {
        
        System.out.println("--dir1--");
        Direccion dir1 = new Direccion("Medrano", 161, "1", "a", "Morón");
        System.out.println(dir1);

        System.out.println("--dir2--");
        Direccion dir2 = new Direccion("Lima", 200, "2", "B");
        System.out.println(dir2);



    }
    
}
