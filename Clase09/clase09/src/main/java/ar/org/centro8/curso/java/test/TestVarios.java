package ar.org.centro8.curso.java.test;

import java.util.Scanner;

import org.springframework.boot.ansi.AnsiColor;
import org.springframework.boot.system.SystemProperties;

public class TestVarios {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    //COLORES DE FONDO
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
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

            @Override
            public String toString() {
                return "Dato [dato=" + dato + "]";
            }
//BOTÓN DERECHO SOURCE ACTION GENERATE HASHCODE() AND EQUALS()
//SE SOBREESCRIBE EL MÉTODO EQUALS PARA QUE CONSIDERE IGUALES A LOS OBJETOS DE IGUAL ESTADO
            @Override
            public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + dato;
                return result;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj)
                    return true;
                if (obj == null)
                    return false;
                if (getClass() != obj.getClass())
                    return false;
                Dato other = (Dato) obj;
                if (dato != other.dato)
                    return false;
                return true;
            }

            
      
        }

        Dato d1=new Dato(2);
        Dato d2 = d1; //es el mismo lugar de memoria que el anterior
        Dato d3 = new Dato(d1.dato); //tiene el mismo estado de dato pero es un lugar de memoria distinto DATO NUEVO POR DECIR NEW
        Dato d4=new Dato(4); //nuevo con nuevo lugar de m emoria
        String d5="2"; //La clase String tiene sobreescrito el hashCode y se refiere al número ASCII
        // MÉTODO HASHCODE --> devuelve un entero, es heredado de clase object
        System.out.println("d1.hashCode()= " + d1.hashCode());
        System.out.println("d2.hashCode()= " + d2.hashCode());
        System.out.println("d3.hashCode()= " + d3.hashCode());
        System.out.println("d4.hashCode()= " + d4.hashCode());
        System.out.println("d5.hashCode()= " + d5.hashCode()); 
//Si dos objetos tienen el mismo id son el mismo lugar de memoria

//Métodos equals
        System.out.println("d1.equals(d1)= "+d1.equals(d1));
        System.out.println("d1.equals(d2)= "+d1.equals(d2));
        System.out.println("d1.equals(d3)= "+d1.equals(d3));
        System.out.println("d1.equals(d4)= "+d1.equals(d4));
        System.out.println("d1.equals(d5)= "+d1.equals(d5));

       // System.out.println("Ingrese hola: ");
        //String hola=new Scanner(System.in).next();
        //System.out.println("hola"==hola); //compara string con objeto y no hay que hacer esoo
       // System.out.println("hola".equals("hola")); //equals no compara lugar en memoria sino el estado, por eso da true

        //podemos sobreescribir el método equals

        //Clase java.lang.System
        //Representa el entorno de ejecución

        //3 atributos más comunes

        /*
            Atributos static 
                            * out 
                            * err 
                            * in

            OUT: representa un stream de salida sincronizado a la consola. Atributo de PrintStream

            ERR: representa un stream de salida no sincronizado a la consola. Atributo de PrintStream
                ej.: system.errprintln("ERROR")
                Se lo asocia con el error porque imprime en rojo
                Es asincrónico, pide que se haga ya

            IN: representa un stream de entrada de datos sincronizados
        
MÉTODO .exit()
                Método estático que cierra el runtime (apaga el programa)
                x es la devolución de error al sistema operativo
                    System.exit(0)  --> sale del programa
                    System.exit(1)  --> estoy diciendo que hay un error
                    System.exit(-1) --> estoy diciendo que hay una warning COMMAND EXECUTION FAILED



        
        */
        System.out.println("0");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.err.println("Error");

        //COLORES EN CONSOLA
        System.out.println(ANSI_RED+"BUENASS CABRASS"+ANSI_RESET);

        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLUE + "Texto de color azul sobre fondo verde");
        System.out.println("otra cosa");
        System.out.println("¡Reseteo ahora!" + ANSI_RESET);
        System.out.println("nueva cosa");

        //.getProperties()
            //Es un diccionario con información del sistema

        System.out.println(System.getProperties());

        String[] propiedades = System.getProperties().toString().split(",");
        for(int a=0;a<propiedades.length;a++) System.out.println(propiedades[a]);

        System.out.println("**************************************************");

        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.language"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("java.version"));

        //.getEnv()
            //Otro diccionario
            System.out.println("******************************************************************");
        System.out.println(System.getenv());
        propiedades = System.getenv().toString().split(",");
        for (int a=0;a<propiedades.length;a++) System.out.println(propiedades[a]);
        

        System.out.println("******************************************************************");
        System.out.println(System.getenv("DESKTOP_SESSION"));

        System.out.println("Cantidades de procesadores: " + Runtime.getRuntime().availableProcessors());

        //Runtime.getRuntime().exec("clear");



        //Clase java out.lang.String
    

        String texto1= "hola";
        String texto2= new String("hola");
        char[] vector={'h','o','l','a'};
        String texto3= new String(vector);

        //.trim()
            //Quita espacios de adelante y de atrás del String
            System.out.println("             hola ".trim());

        //.startsWith() --> Devuelve Booleano
        System.out.println(texto1.startsWith("h"));
        
        //.endsWith() --> Devuelve Booleano
        System.out.println(texto1.endsWith("o"));

        //.containt()
        System.out.println(texto1.contains("x"));
        
        //.charAt() --> Devuelve el caracter que está en ese índice
        System.out.println(texto1.charAt(2)); 

        //.subString -->Devuelve del seleccionado para adelante
        System.out.println(texto1.substring(2)); 

        //.equals() .equalsIgnoreCase() --> Devuelve Booleano
        System.out.println(texto1.equalsIgnoreCase("HOLA"));

        //.toLowerCase()  .toUpperCase()
        System.out.println(texto1.toLowerCase());
        System.out.println(texto1.toUpperCase());


    }
    
}
