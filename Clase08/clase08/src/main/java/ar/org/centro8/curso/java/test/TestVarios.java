package ar.org.centro8.curso.java.test;

public class TestVarios {
    public static void main(String[] args) {

        //Clase java.lang.Object

        /*
            Clase Object: es la superclase de todas las clases de Java y todas las clases que podamos crear
                          Es un contenedor global
                          En el interior de la clase object se define un comportamiento que es heredado a todos los objetos
        
        
                          cuando un método es native es un método que no se ve en Java porque fue escrito en C
        */
        Object obj = new Object();

        //Clase interna (Inner Class)
        class Dato{
            int dato;

            public Dato(int dato) {
                this.dato = dato;
            }
      
        }

        Dato d1=new Dato(2);
        Dato d2 = d1;
        Dato d3 = new Dato(d1.dato); //tiene el mismo estado de dato pero es un lugar de memoria distinto
        Dato d4=new Dato(4);
        String d5="2"; //La clase String tiene sobreescrito el hashCode y se refiere al número ASCII
        // MÉTODO HASHCODE --> devuelve un entero
        System.out.println("d1.hashCode()= " + d1.hashCode());
        System.out.println("d2.hashCode()= " + d2.hashCode());
        System.out.println("d3.hashCode()= " + d3.hashCode());
        System.out.println("d4.hashCode()= " + d4.hashCode());
        System.out.println("d5.hashCode()= " + d5.hashCode()); 
//Si dos objetos tienen el mismo id son el mismo lugar de memoria
        


        //Clase java.lang.System


        //Clase java.lang.String



    }
    
}
