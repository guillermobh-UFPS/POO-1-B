/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ACEVEDO
 */
public class Vecindad {
private Coordenada posicion; 
private String nombre;
private String descripcion; 

    public Vecindad(Coordenada posicion, String nombre, String descripcion) {
        this.posicion = posicion;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Coordenada getPosicion() {
        return posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPosicion(Coordenada posicion) {
        this.posicion = posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  
}
