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

public class Administrador implements Serializable{
    
    ArrayList<Tienda> tiendas;
    ArrayList<Encargado> encargados;
    ArrayList<Vendedor> vendedores;

    Mundial mundial;
    
    
    public Administrador(){
        tiendas = new ArrayList();
        encargados = new ArrayList();
        vendedores = new ArrayList();
    }
    
    // Gestionar tiendas
    
    public void añadirTienda(Tienda tienda){
       tiendas.add(tienda);
    }
    
    public void borrarTienda(Tienda tienda){
       tiendas.remove(tienda);
    }
    
    public void modificarEscuderia(int escuderia ,String nombre, String pais,
            String anyoFundacion, String presupuesto) throws ParseException{
        if (!nombre.equals("")){
            escuderias.get(escuderia-1).setNombre(nombre);
        }
        if (!pais.equals("")){
            escuderias.get(escuderia-1).setPais(pais);
        }
        if (!anyoFundacion.equals("")){
            escuderias.get(escuderia-1).setAnyoFundacion(Integer.parseInt(anyoFundacion));
        }
        if (!presupuesto.equals("")){
            escuderias.get(escuderia-1).setPresupuesto(Integer.parseInt(presupuesto));
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
    
    // Gestionar encargados
    
    public void añadirEncargado(Encargado encargado){
       encargados.add(encargado);
    }
    
    public void borrarEncargado(Encargado encargado){
       encargados.remove(encargado);
    }
    
    //TODO: modificarEncargao
    public void modificarPiloto(int piloto ,String nombre, String apellidos,
            DatosPersonales datosPersonales) throws ParseException{
        if (!nombre.equals("")){
            pilotos.get(piloto-1).setNombre(nombre);
        }
        if (!apellidos.equals("")){
            pilotos.get(piloto-1).setApellidos(apellidos);
        }
        if (datosPersonales != null){
            pilotos.get(piloto-1).setDatosPersonales(datosPersonales);
        }
    }
    
    public Piloto consultarPiloto(Piloto piloto){
    for (Piloto a:this.pilotos){
         if (piloto.getIdentificador() == a.getIdentificador()) {
             return a;
         }
    }
    return null;
    }
    
    public int numeroPilotos(){
        return pilotos.size();
    }
    
    public String mostrarPilotos (){
        StringBuilder s = new StringBuilder();
        int p=0;
           for (Piloto pi : pilotos) {
               p++;           
               s.append("Nº "+p).append (pi.toString());
           }
        return s.toString();
   }
    
    // Gestionar circuitos
    
    public void añadirCircuito(Circuito circuito){
       circuitos.add(circuito);
    }
    
    public void borrarCircuito(Circuito circuito){
       circuitos.remove(circuito);
    }
    
    public void modificarCircuito(int circuito, String nombre, int aforo,
            int canon) throws ParseException{
        if (!nombre.equals("")){
            circuitos.get(circuito-1).setNombre(nombre);
        }
        if (aforo != 0){
            circuitos.get(circuito-1).setAforo(aforo);
        }
        if (canon != 0){
            circuitos.get(circuito-1).setCanon(canon);
        }
    }
    
    public Circuito consultarCircuito(Circuito circuito){
    for (Circuito a:this.circuitos){
         if (circuito.getIdentificador() == a.getIdentificador()) {
             return a;
         }
    }
    return null;
    }
    
    public int numeroCircuitos(){
        return circuitos.size();
    }
    
    public String mostrarCircuitos (){
        StringBuilder s = new StringBuilder();
        int c=0;
           for (Circuito ci : circuitos) {
               c++;           
               s.append("Nº "+c).append (ci.toString());
           }
        return s.toString();
   }
    
    // Gestionar Mundial
    
    public void crearMundial(){
        mundial = new Mundial(escuderias);
        Carrera[] carreras = new Carrera[5];
        Random rand = new Random();
        for (int i=0; i<5; i++){
            int r = abs(rand.nextInt());
            carreras[i] = new Carrera(circuitos.get(r%circuitos.size()));
        }
        mundial.setCarreras(carreras);
    }
}
