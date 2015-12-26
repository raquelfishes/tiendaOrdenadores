/*
 * 
 * 
 * 
 */
package tiendaOrdenadores;

import java.io.Serializable;
import java.util.ArrayList;

class EquipoCarrera implements Serializable, Comparable<EquipoCarrera>{

    Circuito circuito;
    Coche coche;
    PilotoOficial piloto;
    float tiempo = -1;

    public EquipoCarrera(Circuito circuito, Coche coche, PilotoOficial piloto) {
        this.circuito = circuito;
        this.coche = coche;
        this.piloto = piloto;
        this.tiempo = -1;
    }
    
    public String toString() {
        return "circuito=" + circuito + ", coche=" + coche + ", piloto=" + piloto + ", tiempo=" + tiempo;
    }       

    public int compareTo(EquipoCarrera o) {
        return Float.compare(tiempo,o.tiempo);
    }
}

public class Escuderia implements Serializable, Comparable<Escuderia>{
    static int contador = 0;
    final int MAX_COCHES = 2;
    final int MAX_PILOTOS_OFIC = 2;
    final int MAX_PILOTOS_PROB = 2;
    final float PORCENTAJE = 0.1f;
    
    private int identificador;
    private String nombre;
    private String pais;
    private int anyoFundacion;
    private float presupuesto;
    private int puntosMundial;

    private String[] directivos;
    private ArrayList<PilotoOficial> pilotosOficiales;
    private ArrayList<PilotoProbador> pilotosProbadores;
    private ArrayList<Coche> coches;
    private ArrayList<EquipoCarrera> equipos;
    
    public Escuderia(String n, String p, int a, int pr, String[] d){
        contador++;
        identificador = contador;
        nombre = n;
        pais = p;
        anyoFundacion = a;
        presupuesto = pr;
        directivos = d;
        puntosMundial = 0;
        pilotosOficiales = new ArrayList();
        pilotosProbadores = new ArrayList();
        coches = new ArrayList();
        equipos = new ArrayList();
    }
    
    public String ficharPiloto(PilotoOficial p){
        if(presupuesto < p.getSueldo()){
            return "No tienes presupuesto suficiente para fichar a este corredor";
        }else if(pilotosOficiales.size() < MAX_PILOTOS_OFIC){
            pilotosOficiales.add(p);
            return "Has fichado a "+p.getNombre()+" como piloto oficial.";
        }
        return "Tienes el máximo de pilotos oficiales, no puedes fichar";
    }
    
    public String ficharPiloto(PilotoProbador p){
        if(presupuesto < p.getSueldo()){
            return "No tienes presupuesto suficiente para fichar a este corredor";
        }else if(pilotosProbadores.size() < MAX_PILOTOS_PROB){
            pilotosProbadores.add(p);    
            return "Has fichado a "+p.getNombre()+" como piloto probador.";
        }
        return "Tienes el máximo de pilotos probadores, no puedes fichar";     
    }
    
    public boolean posibleFichar(PilotoProbador p){
        if(presupuesto < p.getSueldo()){
            return false;
        }else if(pilotosProbadores.size() < MAX_PILOTOS_PROB){       
            return true;
        }
        return false;     
    }
    
    public boolean posibleFichar(PilotoOficial p){
        if(presupuesto < p.getSueldo()){
            return false;
        }else if(pilotosOficiales.size() < MAX_PILOTOS_OFIC){       
            return true;
        }
        return false;     
    }
    
    public boolean posibleCambiar(float val1,float val2){
           return Math.abs(val1 - val2)< (val1*PORCENTAJE);  //True si la diferencia es menor que el 10 % del valor    
    }
    
    public void intercambiarPiloto(PilotoOficial piloto){
         pilotosOficiales.add(piloto);
    }
    
    public void intercambiarPiloto(PilotoProbador piloto){
         pilotosProbadores.add(piloto);
    }
    
