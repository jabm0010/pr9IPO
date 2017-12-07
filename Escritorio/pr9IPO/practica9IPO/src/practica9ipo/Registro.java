/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9ipo;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Juan Béjar
 */
public class Registro {
    LinkedList<Portátil> portatiles=new LinkedList<>();
        

    
    
    public void añadirRegistro(String _marca, String _modelo, double _almacenamiento, String _procesador){
        Portátil p=new Portátil(_marca, _modelo, _almacenamiento, _procesador );
        
        portatiles.push(p);  
        
    }
    
    
    public void eliminarRegistro(int indice){
        portatiles.remove(indice);
        
        
    }
    
    public void modificarRegistro(int indice,Portátil p){
        portatiles.set(indice, p);
        
    }
    
    
    public void consultarRegistros(int indice){
       
        
        
    }
    
    
    
    
    
    
    
}
