
package tiendaOrdenadores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Memoria extends Producto{
    
    private String tipo;
    private float capacidad;

    public Memoria(String n, String d, float p, String t, float c) {
        super(n, d, p);
        tipo = t;
        capacidad = c;
    }
    
    //Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
}
