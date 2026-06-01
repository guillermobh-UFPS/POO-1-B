/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ACEVEDO
 */
public class Jugador {
private String nombre;
private String id;
private int edad;

    public Jugador(String nombre, String id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
//métodos de la clase
    public void controlarPersonaje(){
        
    }
}
