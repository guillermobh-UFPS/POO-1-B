package control;

import modelo.WonderWoman;
import vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControladorJuego implements ActionListener{
    
    ArrayList b = new ArrayList<>();
    private WonderWoman modeloWW;
    private JFJuego frmJuego;
    private int nivelDano = 1;
    private int multiplicador = 1;
    private int vidaAres = 500;

    public ControladorJuego() {
    }

    public ControladorJuego(JFJuego frmJuego) {
        this.frmJuego = frmJuego;
        
        this.modeloWW = new WonderWoman("Diana", "Themyscira", b, b);
        
        frmJuego.btnAtacarAres.addActionListener(this);
        frmJuego.btnEnemigo.addActionListener(this);
        frmJuego.btnMultiplicador.addActionListener(this);
        frmJuego.btnEscudo.addActionListener(this); 
        frmJuego.btnLazo.addActionListener(this);
        frmJuego.btnInteractuar.addActionListener(this);
        
        
        frmJuego.btnMultiplicador.setEnabled(false);
        
        frmJuego.lblNivelDano.setText("Nivel de Poder: " + nivelDano);
        frmJuego.lblPotenciadorDano.setText("Potenciador de X " + multiplicador + " Necesitas 100 puntos de nivel de daño");
        frmJuego.lblVidaAres.setText("Puntos de vida: " + vidaAres + "/500");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == frmJuego.btnEnemigo){
            nivelDano += 1 * multiplicador;
            frmJuego.lblNivelDano.setText("Nivel de Daño: " + nivelDano);
            
            if(nivelDano >= 100){
                frmJuego.btnMultiplicador.setEnabled(true);
            }
        }
        
        if(e.getSource() == frmJuego.btnMultiplicador){
            multiplicador += 1;
            nivelDano = 0;
            frmJuego.btnMultiplicador.setEnabled(false);
            frmJuego.lblNivelDano.setText("Nivel de Daño: " + nivelDano);
            frmJuego.lblPotenciadorDano.setText("Potenciador de X" + multiplicador);
        }
        
        if(e.getSource() == frmJuego.btnAtacarAres){
            vidaAres -= (1 * multiplicador);
            frmJuego.lblVidaAres.setText("Puntos de vida: " + vidaAres + "/500");
            
            if(vidaAres <= 0){
                javax.swing.JOptionPane.showMessageDialog(frmJuego, "Felicidades Derrotaste a Ares.");
                System.exit(0);
            }
        }
        
        if(e.getSource() == frmJuego.btnEscudo){
            vidaAres -= 100;
            frmJuego.lblVidaAres.setText("Puntos de vida: " + vidaAres + "/500");
            javax.swing.JOptionPane.showMessageDialog(frmJuego, "Lanzaste el escudo a Ares para hacerle daño y le logras quitar 100 puntos de vida, pero pierdes tu escudo.");
            frmJuego.btnEscudo.setEnabled(false);
            
            if(vidaAres <= 0){
                javax.swing.JOptionPane.showMessageDialog(frmJuego, "Felicidades Derrotaste a Ares.");
                System.exit(0);
            }
        }
        
        if(e.getSource() == frmJuego.btnLazo){
           javax.swing.JOptionPane.showMessageDialog(frmJuego, "Tratas de usar el lazo de la verda pero fallas y pierdes el lazo."); 
           frmJuego.btnLazo.setEnabled(false);
        }
        
        if(e.getSource() == frmJuego.btnInteractuar){
           javax.swing.JOptionPane.showMessageDialog(frmJuego, "Steve: Wonder Woman,ayuda necesitamos derrotar a Ares"); 
           
        }
        
    }
}