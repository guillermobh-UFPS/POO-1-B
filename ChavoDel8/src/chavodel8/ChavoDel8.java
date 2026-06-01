/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chavodel8;
import vista.*;
import controlador.*;
public class ChavoDel8 {

    public static void main(String[] args) {
     
     vistaJuego vista=new vistaJuego();
     vista.setVisible(true);
     
     vistaPatio2 patio2=new vistaPatio2();
     
     controladorJuego controlJuego=new controladorJuego(vista,patio2);
     controladorPatio2 controlPatio2=new controladorPatio2(patio2);
     
     
     
    
        
    }
}
