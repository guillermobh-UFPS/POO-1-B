/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ACEVEDO
 */
public class Coordenada {
private double posicionx; 
private double posiciony;

    public Coordenada(double posicionx, double posiciony) {
        this.posicionx = posicionx;
        this.posiciony = posiciony;
    }

    public double getPosicionx() {
        return posicionx;
    }

    public double getPosiciony() {
        return posiciony;
    }

    public void setPosicionx(double posicionx) {
        this.posicionx = posicionx;
    }

    public void setPosiciony(double posiciony) {
        this.posiciony = posiciony;
    }


}
