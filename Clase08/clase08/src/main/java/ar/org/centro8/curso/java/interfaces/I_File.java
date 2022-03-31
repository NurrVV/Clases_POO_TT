package ar.org.centro8.curso.java.interfaces;

//declaro una interfaz. En general empiezan con I_
public interface I_File {


    /*
    Interfaces: 
                - Una interface no contiene atributos ni métodos constructores.
                - Puede contener constantes o atributos de clase (static).
                - Todos los miembros de una interface son públicos.
                - Los métodos de una interface son abstractos (quien usa la interfaz está obligado a usarlos)
                - Una clase puede implementar muchas interfaces. Puede heredar métodos de muchas interfaces
                - Es como un contrato porque son métodos abstractos, los estoy obligando a crear métodos set y get, se requiere eso sí o sí. ES LA PAUTA DE TRABAJO
                - Crear un Lenguaje o interfaz de trabajo

      
    */

/**
 * 
 * La javaDoc se hereda
 * Este método escribe dentro del archivo
 * @param text texto a escribir
 */
    public abstract void setText(String text); // = void setText(String text); PORQUE SERÁ PÚBLICA Y ABSTRACTA DE TODAS FORMAS

    /**
     * Este método devuelve el contenido del archivo
     * @return retorna el texto con el contenido de un archivo
     */
    String getText();

    /* 
    Interfaces en Java 8 o superior
    Métodos default: en java 8 o superior existen los métodos default
                     Tienen cuerpo (código) y es heredado a las implementaciones

    Implementación Dummy o de fantasía
    */

    default void info(){
        System.out.println("Interface I_File");

    }


    
}
