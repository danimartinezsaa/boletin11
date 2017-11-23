/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

/**
 *
 * @author dani
 */
public class Jugador extends Seleccion{
    private int dorsal;
    private String demarcacion;

    public Jugador(){
    }

    public Jugador(int dorsal, String demarcacion){
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }

    public Jugador(int dorsal, String demarcacion, int id, int edad, String nombre, String apellido){
        super(id, edad, nombre, apellido);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }

    public int getDorsal(){
        return dorsal;
    }

    public String getDemarcacion(){
        return demarcacion;
    }

    public void setDorsal(int dorsal){
        this.dorsal=dorsal;
    }

    public void setDemarcacion(String demarcacion){
        this.demarcacion=demarcacion;
    }

    @Override
    public String toString(){
        return super.toString()+"dorsal="+dorsal+", demarcacion="+demarcacion;
    }
   
    @Override
    public void viajar(){
        System.out.println("Viajan los jugadores");
    }
    
    public void entrenar(){
        
    }
    
    public void jugarPartido(){
        
    }
}
