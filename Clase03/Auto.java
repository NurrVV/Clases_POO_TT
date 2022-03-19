//Declaración de clases
public class Auto {

    //Atributos
    String marca;
    String modelo;
    String color;
    int velocidad;

    //Métodos
    void acelerar(){
        velocidad+=10;
        if (velocidad>100) velocidad = 100; //Esto se llama Hardcodear el valor y poner las reglas del negocio
    }
    //Método sobrecargado
    void acelerar(int kilometros){ 
        //int kilometros es un parámetro de entrada
        velocidad+=kilometros;
        if (velocidad>100) velocidad = 100;



    }


    void frenar(){
        velocidad-=10;
        if(velocidad<0) velocidad =0;
    
    }



    
}//end class
