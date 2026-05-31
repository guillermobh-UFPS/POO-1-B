/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Personaje {
    
    protected String nombre;
    protected String origen;
    protected List<Habilidad> habilidad;  
    protected List<ObjetoMagico> objetoMagico;

    public Personaje() {
    }

    public Personaje(String nombre, String origen, List<Habilidad> habilidad, List<ObjetoMagico> objetoMagico) {
        this.nombre = nombre;
        this.origen = origen;
        // 1. SIGNIFICADO EN UML: COMPOSICIÓN (Rombo negro)
        // Significa: "Yo controlo su vida". Por eso creas una lista NUEVA interna.
        this.habilidad = new ArrayList<>(habilidad);
        
        // 2. SIGNIFICADO EN UML: ASOCIACIÓN (Línea normal "Utiliza")
        // Significa: "Solo los uso, no me pertenecen". Por eso la asignas DIRECTA.
        // La lista de los objetos magicos se crea por fuera porque no depende de esta clase para existir,si se
        //elimina un personaje no se elimina la lista de los objetos magicos pero si la lista de habilidades.
        this.objetoMagico = objetoMagico;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public List<Habilidad> getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(List<Habilidad> habilidad) {
        this.habilidad = habilidad;
    }

    public List<ObjetoMagico> getObjetoMagico() {
        return objetoMagico;
    }

    public void setObjetoMagico(List<ObjetoMagico> objetoMagico) {
        this.objetoMagico = objetoMagico;
    }
    
    public abstract void combatir(Personaje enemigo);

    public abstract String interactuar(Personaje otroPersonaje);

    public abstract void utilizarObjeto(ObjetoMagico objeto);

    public abstract void interactuarEscenario(Escenario escenarioActual);

    public abstract void utilizarHabilidad(Habilidad habilidadAUsar);
    
    

    
    
}
