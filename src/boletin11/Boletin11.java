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
public class Boletin11{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Seleccion Isco=new Seleccion();
        Jugador Morata=new Jugador(9, "delantero",123,25,"Álvaro","Morata");
        Entrenador Lopetegui=new Entrenador("A123",155,44,"Julen","Lopetegui");
        Masajista Pedro=new Masajista("Grado en fisioterapia",7,111,39,"Pedro","González");
        
        Morata.concentrarse();
        Lopetegui.concentrarse();
        Pedro.concentrarse();
        
        Morata.viajar();
        Lopetegui.viajar();
        Pedro.viajar();
        
    }
    
}
