/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9ipo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static practica9ipo.selIdioma.contenido;

/**
 *
 * @author Juan Béjar
 */
public class Utils {
    

//Método para obtener los idiomas definidos en el fichero de configuración    
public List<String> obtenerIdiomas() throws FileNotFoundException,IOException{

        List<String> idiomas=new ArrayList<String>();

        
        for(int i=0;i<contenido.size();i++){
            idiomas.add(i,contenido.get(i).get(1));
        }
        
        return idiomas;
        
    
}
    
    
    
}
