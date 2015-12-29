/*
 * 
 * 
 * 
 */
package tiendaOrdenadores;

import java.io.Serializable;

public class DiscoDuro extends Producto{

    private String fabricante;
    private float capacidad;

    public DiscoDuro(String n, String d, float p, String f, float c) {
        super(n, d, p);
        fabricante = f;
        capacidad = c;
    }
    
    //Getters y Setters
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }
    
    public String toString(){
        String s = super.toString();
        s.append(" fabricante: " + fabricante + " capacidad: " + capacidad);
        return s;
    }
     
}
