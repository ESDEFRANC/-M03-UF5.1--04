/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf5.pkg1.pkg04;

import com.sun.jmx.remote.util.OrderClassLoaders;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author usuario
 */
public class M03UF5104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException, IOException {
        
        // TODO code application logic here
         FileReader fr = new FileReader ("videoteca.dat");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<Peliculas>  peliculas = new ArrayList<>();
        BufferedReader vr = new BufferedReader(new InputStreamReader(System.in));
        int menu=0;
        String cadena;
            while(menu!=4){ 
            System.out.println("1. Cargar datos de inicio");
            System.out.println("2. Listar peliculas ordenadas por n de votos");
            System.out.println("3. Listar peliculas ordenadas por genero");
            System.out.println("4. Salir");   
            cadena = vr.readLine();
            menu = Integer.parseInt(cadena);
            
            switch(menu){
              
                case 1:
                    System.out.println("1. Cargar datos de inicio");
                    leerDocumento(br,peliculas);
                    break;
                case 2:
                    System.out.println("2. Listar peliculas ordenadas por n de votos");
                   Collections.sort(peliculas);
                    for (Peliculas pel: peliculas) {
                        System.out.println("Titulo: " + pel.getTitulo()+ ", numero votos: " + pel.getVotos());
                    }
                    break;
                }
                    
            }
            
        }

        
        
        

    
    
    public static ArrayList<Peliculas> leerDocumento(BufferedReader br, ArrayList<Peliculas> peliculas) throws ParseException, IOException {
       String cadena=null;
       
       while((cadena = br.readLine())!= null){
       String[] parts = cadena.split("/");
         Peliculas p = createPelicula(parts);
         peliculas.add(p);
                System.out.println("Peliculas cargadas con exito");
         
       }
       
        return peliculas;
    }
    private static Peliculas createPelicula(String[] data) throws ParseException{
        int num;
        
        num = Integer.parseInt(data[2]);

       return new Peliculas(data[0],data[1],num);
       
    }
    
         
    
}
