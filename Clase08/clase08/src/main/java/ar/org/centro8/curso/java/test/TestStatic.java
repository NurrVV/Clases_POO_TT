package ar.org.centro8.curso.java.test;

import ar.org.centro8.curso.java.entities.Auto;

public class TestStatic {
    public static void main(String[] args) {
        /*
            MODIFICADOR STATIC:
                            Los miembros estáticos (atributos o métodos) pertenecen a la clase y no a los objetos de la misma. Pueden ser usados sin crear un objeto de la clase
                            Los miembros estáticos pueden ser llamados sin crear un objeto de la clase
                            Los atributos estáticos que sean llamados desde un método requiere que el método sea static
                            Se pueden usar los miembros estáticos sin llamar a la clase

                            ¡CUIDADO! No abusar del static porque no es programación orientada a objetos

                            final es constante, nunca puede cambiar
                            un atributo static en una clase será igual para todos los objetos de esa clase. Si la clase tiene atributo color rojo, todos los objetos de esa clase serán colorados

                            Lo final y static se guarda en un lugar de memoria con mayor rapidez de acceso, consumen menos memoria

                            En los fantasmitas del pacman la velocidad debería ser atributo estático porque aceleran todos a la misma vez
                            
        
        */

        Auto.acelerar(10);
        
        System.out.println("--auto1--");
        Auto auto1 = new Auto("Fiat", "Idea", "Verde");
        Auto.acelerar(20);
        System.out.println(auto1+" "+Auto.getVelocidad());

        System.out.println("--auto2--");
        Auto auto2 = new Auto("WV", "Gol", "Gris");
        Auto.acelerar(20);
        System.out.println(auto2+" "+Auto.getVelocidad()); //como la velocidad es estática, pertenece a la clase y ya tenía los otros 20 del auto1, entonces da 40



    }
    
}