    public String descartarPiloto(int idPiloto, Piloto piloto){
            if((idPiloto > 0) && (idPiloto < pilotosOficiales.size()+1)){
                if (pilotosOficiales.size() < 2){
                    return "Debes mantener al menos a 1 piloto oficial";
                }else{
                    piloto= pilotosOficiales.get(idPiloto-1).getPiloto();
                    pilotosOficiales.remove(pilotosOficiales.get(idPiloto-1));
                    return "Has descartado al piloto "+piloto.getNombre();
                }
            }else if(idPiloto < (pilotosOficiales.size()+pilotosProbadores.size())){
                piloto= pilotosProbadores.get(idPiloto-pilotosOficiales.size()-1).getPiloto();
                pilotosProbadores.remove(pilotosProbadores.get(idPiloto-pilotosOficiales.size()-1));
                return "Has descartado al piloto "+piloto.getNombre();
            }
            return "No existe ese identificador de Piloto";
    }
    
    public void pagarPilotos(){
        for (Piloto p : pilotosOficiales) {
            presupuesto -= p.getSueldo();
        }
        for (Piloto p : pilotosProbadores) {
            presupuesto -= p.getSueldo();
        }
    }
    
    public boolean puedoEntrenar(int idPiloto, int idCoche){
        if((idCoche>0) && (idCoche<=coches.size())){
            if((idPiloto > 0) && (idPiloto < pilotosOficiales.size()+1)){
                return true;
            }else if(idPiloto < (pilotosOficiales.size()+pilotosProbadores.size())){
                return true;
            }
        }
        return false;
    }
    
    public String entrenar(int idPiloto, int idCoche){
        if((idCoche>0) && (idCoche<=coches.size())){
            if((idPiloto > 0) && (idPiloto < pilotosOficiales.size()+1)){
                pilotosOficiales.get(idPiloto-1).mejorar();
                coches.get(idCoche-1).mejorar();
                return "El piloto oficial y el coche han mejorado";
            }else if(idPiloto < (pilotosOficiales.size()+pilotosProbadores.size())){
                pilotosProbadores.get(idPiloto-pilotosOficiales.size()-1).mejorar();
                coches.get(idCoche-1).mejorar();
                return "El piloto probador y el coche han mejorado";
            }
            return "No existe ese identificador de Piloto";
        }
        return "No existe ese identificador de coche";
    }
    
    public void pagarValor(float valor){
            presupuesto -= valor;
    }
    
    public boolean presupuestoValor(float valor){
        if(valor < presupuesto){
            return true;
        }
        return false;
    }
    
    public float getSueldosPilotos(Circuito c){
        float sueldos = 0;
        ArrayList<EquipoCarrera> eq = getEquipoCircuito(c);
        if (eq.size()>0){
            for (int i=0; i<eq.size(); i++){
                sueldos+=eq.get(i).piloto.getSueldo();
            }
        }
        return sueldos;
    }
    
    public String anyadirCoche(Coche coche){
        if(coches.size() < MAX_COCHES){
            coches.add(coche);
            return "El coche se ha comprado con exito";
        }
        return "Ya tiene el garaje lleno";
       
    }
    
    public String borrarCoche(int coche){
        if((coche>0) && (coche<=coches.size())){
            coches.remove(coche-1);
            return "El coche se ha regalado";
        }     
        return "El identificador no es correcto";    
    }
    
    public String mostrarCoches (){
        StringBuilder s = new StringBuilder();
           int id=0;
           for (Coche c : coches) { 
               ++id;
               s.append ("Identificador: "+id+" "+c.toString()+"\n");       
           }
        return s.toString();
   }
   
    public String mostrarPilotos (){
        StringBuilder s = new StringBuilder();
           s.append("Pilotos Oficiales \n");
           int id=0;
           for (PilotoOficial p : pilotosOficiales) { 
               ++id;
               s.append ("Identificador: "+id+" "+p.toString()+"\n");       
           }
           s.append("Pilotos Probadores \n");
           for (PilotoProbador p : pilotosProbadores) { 
               ++id;
               s.append ("Identificador: "+id+" "+p.toString()+"\n");       
           }
        return s.toString();
   }
    
   public String mostrarOficiales (){
           StringBuilder s = new StringBuilder();
           s.append("Pilotos Oficiales \n");
           int id=0;
           for (PilotoOficial p : pilotosOficiales) { 
               ++id;
               s.append ("Identificador: "+id+" "+p.toString()+"\n");       
           }
        return s.toString();
   }
   
   public String mostrarProbadores (){
        StringBuilder s = new StringBuilder();
           s.append("Pilotos Oficiales \n");
           int id=0;
           for (PilotoProbador p : pilotosProbadores) { 
               ++id;
               s.append ("Identificador: "+id+" "+p.toString()+"\n");       
           }
        return s.toString();
   }
    
