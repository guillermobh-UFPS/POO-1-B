/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

public class Recomendador {
    
    private ArrayList<Pelicula> peliculasDisponibles;

    public Recomendador() {
    }

    public Recomendador(ArrayList<Pelicula> peliculasDisponibles) {
        this.peliculasDisponibles = peliculasDisponibles;
    }

    public ArrayList<Pelicula> getPeliculasDisponibles() {
        return peliculasDisponibles;
    }

    public void setPeliculasDisponibles(ArrayList<Pelicula> peliculasDisponibles) {
        this.peliculasDisponibles = peliculasDisponibles;
    }
    
    
    public void RecomendarPelisPorGustosCalificacionAutorGenero(){
        
    }

    public ArrayList<Pelicula> BuscarPorNombreAutorGenero(String buscando, ArrayList<Pelicula> resultados){
        for(Pelicula o: peliculasDisponibles){
                if (o.getTitulo().toLowerCase().contains(buscando) || o.getDirector().toLowerCase().contains(buscando) || o.getGenero().name().toLowerCase().contains(buscando) ){
                    resultados.add(o);
                 }   
         }
        return resultados;
     }

}
