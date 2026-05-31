/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;


public abstract class Figura {
    
    protected String nombre;

    public Figura() {
    }

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Los metodos que nosotros creamos siguen la siguiente estructura 
    // [Modificador] [Tipo de Retorno] [Nombre del Método] ([Parámetros]) {[Cuerpo]}
    
    public abstract double CalcularArea();
    
    public abstract double CalcularPerimetro();
    
}