    public String toString(){
        return "Identificador: " + identificador + " Nombre: " + nombre + " Pais: " + pais + 
                " Año Fundacion: " + anyoFundacion + " Presupuesto: " + presupuesto + " Puntos Mundial: " + puntosMundial +"\n";
    }
    
    // Getters y Setters
    public int getIdentificador(){
        return identificador;
    }
    public void setIdentificador(int i){
        identificador = i;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String s){
        nombre = s;
    }
    
    public String getPais(){
        return pais;
    }
    public void setPais(String p){
        pais = p;
    }
    
    public int getAnyoFundacion(){
        return anyoFundacion;
    }
    public void setAnyoFundacion(int a){
        anyoFundacion = a;
    }
    
    public float getPresupuesto(){
        return presupuesto;
    }
    public void setPresupuesto(float p){
        presupuesto = p;
    }
    
    public int getNumCoches(){
        return coches.size();
    }
    
    public int getNumPilotos(){
        return pilotosOficiales.size() + pilotosProbadores.size();
    }
    
    public int getPuntosMundial() {
        return puntosMundial;
    }
    public void setPuntosMundial(int p) {
        puntosMundial = p;
    }

    public ArrayList<EquipoCarrera> getEquipos() {
        return equipos;
    }
    
    public ArrayList<EquipoCarrera> getEquipoCircuito(Circuito c){
        ArrayList<EquipoCarrera> eq = new ArrayList();
        for (EquipoCarrera equipo:equipos){
            if (equipo.circuito.getIdentificador() == c.getIdentificador())
                eq.add(equipo);
        }
        return eq;
    }
    
    public int compareTo(Escuderia o) {
        return Integer.compare(puntosMundial,o.getPuntosMundial());
    }

    public String mostrarInformacion() {
        String s = "Escuderia: " + nombre + " Presupuesto: "+presupuesto+"\t Puntos: "+puntosMundial+"\n\t Puntos de sus pilotos: \n";
        for(int i=0; i<pilotosOficiales.size(); i++){
            s += "\t" + pilotosOficiales.get(i).getNombre() + ": " + pilotosOficiales.get(i).getPuntosMundial();
        }
        s+="\n";
        return s;
    }

    public void crearEquipoCircuito(Circuito circuito) {
        EquipoCarrera equipo1 = new EquipoCarrera(circuito,coches.get(0),pilotosOficiales.get(0));
        equipos.add(equipo1);
        if (coches.size()==2 && pilotosOficiales.size()==2){
            EquipoCarrera equipo2 = new EquipoCarrera(circuito,coches.get(1),pilotosOficiales.get(1));
            equipos.add(equipo2);
        }
    }
    
    public void crearEquipo(int idPiloto, int idCoche, Circuito c){
        ArrayList<EquipoCarrera> equipos = getEquipoCircuito(c);
        if (equipos.size()!=0){
            for (int i=0; i<equipos.size(); i++){
                if (equipos.get(i).piloto.getIdentificador() == idPiloto || equipos.get(i).coche.getIdentificador()== idCoche){
                    // Ya hay un equipo para este circuito y este coche o piloto
                    // Se borra el equipo que ya había
                    equipos.remove(i);
                }
            }
        }
        // Se inserta el equipo creado por el usuario
        EquipoCarrera equipo = new EquipoCarrera(c, coches.get(idCoche), pilotosOficiales.get(idPiloto));
        equipos.add(equipo);
    }

    public boolean tienePiloto(Piloto pil) {
        for (int i=0; i<pilotosOficiales.size(); i++){
            if (pilotosOficiales.get(i)==pil)
                return true;
        }
        return false;
    }
    
    public int getNumOficiales(){
        return pilotosOficiales.size();
    }
    
    public int getNumProbadores(){
        return pilotosProbadores.size();
    }
    
    public ArrayList<PilotoOficial> getOficiales(){
        return pilotosOficiales;
    }
    
    public ArrayList<PilotoProbador> getProbadores(){
        return pilotosProbadores;
    }
    
    public void removeOfic(int piloto){
        pilotosOficiales.remove(piloto);
    }
    
    public void removeProb(int piloto){
        pilotosProbadores.remove(piloto);
    } 
}
