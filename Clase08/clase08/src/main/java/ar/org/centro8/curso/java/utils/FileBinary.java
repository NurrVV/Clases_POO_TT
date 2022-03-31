package ar.org.centro8.curso.java.utils;

import ar.org.centro8.curso.java.interfaces.I_File;

public class FileBinary implements I_File{

    @Override
    public String getText() {
        return "Archivo binario";
    }

    @Override
    public void setText(String text) {
        System.out.println("Escribiendo archivo binario");
        
    }
    
    
}
