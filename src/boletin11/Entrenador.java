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
public class Entrenador extends Seleccion{
    private String idFederacion;

    public Entrenador(){
    }

    public Entrenador(String idFederacion){
        this.idFederacion=idFederacion;
    }

    public Entrenador(String idFederacion, int id, int edad, String nombre, String apellido){
        super(id, edad, nombre, apellido);
        this.idFederacion=idFederacion;
    }

    public String getIdFederacion(){
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion){
        this.idFederacion=idFederacion;
    }

    @Override
    public String toString(){
        return super.toString()+"idFederacion="+idFederacion;
    }

    @Override
    public void viajar(){
        System.out.println("Viajan los entrenadores");
    }
    
    public void dirijirPartido(){
        
    }
    
    public void dirijirEntrenamiento(){
        
    }
}
