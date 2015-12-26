/*
 * 
 * 
 * 
 */
package tiendaOrdenadores;

import java.io.Serializable;

class DatosPersonales implements Serializable{
    int edad;
    float altura;
    float peso;
    
    DatosPersonales(int e, float a, float p){
        edad = e;
        altura = a;
        peso = p;
    }

    @Override
    public String toString() {
        return " edad=" + edad + " altura=" + altura + " peso=" + peso;
    }     
}

class CaracteristicasTecnicasPiloto implements Serializable{
    float reflejos;
    float agresividad;
    float paciencia;
    float valentia;
    
    CaracteristicasTecnicasPiloto(float r, float a, float p, float v){
        reflejos = r;
        agresividad = a;
        paciencia = p;
        valentia = v;
    }
    
    float getSumaCaracteristicas(){
        return reflejos + agresividad + paciencia + valentia;
    }
    
    void mejorar(float valor){
        reflejos += valor;
        agresividad += valor;
        paciencia += valor;
        valentia += valor;
    }
}

public class Piloto implements Serializable, Comparable<Piloto>{

    static int contador = 0;
    private int identificador;
    protected String nombre;
    protected String apellidos;
    protected DatosPersonales datosPersonales;
    private int puntosMundial;
    protected float sueldo;
    protected CaracteristicasTecnicasPiloto caracteristicasTecnicas;
    
    public Piloto(String n, String a, DatosPersonales d, CaracteristicasTecnicasPiloto c){
        contador++;
        identificador = contador;
        nombre = n;
        apellidos = a;
        datosPersonales = d;
        caracteristicasTecnicas = c;
        puntosMundial = 0;
    }
    
    public void sumarPuntos(int puntos){
        puntosMundial += puntos;
    }
    
    public String toString(){
        return "  Identificador: " + identificador + " Nombre: " + nombre + " Apellidos: " + apellidos + 
                " Datos Personales: " + "edad, " + datosPersonales.edad + " altura, " + datosPersonales.altura + " peso, " + datosPersonales.peso + 
                " Puntos Mundial: " + puntosMundial + " Sueldo: " + sueldo + 
                " Caracteristicas Tecnicas: " + "reflejos, " + caracteristicasTecnicas.reflejos + " agresividad, " + caracteristicasTecnicas.agresividad + 
                " paciencia, " + caracteristicasTecnicas.paciencia +  " valentia, " + caracteristicasTecnicas.valentia + "\n";
    }
    
    // Metodos abstractos
    
    public float calcularSueldo(){return 0.0f;}
    
    public void mejorar(){}
    
    
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
    
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String s){
        apellidos = s;
    }
    
    public float getSueldo(){
        return sueldo;
    }
    public void setSueldo(float s){
        sueldo = s;
    }
    
    public DatosPersonales getDatosPersonales(){
        return datosPersonales;
    }
    public void setDatosPersonales(DatosPersonales d){
        if (d.edad != 0) datosPersonales.edad = d.edad;
        if (d.altura != 0) datosPersonales.altura = d.altura;
        if (d.peso != 0) datosPersonales.peso = d.peso;
    }
    
    public int getPuntosMundial() {
        return puntosMundial;
    }
    public void setPuntosMundial(int p) {
        puntosMundial = p;
    }

    public CaracteristicasTecnicasPiloto getCaracteristicasTecnicas() {
        return caracteristicasTecnicas;
    }
    public void setCaracteristicasTecnicas(CaracteristicasTecnicasPiloto c) {
        caracteristicasTecnicas = c;
    }
    
    public Piloto getPiloto(){
        return this;
    }

    public int compareTo(Piloto o) {
        return Integer.compare(puntosMundial,o.getPuntosMundial());
    }
    
}
