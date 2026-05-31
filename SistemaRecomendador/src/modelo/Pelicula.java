/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;


public class Pelicula {
    
    private String titulo;
    private Genero genero;
    private double duracion;
    private ArrayList<Calificacion> calificacion;
    private String director;
    private int anio;

    public Pelicula() {
    }

    public Pelicula(String titulo, Genero genero, double duracion, ArrayList<Calificacion> calificacion, String director, int anio) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.calificacion = calificacion;
        this.director = director;
        this.anio = anio;
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

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Calificacion> getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(ArrayList<Calificacion> calificacion) {
        this.calificacion = calificacion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public void addCalificacion(Calificacion calificacionU){
        calificacion.add(calificacionU);
    }
    

    
    
    
    
    
}
