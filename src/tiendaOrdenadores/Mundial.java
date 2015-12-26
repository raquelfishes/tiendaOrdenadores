
package tiendaOrdenadores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Mundial implements Serializable{
    
    private ArrayList<Escuderia> escuderias;
    private ArrayList<Piloto> pilotos;
    private Carrera[] carreras = new Carrera[5];
    private int siguienteCarrera;
    private boolean empezado;
    
    public Mundial(ArrayList e){
        escuderias = e;
        pilotos = new ArrayList();
        siguienteCarrera=0;
    }
    
    public String empezarMundial(){
        String mensaje = "";
        empezado = true;
        for (Escuderia escuderia : escuderias) {
            if (escuderia.getNumCoches()==0 && escuderia.getNumOficiales()==0){
                //No se puede inscribir la escuderia(le falta un coche o un piloto oficial)
                mensaje += "La escuderia "+escuderia.getNombre()+" ("+escuderia.getIdentificador()+") no tiene suficientes pilotos oficiales o coches.\n";
                empezado=false;
            }
            else{
                //Se inscribe la escuderia en el mundial
                for (int i=0; i<carreras.length; i++){
                    if (escuderia.getEquipoCircuito(carreras[i].getCircuito()).size() == 0){
                        escuderia.crearEquipoCircuito(carreras[i].getCircuito());
                    }
                }
            }
        }
        if (!empezado){
            return mensaje;
        }
        mensaje = "¡El mundial URJC ha comenzado!";
        return mensaje;
    }
    
    public String empezarCarrera(){
        String s="";
        // Primero cada escuderia paga los canon y al piloto
        for (Escuderia escuderia: escuderias){
            if (escuderia.presupuestoValor(carreras[siguienteCarrera].getCircuito().getCanon()+escuderia.getSueldosPilotos(carreras[siguienteCarrera].getCircuito()))){
                escuderia.pagarValor(carreras[siguienteCarrera].getCircuito().getCanon());
                escuderia.pagarValor(escuderia.getSueldosPilotos(carreras[siguienteCarrera].getCircuito()));
            }
            else{
                s="La escuderia "+escuderia.getNombre()+ " no tiene dinero suficiente para participar en esta carrera";
            }
        }
        // Segundo cada escuderia compite con sus equipos en la carrera
        for (Escuderia escuderia: escuderias){
            if (escuderia.presupuestoValor(carreras[siguienteCarrera].getCircuito().getCanon()+escuderia.getSueldosPilotos(carreras[siguienteCarrera].getCircuito()))){
                for (EquipoCarrera equipo:escuderia.getEquipoCircuito(carreras[siguienteCarrera].getCircuito())){
                    equipo.tiempo = carreras[siguienteCarrera].tiempoPiloto(equipo);
                    //Mejorar caracteristicas piloto y coche
                    equipo.piloto.mejorar();
                    equipo.coche.mejorar();
                }
            }
        }
        //Rellenar clasificacion 
        carreras[siguienteCarrera].rellenarClasificacion(escuderias);
        //mostrar informacion
        for (Escuderia escuderia: escuderias){
            if (escuderia.presupuestoValor(carreras[siguienteCarrera].getCircuito().getCanon()+escuderia.getSueldosPilotos(carreras[siguienteCarrera].getCircuito()))){
                s += escuderia.mostrarInformacion()+"\n";
            }
        }
        Collections.sort(escuderias);
        ++siguienteCarrera;
        return s;
    }
    
    public String mostrarEstadisticasMundial(){
        String s = "";
        for (int i=0; i<escuderias.size(); i++){
            s+="Posicion: " + (i+1) + "\t" + escuderias.get(i).mostrarInformacion()+"\n";
        }
        return s;
    }
    
    public String mostrarEstadisticasCarrera(int i){
        String s = "";
        s = carreras[i].mostrarInformacion();
        return s;
    }
    
    public String mostrarCarreras(){
        String s = "";
        for (int i=0; i<5; i++){
            s += "Carrera: " + (i+1) + carreras[i].toString() + "\n";
        }
        return s;
    }

    public boolean isEmpezado() {
        return empezado;
    }

    public void setEmpezado(boolean empezado) {
        this.empezado = empezado;
    }
    
    public void setCarreras(Carrera[] c){
        carreras = c;
    }

    public int getSiguienteCarrera() {
        return siguienteCarrera;
    }

    public void setSiguienteCarrera(int siguienteCarrera) {
        this.siguienteCarrera = siguienteCarrera;
    }
    
    
    
}
