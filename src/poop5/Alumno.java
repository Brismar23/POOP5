/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * NUestra clase Inicial ALUMNO
 * 
 */
public class Alumno {
    
    /**
     *  ATRIBUTOS - 
     * Varibles de tipo string public, int en primitivo private. 
     */
    public String nombre, apellido, carrera, escuela;
    private int semestre;
    private Fecha fNacimiento;
    
    
    /**
     *  CONSTRUCTOR VACIO   
     */
    public Alumno() {
    }
    /**
     *  CONSTRUCTOR NI VACIO   
     */

    public Alumno(String nombre, String apellido, String carrera, String escuela, int semestre, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.escuela = escuela;
        this.semestre = semestre;
        this.fNacimiento = fNacimiento;
    }
    
    
    
    /**
     *  --------- METODOS DE SERVICIO -----   
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    
    
    /**
     *  --------- METODOS DE SERVICIO ----- 
     *     
     */
    public void dormir(){
        System.out.println("zzzz...");          
    }
    
    public void comer(){
        System.out.println("mmmm...");          
    }
    
    public void estudiar(){
        System.out.println("estudiando...");          
    }
    
    public void trabajar(){
        System.out.println("Estoy trabajndo...");          
    }
    
    public void jugar(){
        System.out.println("Estoy jugando...");          
    }
    /**
     * ------METODOS DE SOBREESCRITURA -----------
     * Metodo toString - que muestra los valores de los atributos
     * @return - regresa la concatenacion de los valores de los atributos    
     */

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", carrera=" + carrera + ", escuela=" + escuela + ", semestre=" + semestre + ", fNacimiento=" + fNacimiento + '}';
    }
    
    
}
