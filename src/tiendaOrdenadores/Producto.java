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
    
    protected String nombre;
    protected String descripcion;
    protected float precio;
    
    
    public Producto(String n, String d, float p){
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

    
    
}
