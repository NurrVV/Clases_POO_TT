package ar.org.centro8.curso.java.clase05.test;

import java.util.ArrayList;

import ar.org.centro8.curso.java.clase05.entities.Auto;
import ar.org.centro8.curso.java.clase05.entities.ClienteEmpresa;
import ar.org.centro8.curso.java.clase05.entities.ClientePersona;
import ar.org.centro8.curso.java.clase05.entities.Cuenta;
import ar.org.centro8.curso.java.clase05.entities.Gerente;
import ar.org.centro8.curso.java.clase05.entities.Peon;
import ar.org.centro8.curso.java.clase05.entities.Representante;

public class TestRelaciones {
    public static void main(String[] args) {
        /*
        Objetos MOCKS (simulaciones)
        Testeo con objetos simulados

        Tenemos visibilidad por defecto a clases del mismo paquete 
        y clases del paquete java.lang
        
        */
        System.out.println("--Cuenta 1--");
        Cuenta cuenta1 = new Cuenta(1, "ARS$"); //Como la clase tiene parámetros hay que sí o sí colocarlos acá
        cuenta1.depositar(50000);
        cuenta1.depositar(80000);
        cuenta1.debitar(20000);
        System.out.println(cuenta1);

        System.out.println("--Cuenta 2--");
        Cuenta cuenta2 = new Cuenta(2, "ARS$"); // al decir new se le está asignando un nuevo lugar de memoria
        cuenta2.depositar(100000);
        cuenta2.debitar(50000);
        System.out.println(cuenta2);

        System.out.println("--clientePersona1--");
        ClientePersona clientePersona1 = new ClientePersona(1, "David", 26, new Cuenta(3, "ARS$"));
        clientePersona1.getCuenta().depositar(30000);
        System.out.println(clientePersona1);

        Cuenta cuentaCliente = clientePersona1.getCuenta(); //Creo variable que APUNTA AL MISMO ESPACIO DE MEMORIA
        cuentaCliente.depositar(30000); // Se le dice qué hacer


        System.out.println("--clientePersona2--");
        ClientePersona clientePersona2 = new ClientePersona(2, "Ana", 24, clientePersona1.getCuenta()); //se apunta a la misma cuenta que el cliente1, 
        clientePersona2.getCuenta().debitar(10000);                                                     // no es que se copia sino que es la misma, hace refencia al mismo lugar de memoria
        System.out.println(clientePersona2);
        System.out.println(clientePersona1);


        Auto auto1 = new Auto("WV","Gol","Blanco");
        Auto auto2 = new Auto("Citroen", "C4", "Verde");

        Peon p1 = new Peon(1, "Mariana");
        Peon p2 = new Peon(2, "Javier");

        p1.usar(auto1);
        p2.usar(auto2);
        p1.usar(auto2);
        p2.usar(auto1);

        Representante r1 = new Representante(1, "Daniela");
       r1.cambiarAuto("Ford", "Fiesta", "negro");

        Representante r2 = new Representante(2, "Lorena", "Fiat","Idea","Gris");
        r2.cambiarAuto("Renault", "Kangoo", "Negro");

        Gerente g1 = new Gerente(1, "John", "Lincoln", "Continental");

        System.out.println("--clienteEmpresa1--");
        ClienteEmpresa clienteEmpresa1 = new ClienteEmpresa(1, "Todo Limpio SRL", "Lima 222");
        ArrayList<Cuenta> cuentas = clienteEmpresa1.getCuentas(); //No se creó un nuevo objeto 
        cuentas.add(new Cuenta(10, "ARS$"));    //Índice: 0
        cuentas.add(new Cuenta(11, "Reales"));  //Índice: 1
        cuentas.add(new Cuenta(12, "U$D"));     //Índice: 2
        cuentas.get(0).depositar(45000);
        cuentas.get(0).depositar(120000);
        cuentas.get(0).debitar(25000);
        cuentas.get(1).depositar(50000);
        cuentas.get(2).depositar(12000);

        System.out.println(clienteEmpresa1);
        for(int a=0;a<cuentas.size();a++) System.out.println(cuentas.get(a));





                //TIPOS DE RELACIONES
        /*
            Tipo de relación:
                            Asociación Simple --> Bajo acoplamiento 
                                        //Un peón usa momentáneamente un auto.
                                        //No tiene un atributo del tipo auto, no depende del auto
                                        //El peón se crea o nace sin auto
                            
                            Agregación: Cuando se agrega. La vida de un objeto no depende de la vida de otro objeto
                                        //Representante de Ventas puede tener un auto 
                                        //y ese auto puede ser cambiado, 
                                        // puede ser un auto existente en la empresa
                                        //Puede romperse sin que deje de vivir el representante
                            
                            Composición --> Alto acoplamiento, tipo de relación fuerte
                                        Ata a los ciclos de vida. Los objetos son DEPENDIENTES de los otros
                                        //El gerente tiene una limousine
                                        //El gerente está compuesto por una limousine
                                        //Cuando ingresa un gerente nuevo, se le compra una limousine
                                        //Cuando el gerente se da de baja, se vende la limousine o se destruye
                                    

        Cardinalidad: 1 a 1 
                      1 a muchos
                      
        
        HERENCIA: La clase padre generaliza la mayor parte de componentes de las clases hijas
                  Para agrupar una mayor cantidad de atributos y métodos comunes y las subclases hereden de una más general
                  Una superclase puede tener muchas subclases
                  Un objeto de una superclase no tiene visibilidad sobre miembros de las clases hijas
                  Las clases hijas pueden ver a la clase padre y sobreescribir sus métodos
                  Hay que ver atributos y métodos para ver si vale la pena la herencia
                  Tratar, cuando se pueda, de convertir herencia en tipo de relación simple, 

        HERENCIA MÚLTIPLE: Una clase que hereda de dos clases padres. En Java no hay herencia múltiple

        
        
        
        */



    }
    
}

/*
TIPO DE DATOS REFERENCIADO
dato d1 = new Dato(2) --> El hecho de decir new significa CREAR UN NUEVO ESPACIO DE MEMORIA
dato d2 = d1 --> Acá se apunta al mismo lugar en memoria que el anterior, no es copia ni algo nuevo
dato d3 = new Dato(d1.dato) --> Copia el valor de d1, lo coloca en un nuevo espacio de memoria, 
                                como es new CREA EL ESPACIO DE MEMORIA 
                                Si se modifica d1 este d3 igual se queda con valor anterior


TIPO DE DATOS PRIMITIVO
int nro1 = 2
int nro2 = nro1 --> Se copia el valor y CREA UN NUEVO ESPACIO DE MEMORIA
nro2 = 4 --> Cambia en el nuevo espacio de memoria
print (nro1) --> 2



*/