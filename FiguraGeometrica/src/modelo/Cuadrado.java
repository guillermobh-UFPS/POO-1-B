/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;


public class Cuadrado extends Figura{
    
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double Lado) {
        this.lado = Lado;
    }

    public Cuadrado(double Lado, String nombre) {
        super(nombre);
        this.lado = Lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double Lado) {
        this.lado = Lado;
    }
    
    @Override 
    public double CalcularArea(){
        
        return lado * lado;                   
    }
    
    @Override
    public double CalcularPerimetro(){
        
        return lado*4;
    }
    
}
