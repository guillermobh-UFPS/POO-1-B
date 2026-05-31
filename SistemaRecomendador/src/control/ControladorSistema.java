/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import modelo.*;
import vista.JFSistemaRecomendador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JComboBox;
import java.util.Random;


public class ControladorSistema implements ActionListener {
    
    private ArrayList<Pelicula> peliculas;
    private JFSistemaRecomendador frmSistemaRecomendador;
    private ArrayList<Usuario> listaUsuarios;
    private Recomendador sistema;

  

    
    
    public ControladorSistema(JFSistemaRecomendador frmSistemaRecomendador, ArrayList<Usuario> listaUsuarios, Recomendador sistema) {
        this.frmSistemaRecomendador = frmSistemaRecomendador;
        this.listaUsuarios = listaUsuarios;
        this.sistema = sistema;
        this.peliculas = new ArrayList<>();

        frmSistemaRecomendador.btnCrearUsuario.addActionListener(this);
        frmSistemaRecomendador.btnEliminarUsuario.addActionListener(this);
        frmSistemaRecomendador.btnBuscar.addActionListener(this);
        frmSistemaRecomendador.cbResultados.addActionListener(this);
        frmSistemaRecomendador.btnYaViste.addActionListener(this);
        frmSistemaRecomendador.btnEnviarOpinion.addActionListener(this);
        frmSistemaRecomendador.btnVerRecomendacion.addActionListener(this);
        
        peliculas.add(new Pelicula("Los Vengadores",Genero.ACCION,2,new ArrayList<>() ,"nose",2010));
        peliculas.add(new Pelicula("Batman El Caballero de la Noche", Genero.ACCION, 2.52,new ArrayList<>(), "Christopher Nolan", 2008));
        peliculas.add(new Pelicula("Mad Max Furia en el Camino", Genero.ACCION, 2.0, new ArrayList<>(),"George Miller", 2015));
        peliculas.add(new Pelicula("John Wick", Genero.ACCION, 1.41, new ArrayList<>(),"Chad Stahelski", 2014));
        peliculas.add(new Pelicula("El Origen", Genero.CIENCIAFICCION, 2.28, new ArrayList<>(),"Christopher Nolan", 2010));
        peliculas.add(new Pelicula("Interestelar", Genero.CIENCIAFICCION, 2.49, new ArrayList<>(),"Christopher Nolan", 2014));
        peliculas.add(new Pelicula("Matrix", Genero.CIENCIAFICCION, 2.16, new ArrayList<>(),"Lana Wachowski", 1999));
        peliculas.add(new Pelicula("Blade Runner 2049", Genero.CIENCIAFICCION, 2.44, new ArrayList<>(),"Denis Villeneuve", 2017));
        peliculas.add(new Pelicula("Forrest Gump", Genero.DRAMA, 2.22, new ArrayList<>(),"Robert Zemeckis", 1994));
        peliculas.add(new Pelicula("El Club de la Pelea", Genero.DRAMA, 2.19, new ArrayList<>(),"David Fincher", 1999));
        peliculas.add(new Pelicula("Parásitos", Genero.DRAMA, 2.12, new ArrayList<>(),"Bong Joon-ho", 2019));
        peliculas.add(new Pelicula("Sueños de Fuga", Genero.DRAMA, 2.22, new ArrayList<>(),"Frank Darabont", 1994));
        peliculas.add(new Pelicula("¿Qué pasó ayer?", Genero.COMEDIA, 1.48, new ArrayList<>(),"Todd Phillips", 2009));
        peliculas.add(new Pelicula("Supercool", Genero.COMEDIA, 1.53, new ArrayList<>(),"Greg Mottola", 2007));
        peliculas.add(new Pelicula("La Máscara", Genero.COMEDIA, 1.41, new ArrayList<>(),"Chuck Russell", 1994));
        peliculas.add(new Pelicula("El Conjuro", Genero.TERROR, 1.52, new ArrayList<>(),"James Wan", 2013));
        peliculas.add(new Pelicula("Hereditary", Genero.TERROR, 2.07, new ArrayList<>(),"Ari Aster", 2018));
        peliculas.add(new Pelicula("Psicosis", Genero.TERROR, 1.49, new ArrayList<>(),"Alfred Hitchcock", 1960));
        peliculas.add(new Pelicula("Perdida", Genero.TERROR, 2.29, new ArrayList<>(),"David Fincher", 2014));
        peliculas.add(new Pelicula("Cuestión de Tiempo", Genero.ROMANCE, 2.03, new ArrayList<>(),"Richard Curtis", 2013));
        peliculas.add(new Pelicula("La La Land", Genero.ROMANCE, 2.08, new ArrayList<>(),"Damien Chazelle", 2016));
        sistema.setPeliculasDisponibles(peliculas);
     }
    
    public void AtualizarLista(){
        frmSistemaRecomendador.txtareaListaUsuarios.setText("");
        //int i = 0; i < listaUsuarios.size(); i++
        for (Usuario i : listaUsuarios) {
            String nombre = i.getNombre();
            frmSistemaRecomendador.txtareaListaUsuarios.append(nombre+"\n");
         } 
        frmSistemaRecomendador.cbCuentas.removeAllItems();
        frmSistemaRecomendador.cbCuentas.addItem("Cuentas");
        for (Usuario u : listaUsuarios) {
         frmSistemaRecomendador.cbCuentas.addItem(u.getNombre());
         }
     }
    
