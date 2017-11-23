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
public class Seleccion{
    int id,edad;
    String nombre,apellido;

    public Seleccion(){
    }

    public Seleccion(int id, int edad, String nombre, String apellido){
        this.id=id;
        this.edad=edad;
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public int getId(){
        return id;
    }

    public int getEdad(){
        return edad;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    @Override
    public String toString(){
        return "id="+id+", edad="+edad+", nombre="+nombre+", apellido="+apellido;
    }
    
    public void concentrarse(){
        System.out.println("Se concentra la selección");
    }
    
    public void viajar(){
        System.out.println("Viaja la selección");
    }
    
}
