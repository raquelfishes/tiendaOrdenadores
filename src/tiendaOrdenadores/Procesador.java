/*
 * 
 * 
 * 
 */
package tiendaOrdenadores;

import java.io.Serializable;
import java.util.Random;

public class Procesador extends Producto{
    
    private String marca;
    private float capacidad;

    public Procesador(String n, String d, float p, String m, float c) {
        super(n, d, p);
        marca = m;
        capacidad = c;
    }
    
    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }
    
    public String toString(){
        String s = super.toString();
        s.append(" marca: " + marca + " capacidad: " + capacidad);
        return s;
    }

}
