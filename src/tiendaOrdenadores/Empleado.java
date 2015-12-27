/*
 * 
 * 
 * 
 */
package tiendaOrdenadores;

import java.io.Serializable;

public class Empleado implements Serializable, Comparable<Empleado>{

    static int contador = 0;
    private int identificador;
    protected String nombre;
    protected String apellidos;
    protected float sueldoBase;
    protected float dineroVentas;
    
    public Empleado(String n, String a){
        contador++;
        identificador = contador;
        nombre = n;
        apellidos = a;
    }
    
    @Override
    public String toString(){
        return "  Identificador: " + identificador + " Nombre: " + nombre + " Apellidos: " + apellidos + 
                  "Sueldo Base: " + sueldoBase + "Dinero Ventas: " + dineroVentas + "\n";
    }
    
    // Metodos abstractos
    
    public float calcularSueldo(){return sueldoBase + dineroVentas;}
    
    
    // Getters y Setters
    public int getIdentificador(){
        return identificador;
    }
    public void setIdentificador(int i){
        identificador = i;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String s){
        nombre = s;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String s){
        apellidos = s;
    }
    
    public float getSueldoBase(){
        return sueldoBase;
    }
    public void setSueldoBase(float s){
        sueldoBase = s;
    }

    public Empleado getEmpleado(){
        return this;
    }
    
    public int compareTo(Empleado o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
