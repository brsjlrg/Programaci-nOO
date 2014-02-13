/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mundo;

/**
 *
 * @author INGENIERIA
 */
public class DatosPersona {
    /**
     * Color de la persona
     */
    String colorPiel;
    /**
     * Edad de la persona
     */
    int edad;
    /**
     * Estatura de la persona
     */
    double estatura;
    /**
     * Nombre de la persona
     */
    String nombre;
    /**
     * Peso de la persona
     */
    double peso;
    /**
     * Constructor de la clase
     * Inicializa los atributos en 0 o en cadena vacia
     */
    void DatosPersona(){
        colorPiel = "";
        edad = 0;
        estatura = 0.0;
        nombre = "";
        peso = 0.0;
    }
    /**
     * Constructor de la clase con parametros
     * @param pColorPiel
     * @param pEdad
     * @param pEstatura
     * @param pNombre
     * @param pPeso 
     */
    void DatosPersona(String pColorPiel, int pEdad, double pEstatura, String pNombre, double pPeso ){
        colorPiel = pColorPiel;
        edad = pEdad;
        estatura = pEstatura;
        nombre = pNombre;
        peso =pPeso;
            }
    /**
     * Asigna valor a color piel
     * @param pColorPiel Color piel
     */
    public void setColorPiel(String pColorPiel){
        colorPiel = pColorPiel;
    }
    /**
     * retorna el color de la piel
     * @return Color piel
     */
    public String getColorPiel(){
        return colorPiel;
    }
    /**
     * Asigna el valor de la edad
     * @param pEdad Edad
     */
    public void setEdad(int pEdad){
        edad = pEdad;
    }
    /**
     * retorna el valor de la edad
     * @return  Edad
     */
    public int getEdad(){
        return edad;
    }
     /**
     * Asigna el valor de la estatura
     * @param pEstatura Estatura
     */
    public void setEstatura(double pEstatura){
        estatura = pEstatura;
    }
    /**
     * retorna el valor de la estatura
     * @return  Estatura
     */
    public double getEstatura(){
        return estatura;
    }
    /**
     * Asigna el nombre de la persona
     * @param pNombre Nombre
     */
    public void setNombre(String pNombre){
        nombre = pNombre;
    }
    /**
     * retorna el nombre de la persona
     * @return  Nombre
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Asigna el peso de la persona
     * @param pPeso Peso
     */
    public void setPeso(double pPeso){
        peso = pPeso;
    }
    /**
     * retorna el peso de la persona
     * @return  Peso
     */
    public double getPeso(){
        return peso;
    }
}
    
    

