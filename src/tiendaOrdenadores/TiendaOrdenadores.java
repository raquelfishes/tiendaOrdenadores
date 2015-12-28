/*
 * 
 * 
 * 
 */
package tiendaOrdenadores;
import java.io.Serializable;
import static java.lang.Math.abs;
import java.text.ParseException;
import java.util.*;

public class TiendaOrdenadores implements Serializable{
    
    ArrayList<Tienda> tiendas;
    ArrayList<Encargado> encargados;
    ArrayList<Vendedor> vendedores;    
    ArrayList<Vendedor> empleados; 
    ArrayList<Producto> productos;
    
    public TiendaOrdenadores(){
        tiendas = new ArrayList();
        encargados = new ArrayList();
        vendedores = new ArrayList();
        empleados = new ArrayList();
        productos = new ArrayList();
    }
    
    // Gestionar tiendas
    
    public void añadirTienda(Tienda tienda){
       tiendas.add(tienda);
    }
    
    public void borrarTienda(Tienda tienda){
       tiendas.remove(tienda);
    }
    
    public void modificarTienda(int tienda ,String nombre, String direccion,
            String horario) throws ParseException{
        if (!nombre.equals("")){
            tiendas.get(tienda-1).setNombre(nombre);
        }
        if (!direccion.equals("")){
            tiendas.get(tienda-1).setDireccion(direccion);
        }
        if (!horario.equals("")){
            tiendas.get(tienda-1).setHorario(horario);
        }
    }
    
    public Tienda consultarTienda(Tienda tienda){
    for (Tienda a:this.tiendas){
         if (tienda.getIdentificador() == a.getIdentificador()) {
             return a;
         }
    }
    return null;
    }
    
    public int numeroTiendas(){
        return tiendas.size();
    }
    
    public String mostrarTiendas (){
        StringBuilder s = new StringBuilder();
           for (Tienda ti : tiendas) {           
               s.append (ti.toString());
           }
        return s.toString();
    }
    
    public String consultarCatalogoTienda(Tienda tienda){
        tienda.consultarCatalogo();
        return "";
    }
    
    // Gestionar empleados
    
    public void añadirEmpleado(Empleado empleado){
       empleados.add(empleado);
    }
    
    public void borrarEmpleado(Empleado empleado){
       empleados.remove(empleado);
    }
    
    public void modificarEmpleado(int empleado ,String nombre, String apellidos,
            float sueldoBase) throws ParseException{
        if (!nombre.equals("")){
            empleados.get(empleado-1).setNombre(nombre);
        }
        if (!apellidos.equals("")){
            empleados.get(empleado-1).setApellidos(apellidos);
        }
        if (sueldoBase != 0){
            empleados.get(empleado-1).setSueldoBase(sueldoBase);
        }
    }
    
    public Encargado consultarEmpleado(Empleado empleado){
    for (Encargado a:this.empleados){
         if (empleado.getIdentificador() == a.getIdentificador()) {
             return a;
         }
    }
    return null;
    }
    
    public int numeroEmpleados(){
        return encargados.size();
    }
    
    public String mostrarEmpleados (){
        StringBuilder s = new StringBuilder();
        int e=0;
           for (Empleado em : empleados) {
               e++;           
               s.append("Nº "+e).append (en.toString());
           }
        return s.toString();
   }
    
    // Gestionar encargados
    
    public void añadirEncargado(Encargado encargado){
       encargados.add(encargado);
    }
    
    public void borrarEncargado(Encargado encargado){
       encargados.remove(encargado);
    }
    
    public void modificarEncargado(int encargado ,String nombre, String apellidos,
            float sueldoBase) throws ParseException{
        if (!nombre.equals("")){
            encargados.get(encargado-1).setNombre(nombre);
        }
        if (!apellidos.equals("")){
            encargados.get(encargado-1).setApellidos(apellidos);
        }
        if (sueldoBase != 0){
            encargados.get(encargado-1).setSueldoBase(sueldoBase);
        }
    }
    
    public Encargado consultarEncargado(Encargado encargado){
    for (Encargado a:this.encargados){
         if (encargado.getIdentificador() == a.getIdentificador()) {
             return a;
         }
    }
    return null;
    }
    
    public int numeroEncargados(){
        return encargados.size();
    }
    
    public String mostrarEncargados (){
        StringBuilder s = new StringBuilder();
        int e=0;
           for (Encargado en : encargados) {
               e++;           
               s.append("Nº "+e).append (en.toString());
           }
        return s.toString();
   }
    
    // Gestionar vendedores
    
    public void anyadirVendedor(Vendedor vendedor){
       vendedores.add(vendedor);
    }
    
    public void borrarVendedor(Vendedor vendedor){
       vendedores.remove(vendedor);
    }
    
    public void modificarVendedor(int vendedor, String nombre, String apellidos,
            float sueldoBase) throws ParseException{
        if (!nombre.equals("")){
            vendedores.get(vendedor-1).setNombre(nombre);
        }
        if (apellidos.equals("")){
            vendedores.get(vendedor-1).setApellidos(apellidos);
        }
        if (sueldoBase != 0){
            vendedores.get(vendedor-1).setSueldoBase(sueldoBase);
        }
    }
    
    public Vendedor consultarVendedor(Vendedor vendedor){
    for (Vendedor a:this.vendedores){
         if (vendedor.getIdentificador() == a.getIdentificador()) {
             return a;
         }
    }
    return null;
    }
    
    public int numeroVendedores(){
        return vendedores.size();
    }
    
    public String mostrarVendedores (){
        StringBuilder s = new StringBuilder();
        int v=0;
           for (Vendedor ve : vendedores) {
               v++;           
               s.append("Nº "+v).append (ve.toString());
           }
        return s.toString();
   }
    
    // Gestionar Mundial
    
    
}
