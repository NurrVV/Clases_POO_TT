//Declaración de clases
public class Auto {

    //Atributos
    String marca;
    String modelo;
    String color;
    int velocidad;

    //CONSTRUCTORES PENDIENTES
    /*
    Auto(String marca, String modelo, String color){
        //marca=marca ---> //Referencia ambigua, porque hay atributo y hay parámetro con el mismo nombre

    }
    */

//AVISAR ESTO DE DEPRECATED MEDIANTE JAVADOC
/**
 * Este método fue deprecado por Fulanito Rechonchis el 21/03/2022
 * Por resultar inseguro
 * Usar en su reemplazo Auto(String marca, String modelo, String color)
 *  
 */

//Annotation JDK  o sup
    //CONSTRUCTOR VACÍO
    @Deprecated //--> Método deprecado(el que le sigue a esta sentencia), es como avisar que se recomienda no usar. En el código aparece el método tachado pero funciona igual
    Auto(){}
    //CONSTRUCTOR VACÍO

    Auto(String marca, String modelo, String color){ //Ya no hay referencia ambigua porque uno refiere al parámetro y el otro al atributo
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
    }

    //Métodos
    void acelerar(){ //acelerar
        acelerar(10); //llamado de método dentro de la misma clase
    }
    //Método sobrecargado
    void acelerar(int kilometros){  //acelerarInt
        //int kilometros es un parámetro de entrada
        velocidad+=kilometros;
        if (velocidad>100) velocidad = 100;

    }

    // void acelerar(int r){}  ---> DA ERROR PORQUE TIENE EXACTAMENTE LA MISMA CANTIDAD DE PARÁMETROS DEL MISMO TIPO //acelerarInt


    void acelerar(int r, boolean x){} //acelerarIntBoolean
    void acelerar(int r, int x){} //acelerarIntInt


    void frenar(){
        velocidad-=10;
        if(velocidad<0) velocidad =0;
    }

    //Método sin devolución de parámetros
    void imprimirVelocidad(){
        System.out.println(velocidad); // LAS CLASES DE NEGOCIO NO DEBEN IMPRIMIR EN CONSOLA, DEBEN RETORNAR VALOR Y QUE EL USUARIO DECIDA QUÉ HACER CON ESOO
    }
    //Método con devolución de parámetros
    int obtenerVelocidad(){
        return velocidad;
    }

    String getEstado(){
        return marca+ ", "+modelo+", "+color+", "+velocidad;
    }
    //SOBREESCRIBIENDO EL MÉTODO TOSTRING
    //Buena práctica: anotar que el método es heredado de la clase object y se está sobreescribiendo
    @Override //SOBREESCRITURA
    public String toString(){
        return marca+ ", "+modelo+", "+color+", "+velocidad;
    }

    
}//end class
