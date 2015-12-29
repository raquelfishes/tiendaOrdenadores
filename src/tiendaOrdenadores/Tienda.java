/*
 * 
 * 
 * 
 */
package tiendaOrdenadores;

import java.io.Serializable;
import java.util.ArrayList;

public class Tienda implements Serializable, Comparable<Tienda>{
    static int contador = 0;
    
    private int identificador;
    private String nombre;
    private String direccion;
    private String horario;
    private int totalVentas;

    private Encargado encargado;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Producto> productos;
    
    public Tienda(String n, String d, String h, Encargado e){
        contador++;
        identificador = contador;
        nombre = n;
        direccion = d;
        horario = h;
        encargado = e;
        productos = new ArrayList();
        vendedores = new ArrayList();
        totalVentas = 0;
    }
    
    public void consultarCatalogo(){
        
    }
    
    public int getNumeroProductos(){
        return productos.size();
    }
    
    public void addVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }
    
    public void bajaVendedor(Vendedor vendedor){
        vendedores.remove(vendedor);
    }
    
    public boolean buscarProducto(String nombre){
        for (Producto pro: productos){
            if (pro.getNombre().equals(nombre)){
                return True;
            }
        }
        return False;
    }
    
    //Getters y Setters

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

    public Encargado getEncargado() {
        return encargado;
    }

    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
    public int compareTo(Tienda o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
