/*
 * 
 * 
 * 
 */
package tiendaOrdenadores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Producto implements Serializable{
    
    static int contador = 0;
    private int identificador;
    protected String nombre;
    protected String descripcion;
    protected float precio;
    
    
    public Producto(String n, String d, float p){
        contador++;
        identificador = contador;
        nombre = n;
        descripcion = d;
        precio = p;
    }
    
    

    //Getters y setters
    
    public String getNombre() {    
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {    
        this.precio = precio;
    }

    public Producto getProducto() {
        return this;
    }
    
    public String toString(){
        s.append(" tipo: " + tipo + " capacidad: " + capacidad);
        return s;
    }

    public String toString(){
        return "  Identificador: " + identificador + " Nombre: " + nombre + " Descripcion: " + descripcion + 
                  " Precio: " + precio + "\n";
    }
    
}
