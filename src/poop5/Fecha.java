/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *Tenemos nuestra CLASE Fecha
 * @author Brisa Gomez
 */
public class Fecha {
     /**
      * Nuestros atributos private 
      */
    private int dia,mes,anio;
    
    
    /**
     * Construcutor vacio
     */
    public Fecha(){        
    }

    /**
     * Constructor no vacio 
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
     *  --------- METODOS DE SERVICIO ----- 
     * Metodo getDia
     * Regresa el dia    
     */
    public int getDia() {
        return dia;
    }
    
    /**
     * Metodo setDia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * Metodo getMes
     *    
     */
    public int getMes() {
        return mes;
    }
    /**
     * Metodo setMes
     *     
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    /**
     * Metodo getAnio
     *    
     */
    public int getAnio() {
        return anio;
    }
    /**
     * Metodo setAnio
     *     
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * ------METODOS DE SOBREESCRITURA -----------
     * Metodo toString - que muestra los valores de los atributos
     * @return - regresa la concatenacion de los valores de los atributos    
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
       
}
