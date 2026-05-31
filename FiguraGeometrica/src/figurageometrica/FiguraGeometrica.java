/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurageometrica;

import control.ControladorCalcularAreaPerimetro;
import modelo.Figura;
import vista.JFCalcularAreaPerimetro;


public class FiguraGeometrica {

   
    public static void main(String[] args) {
        
        Figura molde = null;
        
        JFCalcularAreaPerimetro frmCalcular = new JFCalcularAreaPerimetro();
        frmCalcular.setVisible(true);
        control.ControladorCalcularAreaPerimetro control = new ControladorCalcularAreaPerimetro(frmCalcular, molde);
       
        
        
    }
    
}
