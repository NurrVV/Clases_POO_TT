import javax.swing.JOptionPane;

public class Paradigma {
    public static void main(String[] args) {
        /*
        Paradigma de Objetos

        Clases: Son plantillas para construir objetos, representan ideas genéricas del mundo real
                Se detectan como sustantivos y se escriben en singular, iniciándose con mayúscula

                Ejemplos de Clases: Auto, Alumno, Computadora

        Clases en Java: Todas las clases en java son objetos de la clase java.lang.Class
                        La clase Class representa a todas las clases en Java


        Atributos: Describen a la clase, son adjetivos y tienen un tipo de datos asignado
                   Los atributos son variables contenidas dentro de la clase
                   La Clase define los atributos y los objetos completan el estado
            
        Atributos en Java: Los atributos en java son objetos de la clase java.lang.reflect.Field


        Objetos: Son instancias de la clase, representan una situación en particular
                 El estado es el valor de sus atributos, cada objeto tiene un estado propio (un valor de atributos propio)

        Objetos en Java: en java cualquier objeto puede ser contenido en un objeto de la clase java.lang.Object

        Métodos: Son acciones que realiza la clase, se encuentran como verbos
                 Los analistas funcionales los llaman Operaciones
                 Pueden tener parámetros de entrada y un parámetro de salida

        Métodos en Java: Son objetos de la clase java.lang.reflect.Method

        Paradigma Imperativo:   El primer paradigma. Se le da una orden a la máquina y no importan las consecuencias.
        
        Paradigma Lógico:   Estableció el if, ya se podían poner cláusulas. 
                            Se pueden resolver todos los problemas pero a costo muy alto
                            Cada línea de programación tenía un número, genera código spaghetti
        
        Programación Estructurada:  Tiene estructura de repetición (igual que el lógico), pero con inicio y fin (tipo el while)
        
        POO:    Viene a poner orden a tanto descontrol. 
                Se engloba todo en Clases y dentro de cada una se colocan las funciones de cada clase (métodos)
                Objetos no es un paradigma nuevo, es de fines de los '80s y principios de los '90s



        Parámetros de entrada: Son valores que ingresan a un método, para ser usados dentro del método
                               Un parámetro es una variable que sólo vive dentro del método. Por fuera
                               del método no existe.
                               Pertenecen a un tipo de datos y es el usuario quien va a enviar el valor
                               El parámetro está bueno que tenga un nombre que aclare más que sólo una inicial

        Sobrecarga de métodos: Es la presencia de métodos con el mismo nombre dentro de una clase. 
                               Más de 1 método con el mismo nombre.
                               Para que esto funcione debe variar la firma de parámetros de entrada


        Métodos con devolución de valor: Los métodos pueden devolver un valor una vez terminada la operación, 
                                         ese valor tiene un tipo de datos asociado.
                                         Si no devuelve valor, se coloca void {pño.umyhtbc} --> MARIANO


        Constructores: Los constructores son métodos que inicializan objetos
                       Tienen el mismo nombre que la clase y pueden recibir parámetros de entrada
                       Se pueden sobrecargar y no devuelven ningún valor
                       Se invoca automáticamente con lapalabra new al crear un objeto
                       Cuando una clase no tiene constructor, Java agrega un constructor vacío al compilar

        Constructores en Java: en Java los constructores son objetos de la clase java.lang.reflect.Constructor
        
        Es transparente para el usuario cuando no se entera del cambio


    El estado del objeto es el valor de los atributos

               

        Clase: Es un sustantivo, se representa en singular y empezando con mayúscula
        Atributos: Son adjetivos, son las propiedades de la clase
        Métodos: Son verbos, acciones que realiza la clase
        
        
        */

        //--auto--
        System.out.println("--auto1--");
        Auto auto1 = new Auto();  //COMO SE CREÓ CONSTRUCTOR TIRA ERROR ACÁ PORQUE SE ESTÁ LLAMANDO A CONSTRUCTOR VACÍO Y HAY UNO CREADO

        //Colocar estado al objeto auto1
        auto1.marca="Fiat";
        auto1.modelo="Mobi";
        auto1.color="Rojo";
        auto1.acelerar();   //10
        auto1.acelerar();   //20
        auto1.acelerar();   //30
        auto1.frenar();     //20
        auto1.acelerar(23); //43

        //--auto2--
        
        Auto auto2 = new Auto();  //COMO SE CREÓ CONSTRUCTOR TIRA ERROR ACÁ PORQUE SE ESTÁ LLAMANDO A CONSTRUCTOR VACÍO Y HAY UNO CREADO

        //COLOCAMOS LOS ATRIBUTOS DE ESTA FORMA PORQUE SE ESTÁ REFIRIENDO AL CONSTRUCTOR SIN PARÁMETROS
        auto2.marca="Ford";
        auto2.modelo="Fiesta";
        auto2.color="Negro";

        for (int a=0;a<=60;a++) auto2.acelerar(); //Cuando hay una sola instrucción se puede poner sin llaves

        System.out.println(auto1.marca+" "+auto1.modelo+" "+auto1.color+" "+auto1.velocidad);
        System.out.println("--auto2--");
        System.out.println(auto2.marca+" "+auto2.modelo+" "+auto2.color+" "+auto2.velocidad);

        System.out.println("--auto3--");
        Auto auto3 = new Auto("Renault", "Kangoo", "Bordó"); //Creo objeto y le pongo estado en el mismo momento porque hicimos el CONSTRUCTOR CON LOS PARÁMETROS
        auto3.acelerar(45);
        auto3.imprimirVelocidad();
        System.out.println(auto3.obtenerVelocidad()); //VAMOS A ESTAR USANDO ESTA FORMA YA QUE NO CONVIENE LA ANTERIOR ver pestaña de Auto

        JOptionPane.showMessageDialog(null, "Velocidad: "+ auto3.obtenerVelocidad());

        //Método toString()
        System.out.println(auto3.getEstado());
        System.out.println(auto3.toString()); //Devuelve NOMBRE DE CLASE + @ + CÓDIGO HASH
        System.out.println(auto3); //Devuelve NOMBRE DE CLASE + CÓDIGO HASH . Invoca directamente a método toString


        //Sobreescritura de método. Sobreescribir método toString para que devuelva sobrecarga de método

        
        
        //Los atributos numéricos se inicializan automáticamente en 0 y los atributos String se inicializan en null
        //Los atributos, a diferencia de las variables(no se inicializan automáticamente), tienen un proceso de inicialización
        //El constructor se encarga de inicializar los atributos de la clase
        //Los primitivos no son nulleables (no se les puede poner null)

        /*
        Paquetes de Clases: Subcarpetas. Colocarlos en diferentes carpetas y demás hace que los nombres tengan unicidad dentro del código ya que varía la ruta
        Va a haber clases en distintos paquetes
        Nombres de Paquetes en minúsculas

        Operadores de Visibilidad para miembros de clase (atributos o métodos)

        ----------------------------------------------------------------------------------------
        MODIFICADOR         ALCANCE
        ----------------------------------------------------------------------------------------
        default(omitido)    El miembro sólo puede ser visible o accesible desde la misma clase
                            y desde las clases del mismo paquete

        public              El miembro es visible desde cualquier clase

        private             El miembro es visible desde la misma clase

        protected           El miembro es visible desde la misma clase, 
                            desde clases hijas y desde clases del mismo paquete

                            
        
        */

        Auto autoX = new Auto("Citroen", "C4", "Amarillo");
        autoX.acelerar(350);
        autoX.velocidad = 50000;
        System.out.println(autoX);

        Empleado empleado1 = new Empleado(1, "Juan", "Zamora", 25000);
        //empleado1.sueldoBasico(30000)
        empleado1.setSueldoBasico(30000);
        System.out.println(empleado1);



    }
    
}
