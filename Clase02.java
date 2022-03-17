import javax.sound.sampled.SourceDataLine;

/*
Por consola se puede poner javac Clase02.java ENTER
Luego java Clase02 y se pueden agregar los strings del argumento desde ahí

*/
// línea de comentarios
/* Bloque de comentarios NO PUEDEN VERSE DESDE ARCHIVO BINARIO*/
/**COMENTARIO JavaDOC Se puede ver en bloc de texto, sale por fuera del archivo binario (el class, el ejecutable)
 * Debe colocarse este comentario delante de una declaración de clase o método
 * Para quien usa la clase y no tiene el archivo fuente
*/

//staruml.io para hacer los diagramas
//DESCARGAR OPENJDK de RedHat

/**
 * CLASE PRINCIPAL DEL PROYECTO
 */


public class Clase02{
    /**
     * Punto de Entrada del proyecto
     * @param args argumentos que ingresan por consola
     */
    public static void main(String[] args) { // String[] args: Vector con argumentos que ingresan de la consola
        System.out.println("Clase 02");
        System.out.println(System.getProperty("java.version")); // PARA QUE DIGA LA VERSIÓN DE JAVA

        System.out.println("Longitud args: " + args.length);
        for(int a=0; a<args.length;a++){
            System.out.println(args[a]);
        }

        //Uso de varargs (ARGUMENTOS VARIABLES) JDK 5 o superior

        String[]vector={"Primavera", "Verano", "Otoño", "Invierno"};
        metodo1(vector);
        metodo2("Primavera", "Verano", "Otoño", "Invierno");

        String st ="Esto es una cadena de Texto!";
        System.out.println(st);
        //RECORRER EL STRING ST.
        for(int a = 0;a<st.length();a++){
            System.out.print(st.charAt(a)); // charAt() DEVUELVE CARACTER EN UNA DETERMINADA POSICIÓN

        }
        System.out.println();
        

        
    }

/**
 * Método que ingresa un array como argumento
 * @param argumentos
 */

    public static void metodo1(String[] argumentos) { //RECIBE VECTOR
        for(int a =0; a<argumentos.length;a++){
            System.out.println(argumentos[a]);
        }

        }
/**
 * Método que ingresa un varargs como argumento
 * @param argumentos
 */
        public static void metodo2(String... argumentos) { //String ... VARARGS Se pueden pasar los argumentos desde la invocación al método. NO HACE FALTA VECTOR
            for(int a =0; a<argumentos.length;a++){
                System.out.println(argumentos[a]);
    
            }
        
    }

    
    
    
}
// COMANDO PARA GENERAR JAVADOC HTML DESDE CONSOLA  javadoc -d docs/ -version -author -use *.java
// PROBARLO CON OPENJDK de RedHat

//JavaDOC puede crear diagrama de clases

/*
Tipos de datos primitivos
* Lenguaje de tipado fuerte: hay que especificar tipo de dato. Se declara una variable en un tipo de dato y hay que respetarla
    JAVA, C++, C#, Visual Basic
* Lenguaje de tipado débil: no se necesita especificar, se puede modificar
    JavaScript, Python, PHP

TypeScript: Lenguaje de Microsoft. Es como Java pero con las buenas prácticas de C# . Es tipado y con contenedores y herencia


//TIPO DE DATOS ENTEROS: 
//Tipo de datos boolean --> 1 Byte (False = 0 y True = 1) Aunque solamente necesitaría un bit
boolean bo = true;
System.out.println(bo);
boolean bo = false;
System.out.println(bo);


//Tipo de datos Byte --> va de -128 a  127
byte by=100;
System.out.println(by);


//Tipo de datos short --> 2 bytes
short sh=1000;
System.out.println(sh);

//Tipo de datos int --> 4 bytes
int in=2000000000;
System.out.println(in);

//Tipo de datos long --> 8 bytes
long lo=2000000000;
System.out.println(lo);

SI ES UN NÚMERO MUY GRANDE, A PARTIR DE 3000000000 APROX., SE LE TIENE QUE PONER UNA L AL FINAL 3000000000L

//Tipo de datos char --> 2 bytes UNICODE . ALMACENA NÚMEROS PERO ES PARA CARACTERES
char ch=120;
System.out.println(ch);
ch='a';
ch-=32; // CONVIERTE A MINÚSCULA - ENTRE LETRAS MAYÚSCULAS Y MINÚSCULAS DEL ASCII HAY 32 
System.out.println(ch); 

//Tipo de datos de punto flotante --> Es de tipo flotante porque el punto decimal puede flotar por todo el número
    Tipo de datos Float --> 32 bits
        float fl =4.38; --> como es de tipo double hay que ponerle una F al final float fl =4.38f;
        System.out.println(fl); 

    Tipo de datos Double --> 64 bits Tiene más precisión que el float
        double dl = 4.38; --> Se le puede poner una d al final, pero no es necesario
        System.out.println(dl); 

        PARA PROBAR DIFERENCIA DE PRECISIÓN 

        fl =10;
        dl = 10;
        System.out.println(fl/3);
        System.out.println(dl/3);

        El último decimal no se toma en cuenta porque es muy impreciso

        En caso de no alcanzar los bits de un long o un double se puede usar un BigDecimal
        BigDecimal permite definir un número en la longitud que se desee, tiene lógica decimal (no binaria) Por eso es un poco más lento 

        
--- Clase String --> Se guarda en un vector de bytes llamado value (en el código fuente de String)
String st = "Esto es una cadena de texto!"; // Cada caracter es una posición del vector, tanto espacios como signo de admiración 
System.out.println(st);

Hasta JDK 9 los strings se guardaban en char private final char[] value --> 8 bytes ("hola")
      JDK 10 ó superior los strins se guardan en byte private final byte[] value --> 4 bytes ("hola")

ctrl+shift+p --> sirve para abrir cosa de comandos, le das reload. Lo reinicia sin cerrarlo

//Tipo de datos var (Solamente para JDK 9 ó superior) PARA VARIABLE NO PARA PARÁMETROS
    La literal que se le asigna a la variable es el tipo de dato

    var var1= 2000; //int
    var1=20;
    //var1=3.26; // DA ERROR PORQUE YA LO HABÍA TOMADO COMO ENTERO, SE DECLARÓ LA VARIABLE COMO ENTERA AL PRINCIPIO (SIN DECIRLO)

    var var2=true;  //boolean
    var var3=3.23;  //double
    var var4=3.23d; //double
    var var5=3.23f; //float
    var var6='a';   //char
    var var7= "a";  //String
    var var8=2L;    //long

    Object object = var4;
    System.out.println(object.getClass().getSimpleName()); --> PARA SABER QUÉ TIPO DE DATO ES, LO PUEDO COLOCAR DENTRO DE UN OBJETO Y LUEGO OBTENER SU DATO

    PROGRAMACIÓN ESTRUCTURADA


    

    


*/