package ar.org.centro8.curso.java.clase05.entities;

/*
Poner atributos en privado y sacarle los setters para evitar que la chusma modifique la cuestión
ENCAPSULAR: Es poner los atributos en privado y sacarle los setters
Bean es para proteger, es como encapsular. Hay que proteger los atributos porque son muy delicadoss. Permiten acceder
al estado pero de forma controlada.

Para proteger: 
    * Atributos privados
    * Constructores que exijan un estado mínimo
    * Métodos públicos que permitan acceder al estado pero de forma controlada




*/


public final class Cuenta {
    private int nro;
    private String moneda;
    private double saldo; //No se ingresa como constructor porque al empezar es cero
    
    public Cuenta(int nro, String moneda) {
        this.nro = nro;
        this.moneda = moneda;
    }

    public void depositar(double monto){
        this.saldo+=monto;
    }

    public void debitar(double monto){
        if(this.saldo>=monto){
            saldo-=monto;
        }else{
            System.out.println("Saldo Insuficiente");
        }

    }
//Sólo pondremos los getters porque no quiere permitir el cambio 

    @Override
    public String toString() {
        return "Cuenta [Moneda=" + moneda + ", Número=" + nro + ", Saldo=" + saldo + "]";
    }

    public int getNro() {
        return nro;
    }

    public String getMoneda() {
        return moneda;
    }



    public double getSaldo() {
        return saldo;
    }






    
}
