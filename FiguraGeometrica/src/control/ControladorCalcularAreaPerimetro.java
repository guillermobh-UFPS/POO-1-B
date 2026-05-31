/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.JFCalcularAreaPerimetro;
import java.util.ArrayList;
import modelo.*;
//Aca el import de modelo se usan todos porque no es necesario mas controladores, pero al tener mas solo se ponen los que se necesitan


public class ControladorCalcularAreaPerimetro implements ActionListener{
    
    private JFCalcularAreaPerimetro frmCalcularAreaPerimetro;
    private Figura modelo;
    private ArrayList<String> historial = new ArrayList<>();
    
    
    


    public ControladorCalcularAreaPerimetro() {
    }

    public ControladorCalcularAreaPerimetro(JFCalcularAreaPerimetro frmCalcularAreaPErimetro, Figura modelo) {
        this.frmCalcularAreaPerimetro = frmCalcularAreaPErimetro;
        this.modelo = modelo;
        
        
        frmCalcularAreaPerimetro.btnAreaTriangulo.addActionListener(this);
        frmCalcularAreaPerimetro.btnPerimetroTriangulo.addActionListener(this);
        frmCalcularAreaPerimetro.btnPerimetroCuadrado.addActionListener(this);
        frmCalcularAreaPerimetro.btnPerimetroRectangulo.addActionListener(this);
        frmCalcularAreaPerimetro.btnAreaCuadrado.addActionListener(this);
        frmCalcularAreaPerimetro.btnAreaRectangulo.addActionListener(this);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
        if (e.getSource() == frmCalcularAreaPerimetro.btnAreaTriangulo) {
            
            double ladoA = Double.parseDouble(frmCalcularAreaPerimetro.txtLadoATriangulo.getText());
            double ladoB = Double.parseDouble(frmCalcularAreaPerimetro.txtLadoBTriangulo.getText());
            double ladoC = Double.parseDouble(frmCalcularAreaPerimetro.txtLadoCTriangulo.getText());
            
            Triangulo t = new Triangulo(ladoA,ladoB,ladoC);
            
            double resultado = t.CalcularArea();
            
            frmCalcularAreaPerimetro.areaMostrar.append("El Area del triangulo con Lados "+ladoA+" ; "+ladoB+" ; "+ladoC+".  Es: "+resultado+"\n");
            
            String rep = "Hola Mundo" + "\n";
            historial.add(rep);
            System.out.println(historial);
           
            
            
        }
        
        if (e.getSource() == frmCalcularAreaPerimetro.btnPerimetroTriangulo){
            
            double ladoA = Double.parseDouble(frmCalcularAreaPerimetro.txtLadoATriangulo.getText());
            double ladoB = Double.parseDouble(frmCalcularAreaPerimetro.txtLadoBTriangulo.getText());
            double ladoC = Double.parseDouble(frmCalcularAreaPerimetro.txtLadoCTriangulo.getText());
            
            Triangulo t = new Triangulo(ladoA,ladoB,ladoC);
           double resultado = t.CalcularPerimetro();
            
            frmCalcularAreaPerimetro.areaMostrar.append("El Perimetro del triangulo con Lados "+ladoA+" ; "+ladoB+" ; "+ladoC+".  Es: "+resultado+"\n");
        }
        
        if (e.getSource() == frmCalcularAreaPerimetro.btnAreaCuadrado){
            
            double lado = Double.parseDouble(frmCalcularAreaPerimetro.txtLadoCuadrado.getText());
            
            Cuadrado t = new Cuadrado(lado);
            double resultado = t.CalcularArea();
            
            frmCalcularAreaPerimetro.areaMostrar.append("El area del cuadrado de lado "+lado+".   Es: "+resultado+"\n");
        }
        
        if(e.getSource() == frmCalcularAreaPerimetro.btnPerimetroCuadrado){
            
            double lado = Double.parseDouble(frmCalcularAreaPerimetro.txtLadoCuadrado.getText());
            Cuadrado t = new Cuadrado(lado);
            double resultado = t.CalcularPerimetro();
            
            frmCalcularAreaPerimetro.areaMostrar.append("El perimetro del cuadrado de lado "+lado+".   Es: "+resultado+"\n");
        }
        
        if (e.getSource() == frmCalcularAreaPerimetro.btnAreaRectangulo){
            
            double base = Double.parseDouble(frmCalcularAreaPerimetro.txtBaseRectangulo.getText());
            double altura = Double.parseDouble(frmCalcularAreaPerimetro.txtAlturaRectangulo.getText());
            Rectangulo t = new Rectangulo(base,altura);
            double resultado = t.CalcularArea();
            
            frmCalcularAreaPerimetro.areaMostrar.append("El Area del rectangulo de base: "+base+", y altura: "+altura+".   Es: "+resultado+"\n");  
        }
        
        if (e.getSource() == frmCalcularAreaPerimetro.btnPerimetroRectangulo){
            
            double base = Double.parseDouble(frmCalcularAreaPerimetro.txtBaseRectangulo.getText());
            double altura = Double.parseDouble(frmCalcularAreaPerimetro.txtAlturaRectangulo.getText());
            Rectangulo t = new Rectangulo(base,altura);
            double resultado = t.CalcularPerimetro();
            
            frmCalcularAreaPerimetro.areaMostrar.append("El Perimetro del rectangulo de base: "+base+", y altura: "+altura+".   Es: "+resultado+"\n");
            
        }
        
        } catch (NumberFormatException ex){
            
            javax.swing.JOptionPane.showMessageDialog(frmCalcularAreaPerimetro,"Ingresa números NUMEROS SUBNORMAL.");
            
        }   
    }
    
}
