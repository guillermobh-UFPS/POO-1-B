/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import vista.vistaPatio2;
import java.awt.Image;
import modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class controladorPatio2 implements ActionListener {
    private vistaPatio2 frmVistaPatio;
    private int contador=1;
    public controladorPatio2(vistaPatio2 frmVistaPatio) {
        this.frmVistaPatio = frmVistaPatio;
        this.frmVistaPatio.btnRegresar.addActionListener(this);
        this.frmVistaPatio.btnProfesor.addActionListener(this);
        this.frmVistaPatio.btnQuico.addActionListener(this);
        this.frmVistaPatio.btnBarriga.addActionListener(this);
        this.frmVistaPatio.btnInteractuar.addActionListener(this);
        this.frmVistaPatio.btnFuente.addActionListener(this);
        
       frmVistaPatio.btnInteractuar.setEnabled(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==frmVistaPatio.btnInteractuar){
            frmVistaPatio.AreaTexto.setText("");
        String controlar=frmVistaPatio.ComoboboxControlar.getSelectedItem().toString();

        //sí eres Doña Florinda
        if(controlar.equalsIgnoreCase("Doña_Florinda")&& contador==3){
          frmVistaPatio.AreaTexto.append(" "+"\n"
                  +"Besas al profesor Jirafales con pasión");;
          return;
        }
        //sí eres el Profesor
        if(controlar.equalsIgnoreCase("Profesor")&& contador==3){
          frmVistaPatio.AreaTexto.append(" "+"\n"
                  +"Es como mirarme al espejo");;
          return;
        }
        if(controlar.equalsIgnoreCase("Profesor")&& (contador==2||contador==4)){
          frmVistaPatio.AreaTexto.append(" "+"\n"
                  +"Acabo de comprar unas flores");;
          return;
        }
        
        //sí eres la El señor Barriga
        if(controlar.equalsIgnoreCase("Señor_Barriga")&& contador==2){
          frmVistaPatio.AreaTexto.append(" "+"\n"
                  +"Es como mirarme al espejo");
          return;
        }
        if(controlar.equalsIgnoreCase("Señor_Barriga")&& (contador==3||contador==4)){
          frmVistaPatio.AreaTexto.append(" "+"\n"
                  +"Deme la renta ahora");
          return;
        }
        
        //sí eres Quico
        if(controlar.equalsIgnoreCase("Quico")&& contador==4){
          frmVistaPatio.AreaTexto.append(" "+"\n"
                  +"Es como mirarme al espejo");
          return;
        }
        if(controlar.equalsIgnoreCase("Quico")){
          frmVistaPatio.AreaTexto.append(" "+"\n"
                  +"Llorar en la pared y"+"\n"
                  +"llamar a mamá");
          return;
        }
        //sí eres Doña Florinda
        if(controlar.equalsIgnoreCase("Doña_Florinda")&& contador==3){
          frmVistaPatio.AreaTexto.append(" "+"\n"
                  +"Bésame profesor");
          return;
        }
        if(controlar.equalsIgnoreCase("Doña_Florinda")){
          frmVistaPatio.AreaTexto.append(" "+"\n"
                  +"Yo amo al profesor Jirafales");
          return;
        }
        //sí eres el chavo
        if(controlar.equalsIgnoreCase("Chavo")){
          frmVistaPatio.AreaTexto.append(" "+"\n"
                  +"Me voy a comer esta torta"+"\n"
                  +"de Jamón en sus caras");
          return;
        }
        //sí eres la Chilindrina
        if(controlar.equalsIgnoreCase("Chilindrina")){
          frmVistaPatio.AreaTexto.append(" "+"\n"
                  +"¡PIPIPIPIPIPIPIPI!"+"\n"
                  +"Es tu culpa");
          return;
        }
        //sí eres Don ramon
        if(controlar.equalsIgnoreCase("Don_Ramon")){
          frmVistaPatio.AreaTexto.append(" "+"\n"
                  +"pisoteo mi gorra, gorra, gorra");
          return;
        }
        }
        if(e.getSource()==frmVistaPatio.btnRegresar){
            frmVistaPatio.setVisible(false);
        }
        if(e.getSource()==frmVistaPatio.btnBarriga){
            aparecerBarriga();
        }
        if(e.getSource()==frmVistaPatio.btnProfesor){
            apaarecerProfesor();
        }
        if(e.getSource()==frmVistaPatio.btnQuico){
            aparecerQuico();
        }
        if(e.getSource()==frmVistaPatio.btnFuente){
            tocarFuente();
        }
    }
    public void cambiarImagenLabel(JLabel Label,String ruta){
        ImageIcon iconoChavo=new ImageIcon(getClass().getResource(ruta));
        Image imagenChavo=iconoChavo.getImage();
        Label.setIcon(new ImageIcon(imagenChavo.getScaledInstance(Label.getWidth(), Label.getHeight(), Image.SCALE_SMOOTH)));
    }
    public void aparecerBarriga(){
      frmVistaPatio.btnInteractuar.setEnabled(true);        
      cambiarImagenLabel(frmVistaPatio.LabelLibre2,"/imagen/SeñorBarriga.png");
       frmVistaPatio.LabelLibre2.setLocation(390,100);
       contador=2;
    }
    public void apaarecerProfesor(){
      frmVistaPatio.btnInteractuar.setEnabled(true);        
      cambiarImagenLabel(frmVistaPatio.LabelLibre2,"/imagen/Profesor.png");
       frmVistaPatio.LabelLibre2.setLocation(-70,180);
       contador=3;
    }
    public void aparecerQuico(){
      frmVistaPatio.btnInteractuar.setEnabled(true);        
      cambiarImagenLabel(frmVistaPatio.LabelLibre2,"/imagen/Quico.png"); 
      frmVistaPatio.LabelLibre2.setLocation(460,180);
      contador=4;
    }
    public void tocarFuente(){
        frmVistaPatio.AreaTexto.setText("");
        frmVistaPatio.AreaTexto.append(" "+"\n"
                  +"Tocaste la fuente de los deseos"+"\n"
                  +"Tira una moneda y pide un deseo");
    }
    
    
}