    @Override
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()== frmSistemaRecomendador.btnCrearUsuario){
            String nombre = frmSistemaRecomendador.txtNombre.getText();
            listaUsuarios.add(new Usuario(nombre,new ArrayList<>(),new ArrayList<>()));
            frmSistemaRecomendador.txtareaListaUsuarios.append(nombre+"\n");
            frmSistemaRecomendador.cbCuentas.addItem(nombre);
        }
        
        if(e.getSource()== frmSistemaRecomendador.btnEliminarUsuario){
            String nombre = frmSistemaRecomendador.txtNombre.getText();
            for(int i = 0; i< listaUsuarios.size();i++){
                if (listaUsuarios.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    listaUsuarios.remove(i);
                    break; 
                 }
             }
            AtualizarLista(); 
         }
        
        if(e.getSource()== frmSistemaRecomendador.btnBuscar){
            frmSistemaRecomendador.cbResultados.removeAllItems();
            frmSistemaRecomendador.cbResultados.addItem("Elegir");
            String buscando = frmSistemaRecomendador.txtBuscador.getText().toLowerCase().trim();
            
            ArrayList<Pelicula> resultados = sistema.BuscarPorNombreAutorGenero(buscando, new ArrayList<>());
            
            for(Pelicula o:resultados){
                frmSistemaRecomendador.cbResultados.addItem(o.getTitulo());
            }
        }
        
        if(e.getSource()== frmSistemaRecomendador.cbResultados){
            frmSistemaRecomendador.btnYaViste.setEnabled(true);
            frmSistemaRecomendador.taOpinion.setEnabled(false);
            frmSistemaRecomendador.btnEnviarOpinion.setEnabled(false);
            String opcionResultados = (String)frmSistemaRecomendador.cbResultados.getSelectedItem();
            if(opcionResultados != null){
                for(Pelicula i: peliculas){
                if(i.getTitulo().equals(opcionResultados)){
                    frmSistemaRecomendador.lblTituloResultado.setText("Titulo: "+ i.getTitulo());
                    frmSistemaRecomendador.lblDirectorResultado.setText("Director: "+ i.getDirector());
                    frmSistemaRecomendador.lblGeneroResultado.setText("Genero: "+ i.getGenero());
                    frmSistemaRecomendador.lblAnioResultado.setText("Año: "+ i.getAnio());
                    if(i.getCalificacion().isEmpty()){
                        frmSistemaRecomendador.taCalificacionesResultado.setText("");
                        frmSistemaRecomendador.taCalificacionesResultado.setText("Aun no hay calificaciones, se el Primero.");
                     }else{
                        frmSistemaRecomendador.taCalificacionesResultado.setText("");
                        for(Calificacion u: i.getCalificacion()){
                            
                            frmSistemaRecomendador.taCalificacionesResultado.append("Usuario:"+u.getUsuario().getNombre()+"\nComentario:"+u.getComentario()+"\n");
                        }
                    }
                 }
             }  
             }else{
                    frmSistemaRecomendador.lblTituloResultado.setText("Titulo: ");
                    frmSistemaRecomendador.lblDirectorResultado.setText("Director: ");
                    frmSistemaRecomendador.lblGeneroResultado.setText("Genero: ");
                    frmSistemaRecomendador.lblAnioResultado.setText("Año: ");
                    frmSistemaRecomendador.taCalificacionesResultado.setText("");
                }
         }
        
        if(e.getSource()== frmSistemaRecomendador.btnYaViste){
            frmSistemaRecomendador.btnYaViste.setEnabled(false);
            frmSistemaRecomendador.taOpinion.setEnabled(true);
            frmSistemaRecomendador.btnEnviarOpinion.setEnabled(true);
            
        }
        
        if(e.getSource()== frmSistemaRecomendador.btnYaViste){
            String usuario = (String)frmSistemaRecomendador.cbCuentas.getSelectedItem() ;
            for(Usuario i:listaUsuarios){
                if(i.getNombre().equals(usuario)){
                    String peli = (String)frmSistemaRecomendador.cbResultados.getSelectedItem();
                    for(Pelicula o: sistema.getPeliculasDisponibles()){
                        if(o.getTitulo().equalsIgnoreCase(peli)||o.getDirector().equalsIgnoreCase(peli)||o.getGenero().name().equalsIgnoreCase(peli)){
                            i.AddHistorial(o);
                        }
                    }
                    
                }
            }
            
         }
        
        if(e.getSource()== frmSistemaRecomendador.btnEnviarOpinion){
            String peli = (String)frmSistemaRecomendador.cbResultados.getSelectedItem();
            for(Pelicula o: sistema.getPeliculasDisponibles()){
                if(o.getTitulo().equals(peli)){
                    String usuario = (String)frmSistemaRecomendador.cbCuentas.getSelectedItem();
                    for(Usuario i: listaUsuarios){
                        String comentario = (String)frmSistemaRecomendador.taOpinion.getText();
                        Calificacion proceso = new Calificacion(i,0,comentario);
                        o.addCalificacion(proceso);
                    }
                }
            }
        }
        
        if(e.getSource()== frmSistemaRecomendador.btnVerRecomendacion){
           String usuario =  (String)frmSistemaRecomendador.cbCuentas.getSelectedItem();
           for(Usuario i:listaUsuarios){
               if(i.getNombre().equals(usuario)){
                   Random r = new Random();
                   int indiceAleatorio = r.nextInt(i.getHistorial().size());
                   Pelicula recomendarMas = i.getHistorial().get(indiceAleatorio);
                   frmSistemaRecomendador.taRecomendaciones.setText("");
                   for(Pelicula o:peliculas){
                       if(recomendarMas.getGenero().equals(o.getGenero())){
                           frmSistemaRecomendador.taRecomendaciones.append(o.getTitulo()+"\n");
                           
                       }
                   }
                   
               }
           }
         }
        
     }
 }
