/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;



public class Usuario {
    
    private String nombre;
    private ArrayList<Genero> preferencias;
    private ArrayList<Pelicula> historial;

    public Usuario() {
    }

    public Usuario(String nombre, ArrayList<Genero> preferencias, ArrayList<Pelicula> historial) {
        this.nombre = nombre;
        this.preferencias = preferencias;
        this.historial = historial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Genero> getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(ArrayList<Genero> preferencias) {
        this.preferencias = preferencias;
    }

    public ArrayList<Pelicula> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Pelicula> historial) {
        this.historial = historial;
    }
    
    public void AddHistorial(Pelicula vio ) {
        historial.add(vio);
    }
    
    public void CalificarPeli(Pelicula pelicula,Usuario usuario, int puntuacion, String comentario){
        
        Calificacion nueva = new Calificacion(usuario, (int) puntuacion,comentario);
        
        pelicula.getCalificacion().add(nueva);
        
    }
}
