/*
 * 
 * 
 * 
 */
package tiendaOrdenadores;

import java.io.Serializable;
import java.util.Random;

public class Circuito implements Serializable{
    static int contador = 0;
    private int identificador;
    private String nombre;
    private int aforo;
    private float canon;
    private int numeroRectas;
    private int numeroCurvas;
    private int[] rectas;
    private int[] curvas;
    private int[] premios = {100000, 75000, 50000, 25000, 15000, 10000};
    
    public Circuito(String n, int a, float c, int nR, int nC){
        contador++;
        identificador = contador;
        nombre = n;
        aforo = a;
        canon = c;
        numeroRectas = nR;
        numeroCurvas = nC;
        crearRectas(nR);
        crearCurvas(nC);
    }
    
    public String toString(){
        return "   Identificador: " + identificador + " Nombre: " + nombre + " Aforo: " + aforo + 
                " Canon: " + canon + " Numero Rectas: " + numeroRectas + " Numero Curvas: " + numeroCurvas +"\n";
    }
    
    public void crearRectas(int n){
        rectas = new int[n];
        Random rand = new Random();
        for (int i=0; i<n; i++){
            rectas[i] = rand.nextInt() % 5;  // Como maximo cada curva tiene 5km
        }
    }
    
    public void crearCurvas(int n){
        curvas = new int[n];
        Random rand = new Random();
        for (int i=0; i<n; i++){
            curvas[i] = rand.nextInt() % 3; // Como maximo cada curva tiene 3km
        }
    }
    
    public int kilometrosRectas(){
        int k=0;
        for (int i=0; i<rectas.length; ++i){
            k += rectas[i];
        }
        return k;
    }
    
    public int kilometrosCurvas(){
        int k=0;
        for (int i=0; i<curvas.length; ++i){
            k += curvas[i];
        }
        return k;
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
    
    public int getAforo(){
        return aforo;
    }
    public void setAforo(int i){
        aforo = i;
    }
    
    public float getCanon(){
        return canon;
    }
    public void setCanon(int f){
        canon = f;
    }

    public int[] getPremios() {
        return premios;
    }
    
    public int getPremio(int i){
        return premios[i];
    }
    
    public int getNumeroRectas() {
        return numeroRectas;
    }
    public void setNumeroRectas(int n) {
        numeroRectas = n;
    }

    public int getNumeroCurvas() {
        return numeroCurvas;
    }
    public void setNumeroCurvas(int n) {
        numeroCurvas = n;
    }

}
