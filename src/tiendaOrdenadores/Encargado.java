/*
 * 
 * 
 * 
 */
package tiendaOrdenadores;

import java.io.Serializable;

public class Encargado extends Empleado{
    
    int plusPeligrosidad = 50;

    public Encargado(String n, String a) {
        super(n, a);
    }
    
    
    
    public Empleado getEmplead0(){
        return super.getEmpleado();
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
