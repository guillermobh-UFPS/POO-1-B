/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;


public class Triangulo extends Figura{
    
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo() {
    }

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public Triangulo(double ladoA, double ladoB, double ladoC, String nombre) {
        super(nombre);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    
    @Override
    public double CalcularArea(){
        
        double area = (ladoA+ladoB+ladoC)/2;
        return Math.sqrt(area * (area - ladoA) * (area - ladoB) * (area - ladoC));
        
    } 
    
    @Override
    public double CalcularPerimetro(){
        
        double perimetro = ladoA+ladoB+ladoC;
        return perimetro;
        
    }   
    
}
