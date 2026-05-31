/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author memoy
 */
public class Rectangulo extends Figura{
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double Altura) {
        this.base = base;
        this.altura = Altura;
    }

    public Rectangulo(double base, double Altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = Altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double Altura) {
        this.altura = Altura;
    }
    
    @Override
    public double CalcularArea(){
        return base*altura;
    }
        @Override

    public double CalcularPerimetro(){
        return (base*2)+(altura*2);
    }
    
}
