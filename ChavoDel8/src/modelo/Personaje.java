/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ACEVEDO
 */
public class Personaje {
protected String nombre; 
protected int edad;
protected String personalidad; 
protected String rol;

    public Personaje(String nombre, int edad, String personalidad, String rol) {
        this.nombre = nombre;
        this.edad = edad;
        this.personalidad = personalidad;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public String getRol() {
        return rol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

//métodos de la clase
    
public void interactuarPersonaje(){
    
}
public void moverseVecindad(){
    
}
public void interactuarObjetos(){
    
}
}
