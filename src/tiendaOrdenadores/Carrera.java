/*
 * 
 * 
 * 
 */
package tiendaOrdenadores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Carrera implements Serializable{
    Circuito circuito;
    private int[] puntos = {25, 18, 15, 12, 10, 8, 6, 4, 2, 1};
    ArrayList<EquipoCarrera> clasificacion;
    
    public Carrera(Circuito c){
        circuito = c;
        clasificacion = new ArrayList();
    }
    
    public float tiempoPiloto(EquipoCarrera equipo){
        float t;
        t = equipo.coche.calcularVelocidadRecta() * circuito.kilometrosRectas() + equipo.coche.calcularVelocidadRecta() * circuito.kilometrosCurvas();
        t -= 0.1 * equipo.piloto.getCaracteristicasTecnicas().getSumaCaracteristicas();
        equipo.tiempo = t;
        clasificacion.add(equipo);
        Collections.sort(clasificacion);
        return t;
    }
    
    public void rellenarClasificacion(ArrayList<Escuderia> escuderias){
        for (int i=0; i<puntos.length; i++){
            if (i<clasificacion.size()){
                int punto = clasificacion.get(i).piloto.getPuntosMundial();
                clasificacion.get(i).piloto.setPuntosMundial(punto+puntos[i]);
                for (Escuderia escuderia:escuderias){
                    if (escuderia.tienePiloto(clasificacion.get(i).piloto)){
                        if(i<circuito.getPremios().length)
                            escuderia.setPresupuesto(escuderia.getPresupuesto()+circuito.getPremio(i));
                        escuderia.setPuntosMundial(escuderia.getPuntosMundial()+puntos[i]);
                    }
                }
            }
        }
    }   
    
    public Circuito getCircuito() {
        return circuito;
    }

    public String mostrarInformacion() {
        String s="";
        for (int i=0; i<clasificacion.size(); i++){
            s+="Posicion: "+(i+1)+"\t Piloto: "+clasificacion.get(i).piloto.getNombre()+"  "+clasificacion.get(i).piloto.getApellidos()+"\t Tiempo: "+clasificacion.get(i).tiempo+"\n";
        }
        return s;
    }

    public String toString() {
        return "\tCircuito: " + circuito.getNombre();
    }
    
    
}
