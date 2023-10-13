/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 * Clase principal que nos guarda los datos de las demas clases 
 * en este caso la clase ALUMNO y FECHA, en este caso es nuestro
 * main.
 * @author Gómez Luna Brisa Mariana 
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         /**
          * Con el constructor vacio se crea una 
          * instancia
          */
        Alumno alumno = new Alumno();
        
        /**
         * Manda a llamar los atributos de String
         */
        alumno.setNombre("Pedro");
        
        /**
         * Operador punto (.) accede a nuestra variable y le asiganmos 
         * un apellido
         */
        alumno.setApellido("Gomez");
        
        /**
         * Se crea una instancia, donde le asignamos los valores
         * para Fecha
         * 
         */
        Fecha fecha = new Fecha(29,9,2023);
        
        /**
         * Aqui se crea otra instancia con una nuevo registro, dodne 
         * nos va a guardar un nuevo alumno con los datos que le asignemos
         */
        Alumno alu2 = new Alumno("Luis", "Hernandez","Medicina", "UNAM", 4, fecha);
        
        /**
         * var - nos declara variable
         * Nos indica que se vaa convertir en una cadena de texto
         */
        String var = alumno.toString();
        /**
         * este system nos imprime la cadena con valores
         */
        System.out.println(var);
        /**
         * nos imrpime otra manera de imprimir 
         */
        System.out.println(alumno.toString());
        /**
         * No imprime una refrencia sino le agregamos toString
         */
        System.out.println(alu2);
             
    }   
}
