package ar.org.centro8.curso.java.clase11.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

import ar.org.centro8.curso.java.clase11.entities.Persona;

public class TestReflect {
    public static void main(String[] args) throws Exception {
//Api Stream
       // Persona p = new Persona ("Ana", "Salas", 26);

       Object o = new Persona ("Ana", "Salas", 26);

       System.out.println(o.getClass());
       System.out.println(o.getClass().getName());
       System.out.println(o.getClass().getSimpleName());
       System.out.println(o.getClass().getSuperclass().getName());
        
       //CAMPOS DE LA CLASE
       Field[] campos= o.getClass().getDeclaredFields(); //devuelve vector con los atributos de la clase
       for(int a=0;a<campos.length;a++){
           System.out.println("------------------------------------");
           System.out.println(campos[a]);
           System.out.println(campos[a].getType().getName());
           System.out.println(campos[a].getModifiers());
           System.out.println(campos[a].getName());
       }
       //campos de la clase + campos heredados
       o.getClass().getFields(); //no se declaró como el anterior
       for(int a=0;a<campos.length;a++){
           System.out.println("------------------------------------");
           System.out.println(campos[a]);
           System.out.println(campos[a].getType().getName());
           System.out.println(campos[a].getModifiers());
           System.out.println(campos[a].getName());
       }

        //REFLEXIÓN: Recibir un objeto e investigarlo en tiempo de ejecución


        //métodos de la clase
    Method[] metodos= o.getClass().getDeclaredMethods();
    for(int a=0;a<metodos.length;a++){
        System.out.println("------------------------------------");
        System.out.println(metodos[a]);
        System.out.println(metodos[a].getName());
        System.out.println(metodos[a].getModifiers());
        System.out.println(metodos[a].getReturnType().getName());
        Parameter[] parametros= metodos[a].getParameters(); //LOS SET SOLAMENTE TIENEN PARÁMETROS
        System.out.println("Parámetros de entrada: ");
        for(int x=0;x<parametros.length;x++){
            System.out.println(parametros[x]);
        }
    }

        //métodos de la clase + métodos heredados
        metodos= o.getClass().getMethods();
    for(int a=0;a<metodos.length;a++){
        System.out.println("------------------------------------");
        System.out.println(metodos[a]);
        System.out.println(metodos[a].getName());
        System.out.println(metodos[a].getModifiers());
        System.out.println(metodos[a].getReturnType().getName());
        Parameter[] parametros= metodos[a].getParameters(); //LOS SET SOLAMENTE TIENEN PARÁMETROS
        System.out.println("Parámetros de entrada: ");
        for(int x=0;x<parametros.length;x++){
            System.out.println(parametros[x]);
        }
    }


        //Constructores de la clase
        Constructor [] constructores = o.getClass().getConstructors();
        for(int a=0;a<constructores.length;a++){
            System.out.println(constructores[a]);
        }

        //Invocar un método de la clase
        System.out.println(o.getClass().getMethod("getNombre").invoke(o));

        System.out.println("****************************************");
        Arrays.asList(o.getClass().getDeclaredFields()).forEach(System.out::println);


    }
    
}
