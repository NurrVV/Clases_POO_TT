package ar.org.centro8.curso.java.test;

import java.util.Scanner;

import ar.org.centro8.curso.java.interfaces.I_File;
import ar.org.centro8.curso.java.utils.FileBinary;
import ar.org.centro8.curso.java.utils.FileText;

public class TestInterfaces {
    public static void main(String[] args) throws Exception {
        System.out.println("Test Interfaces");

    I_File file = null; //creo objeto de I_File, no está inicializada porque es null

    // file = new FileText(); //inicializo como archivo de texto
    file = new FileBinary(); //inicializo como archivo binario

    //Inicializando la interface como un objeto de una u otra clase permite rápidamente obtener los distintos resultados como si fuese una herencia múltiple


    System.out.println("Ingrese 'FileText' o 'FileBinary'");
    String in = new Scanner(System.in).nextLine();

   // if(in.equalsIgnoreCase("FileText")) file = new FileText();
  //  if(in.equalsIgnoreCase("FileBinary")) file = new FileBinary();

  //DE ESTA FORMA SE PUEDE CREAR EL OBJETO DE LA CLASE NECESARIA EN EL MOMENTO SIN USAR IF
  //file=(I_File)Class
                   // .forName("ar.org.centro8.curso.java.utils."+in)
                    //.newInstance(); //método deprecado, puede ser inseguro

//Hay polimorfismo con las interfaces porque en el I_File puedo manejar archivos de distintas clases
    file = (I_File) Class.forName("ar.org.centro8.curso.java.utils."+in).getConstructor().newInstance();

    //app
    file.setText("Hola");
    System.out.println(file.getText());
    file.info(); //método default



    }
    
}
