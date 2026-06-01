

package main;
import controlador.controladorCesta;
import controlador.controladorVista;
import vista.Interfaz;
import vista.vistaCesta;
public class Main {
    public static void main(String[]args){
        
        vistaCesta cesta=new vistaCesta();
        Interfaz vista=new Interfaz();
        
        controladorCesta controlCesta=new controladorCesta(cesta,vista);
        controladorVista control=new controladorVista(vista,controlCesta);
        vista.setVisible(true);
        cesta.setVisible(true);
    }
}
