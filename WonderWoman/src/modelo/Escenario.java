/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;




public class Escenario {
    
    private Coordenada posicion;
    private String nombre;
    private String descripcion;
    private WonderWoman wonderWoman;
    private Enemigo ares;
    private Aliado steve;

    public Escenario() {
    }

    public Escenario(Coordenada posicion, String nombre, String descripcion) {
        this.posicion = posicion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        
        this.wonderWoman = new WonderWoman("Diana", "Themyscira", new ArrayList<>(), new ArrayList<>());
        this.ares = new Enemigo("Ares", "Olimpo", new ArrayList<>(), new ArrayList<>());
        this.steve = new Aliado("Steve", "Tierra", new ArrayList<>(), new ArrayList<>());
        
    }

    public Coordenada getPosicion() {
        return posicion;
    }

    public void setPosicion(Coordenada posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public WonderWoman getWonderWoman() {
        return wonderWoman;
    }

    public void setWonderWoman(WonderWoman wonderWoman) {
        this.wonderWoman = wonderWoman;
    }

    public Enemigo getAres() {
        return ares;
    }

    public void setAres(Enemigo ares) {
        this.ares = ares;
    }

    public Aliado getSteve() {
        return steve;
    }

    public void setSteve(Aliado steve) {
        this.steve = steve;
    }
    
}
