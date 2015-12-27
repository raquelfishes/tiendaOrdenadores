/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaOrdenadores;

import java.util.ArrayList;


public class Ordenador extends Producto{
    
    private ArrayList<Procesador> procesadores;
    private ArrayList<Memoria> memorias;
    private ArrayList<DiscoDuro> discosDuros;
    
    public Ordenador(String n, String d, float p) {
        super(n, d, p);
    }

    public void anyadirProcesador(Procesador p){
        procesadores.add(p);
    }
    
    public void anyadirMemoria(Memoria m){
        memorias.add(m);
    }
    
    public void anyadirDiscoDuro(DiscoDuro d){
        discosDuros.add(d);
    }
    
}
