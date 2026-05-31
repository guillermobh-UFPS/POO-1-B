/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author memoy
 */
public class WonderWoman extends Personaje{

    public WonderWoman() {
    }
    
    
    

    public WonderWoman(String nombre, String origen, List<Habilidad> habilidad, List<ObjetoMagico> objetoMagico) {
        super(nombre, origen, habilidad, objetoMagico);
    }
    
    @Override
    public void combatir(Personaje enemigo) {
        System.out.println("Iniciando combate contra: " + enemigo.getNombre());
    }

    @Override
    public String interactuar(Personaje otroPersonaje) {
        return "Hola " + otroPersonaje.getNombre() + ", soy Wonder Woman.";
    }

    @Override
    public void utilizarObjeto(ObjetoMagico objeto) {
        System.out.println("Has utilizado el objeto: " + objeto.getNombre());
    }

    @Override
    public void interactuarEscenario(Escenario escenarioActual) {
        System.out.println("Explorando el escenario: " + escenarioActual.getNombre());
    }

    @Override
    public void utilizarHabilidad(Habilidad habilidadAUsar) {
        System.out.println("¡Wonder Woman ha activado " + habilidadAUsar.getNombre() + "!");
    }
    
    
}
