package ar.org.centro8.curso.java.clase11.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ar.org.centro8.curso.java.clase11.entities.Persona;

public class TestCollection {
    public static void main(String[] args) {
        //Colecciones

        Persona[] personas=new Persona[4]; //sólo ingresarán 4 objetos, no es dinámico, el vector es estático
        //El vector es estático. C++ y Java son los únicos con vectores estáticos.

        personas[0] = new Persona("Carlotta","Pepperoni",34);
        personas[1] = new Persona("Risotta","Geranio",55);
        personas[2] = new Persona("Resquecho","Rotur",67);
        personas[3] = new Persona("Pendorcho","Salame",77);

        //Recorro el vector por índice
        //El vector es más lento y consume más memoria

        // for(int a=0;a<personas.length;a++){
        //     System.out.println(personas[a]);
        // }
            
        //Si se quiere extender el vector se puede crear un vector adicional y destruir el anterior pero no es lo más óptimo
        
        //COLECCIÓN: Representa un vector, se puede agrandar, achicar, meter nuevos objetos en distintas partes

        //Recorrido forEach --> estructura que permite recorrer la colección. JDK 5 en adelante
            for (Persona persona : personas) { //De la lista persona por cada (:) elemento voy a tener una variable persona de la clase Persona (se lee de atrás para adelante)
                System.out.println(persona);
                
            }
        //List--> Lista tipo vector con índices

        //Interface List
        //Representa una lista dinámica tipo vector con índices

        //ArrayList --> Más rápido para agregar y borrar elementos. Simula vector pero trabaja con nodos
        //LinkedList--> Más rápido al listar los elementos pero no para agregar y borrarlos. Trabaja con listas enlazadas

        List list;
        //Los<> no son necesarios ponerlos después de Java7
        //list = new ArrayList<>(10); // Se reservan 10 pero se pueden agregar los que se quieran LISTA DINÁMICA

        list = new ArrayList();
        //list=new LinkedList();
        //list=new Vector();
        
        list.add(new Persona("Gerardico", "Rubens", 33)); //Índice 0
        list.add(new Persona("Raquella", "Figazza", 99)); //Índice 1
        list.add("Hola");                                  //Índice 2
        list.add(11);                                       //Índice 3
        list.add("Chau");                                   //Índice 4
        list.add(1, "Miércoles");
        list.remove(5);

        //Recorrido con índices
        // for(int a=0;a<list.size();a++){
        //     System.out.println(list.get(a));
        // }


        //Recorrido forEach
        //for(Object o:list) System.out.println(o); //La lista cuando no está declarada debe ponerse el object 


        //Método forEach() JDK 8 o superior
        //Lambda Expression JDK 8 o superior -->
            //list.forEach(o->System.out.println(o)); //Para más sentencias se puede abrir {} después del o->

        list.forEach(System.out::println); // :: Se dice que o es parámetro del método forEach

        Arrays.asList(personas).forEach(System.out::println); //Crea una lista con el vector seleccionado. Como es una lista se puede recorrer con el forEach
        



        
    }
    
}
