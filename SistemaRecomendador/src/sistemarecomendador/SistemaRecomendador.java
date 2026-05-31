/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemarecomendador;

import vista.*;
import control.*;
import java.util.ArrayList;
import modelo.*;


public class SistemaRecomendador {

    
    public static void main(String[] args) {
        
        Recomendador recomendador = new Recomendador();
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        JFSistemaRecomendador frmSistemaRecomendador = new JFSistemaRecomendador();
        control.ControladorSistema controlador = new ControladorSistema(frmSistemaRecomendador,listaUsuarios,recomendador);
        frmSistemaRecomendador.setVisible(true);
        
        
       
    }
    
}
