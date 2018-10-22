/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf5.pkg1.pkg04;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author usuario
 */
public class Peliculas implements Comparable<Peliculas>{
    public enum  Genero{AVENTURA,CIENCIAFICCION,TERROR, INFANTIL};
    private String titulo;
    private int votos;
    private Genero genero;

    public Peliculas(){
        
    }

    public Peliculas(String titulo, Genero genero, int votos) {
        this.titulo = titulo;
        this.votos = votos;
        this.genero=genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public Genero setGenero(Genero genero) {
        this.genero = genero;
        return genero;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "titulo=" + titulo + ", genero=" + genero + ", votos=" + votos + '}';
    }

    @Override
    public int compareTo(Peliculas p) {
        if(p.votos<votos){
            return -1;
        }else if(p.votos>votos){
            return 0;
        }else{
            return 1;
        }
    }
    
 
    
    
    
    
}
