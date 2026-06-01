
package controlador;

import java.awt.Image;
import modelo.*;
import vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class controladorJuego implements ActionListener {
    private vistaJuego frmVistaJuego;
    private vistaPatio2 frmVistaPatio2;
    private int contador=1;

    public controladorJuego(vistaJuego frmVistaJuego, vistaPatio2 frmVistaPatio2) {
        this.frmVistaJuego = frmVistaJuego;
        this.frmVistaPatio2 = frmVistaPatio2;
        this.frmVistaJuego.btnChavo.addActionListener(this);
        this.frmVistaJuego.btnChilindrina.addActionListener(this);
        this.frmVistaJuego.btnFlorinda.addActionListener(this);
        this.frmVistaJuego.btnRamon.addActionListener(this);
        this.frmVistaJuego.btnTorta.addActionListener(this);
        this.frmVistaJuego.btnInteractuar.addActionListener(this);
        this.frmVistaJuego.btnSiguientePatio.addActionListener(this);
        frmVistaJuego.btnInteractuar.setEnabled(false);
          
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    if(e.getSource()==frmVistaJuego.btnInteractuar){
        frmVistaJuego.AreaTexto.setText("");
        //sí eres el chavo
        String controlar=frmVistaJuego.ComoboboxControlar.getSelectedItem().toString();
        if(controlar.equalsIgnoreCase("Chavo")&& contador==2){
          frmVistaJuego.AreaTexto.append(" "+"\n"
                  +"Es como mirarme al espejo");;
          return;
        }
        if(controlar.equalsIgnoreCase("Chavo")&& (contador==3||contador==4||contador==5)){
          frmVistaJuego.AreaTexto.append(" "+"\n"
                  +"Me voy a comer esta torta"+"\n"
                  +"de Jamón en sus caras");
          return;
        }
        //sí eres la Chilindrina
        if(controlar.equalsIgnoreCase("Chilindrina")&& contador==3){
          frmVistaJuego.AreaTexto.append(" "+"\n"
                  +"Es como mirarme al espejo");
          return;
        }
        if(controlar.equalsIgnoreCase("Chilindrina")&& (contador==2||contador==4||contador==5)){
          frmVistaJuego.AreaTexto.append(" "+"\n"
                  +"¡PIPIPIPIPIPIPIPI!"+"\n"
                  +"Es tu culpa");
          return;
        }
        //sí eres Doña florinda
        if(controlar.equalsIgnoreCase("Doña_Florinda")&& contador==4){
          frmVistaJuego.AreaTexto.append(" "+"\n"
                  +"Es como mirarme al espejo");
          return;
        }
        if(controlar.equalsIgnoreCase("Doña_Florinda")&& contador==5){
          frmVistaJuego.AreaTexto.append(" "+"\n"
                  +"Le pegas a Don Ramon");
          return;
        }
        if(controlar.equalsIgnoreCase("Doña_Florinda")&& (contador==2||contador==3)){
          frmVistaJuego.AreaTexto.append(" "+"\n"
                  +"Yo amo al profesor Jirafales");
          return;
        }
       
        //sí eres el profesor
        if(controlar.equalsIgnoreCase("Profesor")&& contador==4){
          frmVistaJuego.AreaTexto.append(" "+"\n"
                  +"Le compraste un ramo de flores."+"\n"
                  +"Besaste a Doña Florinda.");
          return;
        }
        if(controlar.equalsIgnoreCase("Profesor")){
          frmVistaJuego.AreaTexto.append(" "+"\n"
                  +"Acabo de comprar unas flores");;
          return;
        }
        //sí eres Don ramon
        if(controlar.equalsIgnoreCase("Don_Ramon")&& contador==5){
          frmVistaJuego.AreaTexto.append(" "+"\n"
                  +"Es como mirarme al espejo");
          return;
        }
        if(controlar.equalsIgnoreCase("Don_Ramon")&& contador==2){
          frmVistaJuego.AreaTexto.append(" "+"\n"
                  +"Toma 10.000 Golpes");
          return;
        }
        if(controlar.equalsIgnoreCase("Don_Ramon")&&(contador==3||contador==4)){
          frmVistaJuego.AreaTexto.append(" "+"\n"
                  +"pisoteo mi gorra, gorra, gorra");
          return;
        }
        //sí eres señor Barriga
        if(controlar.equalsIgnoreCase("Señor_Barriga")&& contador==2){
          frmVistaJuego.AreaTexto.append(" "+"\n"
                  +"¡Tenía que ser el Chabo del 8!");
          return;
        }
        if(controlar.equalsIgnoreCase("Señor_Barriga")){
          frmVistaJuego.AreaTexto.append(" "+"\n"
                  +"Deme la renta ahora");
          return;
        }
        //sí eres Quico
        if(controlar.equalsIgnoreCase("Quico")){
          frmVistaJuego.AreaTexto.append(" "+"\n"
                  +"Llorar en la pared y"+"\n"
                  +"llamar a mamá");
          return;
        }
        
    }
    
    if(e.getSource()==frmVistaJuego.btnChavo){
        aparecerChavo();
    }
    if(e.getSource()==frmVistaJuego.btnChilindrina){
        aparecerChilindrina();
    }
    if(e.getSource()==frmVistaJuego.btnFlorinda){
        aparecerFlorinda();
    }
    if(e.getSource()==frmVistaJuego.btnRamon){
        aparecerRamon();
    }
    if(e.getSource()==frmVistaJuego.btnTorta){
        tocasteTorta();
    }
    if(e.getSource()==frmVistaJuego.btnSiguientePatio){
        frmVistaPatio2.setVisible(true);
    }
    }
    
    public void cambiarImagenLabel(JLabel Label,String ruta){
        ImageIcon iconoChavo=new ImageIcon(getClass().getResource(ruta));
        Image imagenChavo=iconoChavo.getImage();
        Label.setIcon(new ImageIcon(imagenChavo.getScaledInstance(Label.getWidth(), Label.getHeight(), Image.SCALE_SMOOTH)));
    }
    public void aparecerChavo(){
        frmVistaJuego.btnInteractuar.setEnabled(true);
        cambiarImagenLabel(frmVistaJuego.labelLibre,"/imagen/Chavo.png");
        frmVistaJuego.labelLibre.setLocation(100,190);
        contador=2;
    }
    public void aparecerChilindrina(){
        frmVistaJuego.btnInteractuar.setEnabled(true);
        cambiarImagenLabel(frmVistaJuego.labelLibre,"/imagen/Chilindrina.png");
        frmVistaJuego.labelLibre.setLocation(-70,200);
        contador=3;
    }
    public void aparecerFlorinda(){
        frmVistaJuego.btnInteractuar.setEnabled(true);
        cambiarImagenLabel(frmVistaJuego.labelLibre,"/imagen/DoñaFlorinda.png");
        frmVistaJuego.labelLibre.setLocation(270,100);
        contador=4;
    }
    public void aparecerRamon(){
        frmVistaJuego.btnInteractuar.setEnabled(true);
        cambiarImagenLabel(frmVistaJuego.labelLibre,"/imagen/Don ramón.png");
        frmVistaJuego.labelLibre.setLocation(330,200);
        contador=5;
    }
    public void tocasteTorta(){
       frmVistaJuego.AreaTexto.setText("");
       frmVistaJuego.AreaTexto.append(" "+"\n"
                  +"Tocaste una torta de jamón"+"\n"
                  +"muy apetitosa");
    }
    
    
}
