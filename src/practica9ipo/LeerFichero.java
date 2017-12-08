/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9ipo;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Juan Béjar
 */
public class LeerFichero {
    private LinkedList<LinkedList<String>> contenido=new LinkedList<>();
    private int pos=0;
      
    
    public LeerFichero() throws FileNotFoundException, IOException{


        int contadorIdiomas=0;
        FileReader fichero=new FileReader("archivoconfiguracion.txt");
        String cadena;

        BufferedReader lectura = new BufferedReader(fichero);
        while((cadena=lectura.readLine())!=null){
            
           LinkedList<String> lis=new LinkedList<>();
            
            //System.out.println(cadena);
            String contS=cadena;
            lis.addLast(cadena);
            //contenido.get(pos).add(0,contS);
            System.out.println("Cadena: "+cadena+" guardada en "+ pos+" - "+0);
            int cont=Integer.parseInt(cadena);
            for(int i=1;i<=cont;i++){
                String actual=lectura.readLine();
                System.out.println(actual);
                //contenido.get(pos).add(i,actual);
                lis.addLast(actual);
                System.out.println("Cadena: "+actual+" guardada en "+ pos+" - "+i);
            }
            
            
            contenido.add(pos, lis);
            pos++;  
            contadorIdiomas++;
            

            
            
            
        }
        
        
        
        
        
        lectura.close();
        
        
    }
    
    
    public LinkedList<LinkedList<String>> contenidos(){
        return contenido;
    }

    
    
    
}
