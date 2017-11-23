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
public class Masajista extends Seleccion{

    private String titulacion;
    private int anosExperiencia;

    public Masajista(){
    }

    public Masajista(String titulacion, int anosExperiencia){
        this.titulacion=titulacion;
        this.anosExperiencia=anosExperiencia;
    }

    public Masajista(String titulacion, int anosExperiencia, int id, int edad, String nombre, String apellido){
        super(id, edad, nombre, apellido);
        this.titulacion=titulacion;
        this.anosExperiencia=anosExperiencia;
    }

    public String getTitulacion(){
        return titulacion;
    }

    public int getAnosExperiencia(){
        return anosExperiencia;
    }


    public void setTitulacion(String titulacion){
        this.titulacion=titulacion;
    }

    public void setAnosExperiencia(int anosExperiencia){
        this.anosExperiencia=anosExperiencia;
    }

    @Override
    public String toString(){
        return super.toString()+"titulacion="+titulacion+", anosExperiencia="+anosExperiencia;
    }

    @Override
    public void viajar(){
        System.out.println("Viajan los masajistas");
    }
    
    public void darMasajes(){
        
    }
}
