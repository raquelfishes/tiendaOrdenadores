/*
 * 
 * 
 * 
 */
package tiendaOrdenadores;

import java.io.Serializable;

public class Encargado extends Empleado{
    
    int porcentajeVentas = 50;

    public Encargado(String n, String a) {
        super(n, a);
    }
    
    public float calcularSueldo(float ventasTienda){
        return super.calcularSueldo() + ventasTienda * porcentajeVentas;
    }
    
    public Empleado getEmpleado(){
        return super.getEmpleado();
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
