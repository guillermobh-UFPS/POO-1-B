
package controlador;

import modelo.Cesta;
import modelo.Objeto;
import modelo.Tipo;

import vista.Interfaz;
import vista.vistaCesta;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class controladorCesta implements ActionListener {
    private vistaCesta frmCesta;
    private ArrayList<Objeto> ListaObjeto;
    private Interfaz vistaInterfaz;

    public controladorCesta(vistaCesta frmCesta, Interfaz vistaInterfaz) {
        this.frmCesta = frmCesta;
        this.vistaInterfaz= vistaInterfaz;
        this.ListaObjeto = new ArrayList<>();
        this.frmCesta.btnEliminarObjeto.addActionListener(this);
        this.frmCesta.btnGuardarObjeto.addActionListener(this);
        this.frmCesta.btnMostrarObjetos.addActionListener(this);
        this.frmCesta.btnSiguiente.addActionListener(this);
        this.frmCesta.btnLlevarCesta.addActionListener(this);
        this.frmCesta.CapacidadPeso.setEnabled(false);
        this.frmCesta.Material.setEnabled(false);
        this.frmCesta.Color.setEnabled(false);
        this.frmCesta.Estallena.setEnabled(false);
        this.frmCesta.nombreObjeto.setEnabled(false);
        this.frmCesta.btnMostrarObjetos.setEnabled(false);
        this.frmCesta.btnEliminarObjeto.setEnabled(false);
        this.frmCesta.btnLlevarCesta.setEnabled(false);
        
        for(Tipo e:Tipo.values()){
        this.frmCesta.ComboBoxTipo.addItem(e.toString());
        }
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==frmCesta.btnSiguiente){
            habilitarPanel2();
        }
        
        if(e.getSource()==frmCesta.btnGuardarObjeto){
            guardarListaObjeto();
        }
        
        if(e.getSource()==frmCesta.btnMostrarObjetos){
            mostrarObjeto();
        }
        if(e.getSource()==frmCesta.btnEliminarObjeto){
            eliminarObjeto();
        }
        if(e.getSource()==frmCesta.btnLlevarCesta){
            llevarCesta();
        }
        
    }
    
    public void habilitarPanel2(){
        this.frmCesta.CapacidadPeso.setEnabled(true);
        this.frmCesta.Material.setEnabled(true);
        this.frmCesta.Color.setEnabled(true);
        this.frmCesta.nombreObjeto.setEnabled(true);
        this.frmCesta.btnMostrarObjetos.setEnabled(true);
        this.frmCesta.btnEliminarObjeto.setEnabled(true);
        this.frmCesta.btnLlevarCesta.setEnabled(true);

    }
    public void guardarListaObjeto(){
        String id=this.frmCesta.idObjeto.getText();
        String nombre=this.frmCesta.nombre.getText();
        String tipo=this.frmCesta.ComboBoxTipo.getSelectedItem().toString();
        String peso=this.frmCesta.PesoObjeto.getText();
        
        Tipo tipoObjeto=Tipo.valueOf(tipo);
        Objeto objeto=new Objeto(id,nombre,tipoObjeto,Double.parseDouble(peso));
        ListaObjeto.add(objeto);
    }
    public void mostrarObjeto(){
        frmCesta.TextArea.setText("");
        for(Objeto e:ListaObjeto){
        this.frmCesta.TextArea.append(e.getId()+"\n"
                                     +e.getNombre()+"\n"
                                     +e.getTipo()+"\n"                               
                                     +e.getPeso()+"\n"
                                     +""+"\n"
                                     +"");
        }
    }
    public void eliminarObjeto(){
        String nombreObjeto=this.frmCesta.nombreObjeto.getText();
        for(Objeto e:ListaObjeto){
            if(e.getNombre().equalsIgnoreCase(nombreObjeto)){
                ListaObjeto.remove(e);
                frmCesta.btnLlevarCesta.setEnabled(true);
            }
        }
    }
    
    public void llevarCesta(){
        String capacidadPeso=this.frmCesta.CapacidadPeso.getText();
        double peso=0;
        for(Objeto e: ListaObjeto){
            peso+=e.getPeso();
        }
        if(peso>Double.parseDouble(capacidadPeso)){
            frmCesta.Estallena.setText("no aguanta el peso");
            frmCesta.btnLlevarCesta.setEnabled(false);
            frmCesta.CapacidadPeso.setEnabled(false);
        }
        else if(peso==Double.parseDouble(capacidadPeso)){
            frmCesta.Estallena.setText("Si");
            frmCesta.TextArea.setText("Puedes llevarte la cesta llena");
            frmCesta.btnLlevarCesta.setEnabled(true);

        }
        else if(peso<Double.parseDouble(capacidadPeso)){
            frmCesta.Estallena.setText("No");
            frmCesta.TextArea.setText("Puedes llevarte la cesta");
            frmCesta.btnLlevarCesta.setEnabled(true);
            
            //Actualizar peso de Cesta en el panel principal
        if(vistaInterfaz!=null){
           vistaInterfaz.TextArea1Caperucita.append(" "+"\n"
            +"Capacidad cesta: " + Double.parseDouble(capacidadPeso));} 
        }
            
    }
    public Cesta guardarCesta(){
        String capacidadPeso=frmCesta.CapacidadPeso.getText();
        String material=frmCesta.Material.getText();
        String color=frmCesta.Color.getText();
        String estaLlena=frmCesta.Estallena.getText();
        boolean llenaVacia=true;
        if(estaLlena.equalsIgnoreCase("No")){
            llenaVacia=false;
        }
        double pesodouble=0.0;
        if(capacidadPeso.isEmpty()){
        pesodouble=0.0;}
        else{
        pesodouble+=Double.parseDouble(capacidadPeso);
        }
        Cesta cesta=new Cesta(pesodouble,material,color,ListaObjeto, llenaVacia);
        return cesta;
    }
    
    
    
    
}
