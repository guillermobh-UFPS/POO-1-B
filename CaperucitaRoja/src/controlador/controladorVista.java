

package controlador;
import java.awt.Image;
import java.awt.Point;
import modelo.Abuela;
import modelo.Arbol;
import modelo.Bosque;
import modelo.Caperucita;
import modelo.Cesta;
import modelo.Escenario;
import modelo.Estado;
import modelo.Lenador;
import modelo.Lobo;
import modelo.Objeto;
import modelo.Personaje;
import modelo.Tipo;

import controlador.controladorCesta;
import vista.Interfaz;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class controladorVista implements ActionListener  {
    private Interfaz frmInterfaz;
    private controladorCesta controlCesta;
    private int contador=1;
    public controladorVista(Interfaz frmInterfaz,controladorCesta controlCesta) {
        this.frmInterfaz = frmInterfaz;
        this.controlCesta = controlCesta;
        this.frmInterfaz.btnEvento.addActionListener(this);
        this.frmInterfaz.btnReiniciar.addActionListener(this);
        
        
        this.frmInterfaz.TextArea1Caperucita.append(txtAreaCaper());
        this.frmInterfaz.TextAreaLobo.append(txtAreaLobo());
        this.frmInterfaz.TextAreaLeñador.append(txtAreaLeñador());
        this.frmInterfaz.TextAreaAbuelita.append(txtAreaAbue());
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==frmInterfaz.btnEvento){
            siguienteEvento();
        }
        if(e.getSource()==frmInterfaz.btnReiniciar){
            reiniciar();
        }
 
    }
    public Caperucita crearCaperucita(){
        Caperucita caper=new Caperucita(controlCesta.guardarCesta(),"1091973761", "Caperucita", Estado.NORMAL, "ser una inocente niña");
        return caper;
    }
    public Lobo crearLobo(){
        Lobo lobo=new Lobo(false, "1091973762", "Lobo",Estado.NORMAL, "Comer mujeres");
        return lobo;
    }
    public Lenador crearLeñador(){
        Objeto objeto=new Objeto("1222", "Hacha",Tipo.HERRAMIENTA, 34.0);
        Lenador leñador=new Lenador(objeto,"1091973763", "Leñador", Estado.NORMAL, "Salvar damicelas");
        return leñador;
    }
    public Abuela crearAbuelita(){
        Abuela abue=new Abuela(98, "En deterioro", "1091973765", "Abuela", Estado.NORMAL,"Ser Victima");
        return abue;
        
    }   
    
    public void siguienteEvento(){
        if(contador==1){
        frmInterfaz.TextArea1.append(" "+"\n"
+"""
=========================================
              HISTORIA
=========================================

En un bosque muy lejano vivía una jovencita
llamada Caperucita. La mamá de esta niña
le ocurrió mandar a Caperucita al bosque
para visitar a su abuela.

=========================================
""");
frmInterfaz.TextArea1.append("Mientras Caperucita caminaba se sentía aburrida."+"\n"
+"¿Que crees que hará sentir alegre a Caperucita?"+"\n"
+"a) Cantar"+"\n"
+"b) Bailar"+"\n"
+"c) Mirar_Facebook");
}
        
        
String caper=frmInterfaz.ComboCaperucita.getSelectedItem().toString();
    if(contador==2){
        if(caper.equals("Cantar")){
        frmInterfaz.TextArea1.append("\n"
                                    +"BIEN "+crearCaperucita().cantar());}
        else if(caper.equals("Bailar")){
        frmInterfaz.TextArea1.append("\n"
                                    +"MAL, Caperucita no sabe Bailar");
        contador=1;}
        else if(caper.equals("Mirar_Facebook")){
        frmInterfaz.TextArea1.append("\n"
                                    +"MAL, ni siquiera tiene celular");
        contador=1;}}

    
 if(contador==3){        
        frmInterfaz.jLabel3Caper.setLocation(110, 420);
        frmInterfaz.TextArea1.append(" "+"\n"
+"""
=========================================
              HISTORIA
=========================================

Mientras Caperucita caminaba por el
bosque, se encontró con un lobo alto
y de color negro. Y este le pregunto:
-¿Que haces tan sola aquí... en el bosque?.
Caperucita respondió-Puessss, voy de
camino a visitar a mi abuelita.

=========================================
""");
frmInterfaz.TextArea1.append("El lobo pensando en matar dos pajaros de un tiro"+"\n"
+"inmediatamente se puso a:"+"\n"
+"a) Correr"+"\n"
+"b) Tragar_Caperucita"+"\n"
+"c) Disfrazarse"+"\n"
+"d) Tragar_Abuelita");
 }
 
 
String lobo=frmInterfaz.ComboLobo.getSelectedItem().toString();
        if(contador==4){
            if(lobo.equals("Correr")){
             frmInterfaz.TextArea1.append("\n"
                                            +"BIEN "+crearLobo().correr());
             frmInterfaz.Label4Lobo.setLocation(180, 30);}
            if(lobo.equals("Tragar_Caperucita")){
             frmInterfaz.TextArea1.append("\n"
                                            +"MAL "+crearLobo().tragarCaperuza());
            contador=3;}
            if(lobo.equals("Disfrazarse")){
             frmInterfaz.TextArea1.append("\n"
                                            +"MAL "+crearLobo().disfrazarse());
            contador=3;}
            if(lobo.equals("Tragar_Abuelita")){
             frmInterfaz.TextArea1.append("\n"
                                            +"MAL "+crearLobo().tragarAbuela());
            contador=3;}}
        
        
if(contador==5){
frmInterfaz.TextArea1.append(" "+"\n"
+"""
=========================================
              HISTORIA
=========================================

El carnívoro solo pensaba en dos cosas;
comer a la abuela, y de paso esperar hasta
que la niña llegue a la casa para devorarla.
Cuando el lobo llegó a la casa, persuadió
a la viejita, para que lo dejara pasar,
y la viejita toda inocente cae en su trampa.

=========================================
""");
frmInterfaz.TextArea1.append("La abuelita después de caer en su trampa empieza a:"+"\n"
+"a) Gritar"+"\n"
+"b) Ofrecer_cafe"+"\n"
+"c) Estudiar_POO"+"\n"
+"d) Cambiarse_ropa");
}


String abue=frmInterfaz.ComboAbuela.getSelectedItem().toString();
    if(contador==6){
        if(abue.equals("Gritar")){
        frmInterfaz.TextArea1.append("\n"
                                         +"BIEN "+crearAbuelita().gritar());
 frmInterfaz.jLabel2Abuelita.setVisible(false);
 frmInterfaz.Label4Lobo.setLocation(120,20);
 frmInterfaz.TextAreaAbuelita.setText("");
 frmInterfaz.TextAreaAbuelita.append("Id: "+crearAbuelita().getId()+"\n"
 +"Nombre: "+crearAbuelita().getNombre()+"\n"
 +"Rol: "+crearAbuelita().getRol()+"\n"
 +"Estado: "+crearAbuelita().getEstado().COMIDO+"\n"
 +"Estado Salud: "+crearAbuelita().getEstadoSalud()+"\n"
 +"Edad: "+crearAbuelita().getEdad());}
        if(abue.equals("Ofrecer_cafe")){
        frmInterfaz.TextArea1.append("\n"
                                         +"MAL, a abuelita se le acabo el tinto");
        contador=5;}
        if(abue.equals("Estudiar_POO")){
        frmInterfaz.TextArea1.append("\n"
                                         +"MAL, la abuelita no puede estudiar POO,"+"\n"
                +"pero Santiago sí");
        contador=5;}
        if(abue.equals("Cambiarse_ropa")){
        frmInterfaz.TextArea1.append("\n"
                                         +"MAL, el lobo esta mirando");
        contador=5;}}
 
     
if(contador==7){
frmInterfaz.jLabel3Caper.setLocation(380,190);

frmInterfaz.TextArea1.append(" "+"\n"
+"""
=========================================
              HISTORIA
=========================================

Después de que la abuela fuera tragada por
el lobo, Caperucita  se  encuentra con  un
Leñador alto y acuerpado, llamado Santiago.
Enseguida Caperucita lo saludó y le contó
el motivo de su viaje. El leñador como buen
ser humano,le advirtió sobre el peligroso
Lobo que se come  mujeres, ocasionando que
la niña se preocupara.

=========================================
""");
frmInterfaz.TextArea1.append("Como Caperucita estaba muy preocupada, el leñador la:"+"\n"
+"a) Salvar"+"\n"
+"b) Regalar_dulce"+"\n"
+"c) Rellenar_Panza"+"\n"
+"d) Abrir_Panza");
}


String lenador=frmInterfaz.ComboLeñador.getSelectedItem().toString();
        if(contador==8){
            if(lenador.equals("Regalar_dulce")){
                frmInterfaz.TextArea1.append("\n"
                                            +"BIEN, eso logra tranquilizar a Caperucita");}
            if(lenador.equals("Salvar")){
                frmInterfaz.TextArea1.append("\n"
                                            +"MAL "+crearLeñador().salvar());
                contador=7;}
            if(lenador.equals("Rellenar_Panza")){
                frmInterfaz.TextArea1.append("\n"
                                            +"MAL "+crearLeñador().rellenarPanza());
                contador=7;}
            if(lenador.equals("Abrir_Panza")){
                frmInterfaz.TextArea1.append("\n"
                                            +"MAL "+crearLeñador().abrirPanza());
                contador=7;}} 
        
        
   
if(contador==9){
frmInterfaz.jLabel3Caper.setLocation(170, 30);

frmInterfaz.TextArea1.append(" "+"\n"
+"""
=========================================
              HISTORIA
=========================================

Caperucita siguió con su travesía mientras
pensaba en su abuela y en ese lobo mentiroso,
hasta que por fin llegó a la casa de su anciana.
Notó que la puerta estaba abierta y como ella tenía
buenos modales, anunció a gritos de su llegada.
Pero sin darse cuenta, pensó que el lobo feroz era
su abuelita y por ende la trato como si en verdad se
tratara de ella."

=========================================
""");
frmInterfaz.TextArea1.append("¿Que crees que hizo el lobo cuando se dió"+"\n"
+"cuenta que habia llegado caperucita?"+"\n"
+"a) Correr"+"\n"
+"b) Tragar_Caperucita"+"\n"
+"c) Disfrazarse"+"\n"
+"d) Tragar_Abuelita");
}


         if(contador==10){
             if(lobo.equals("Disfrazarse")){
                 frmInterfaz.TextArea1.append("\n"
                                             +"BIEN "+crearLobo().disfrazarse());
             ImageIcon iconoLoboAbuela=new ImageIcon(getClass().getResource("/imagen/Lobo abuelita.png"));
             Image imagenLoboAbuelita=iconoLoboAbuela.getImage();
             frmInterfaz.Label4Lobo.setIcon(new ImageIcon(imagenLoboAbuelita.getScaledInstance(frmInterfaz.Label4Lobo.getWidth(), frmInterfaz.Label4Lobo.getHeight(), Image.SCALE_SMOOTH)));
 frmInterfaz.TextAreaLobo.setText("");
 frmInterfaz.TextAreaLobo.append("Id: "+crearLobo().getId()+"\n"
 +"Nombre: "+crearLobo().getNombre()+"\n"
 +"Rol: "+crearLobo().getRol()+"\n"
 +"Estado: "+crearLobo().getEstado().NORMAL+"\n"
 +"¿Tiene disfraz?: "+"true");}      
             if(lobo.equals("Correr")){
                 frmInterfaz.TextArea1.append("\n"
                                             +"MAL "+crearLobo().correr());
                 contador=9;}
             if(lobo.equals("Tragar_Caperucita")){
                 frmInterfaz.TextArea1.append("\n"
                                             +"MAL "+crearLobo().tragarCaperuza());
                 contador=9;}
             if(lobo.equals("Tragar_Abuelita")){
                 frmInterfaz.TextArea1.append("\n"
                                             +"MAL "+crearLobo().tragarAbuela());
                 contador=9;}}
         
         
if(contador==11){
frmInterfaz.TextArea1.append(" "+"\n"
+"""
=========================================
              HISTORIA
=========================================

Mientras Caperucita acompañaba a su supuesta abuela
se percató de muchas particularidades que no entendía,
las orejas, eran muy grandes, la nariz, muy puntiaguda,
los dedos de sus manos tenían uñas muy largas, y entre otras
cosas. Como Caperucita es muy inteligente, preguntó por la razón
de cada componente de su aspecto. El lobo aburrido de tanta
preguntadera.

=========================================
""");
frmInterfaz.TextArea1.append("¿Como crees que respondió el lobo a toda esa"+"\n"
+"preguntadera de Caperucita?"+"\n"
+"a) Correr"+"\n"
+"b) Tragar_Caperucita"+"\n"
+"c) Disfrazarse"+"\n"
+"d) Tragar_Abuelita");
}


        if(contador==12){
            if(lobo.equals("Disfrazarse")){
                 frmInterfaz.TextArea1.append("\n"
                                             +"MAL "+crearLobo().disfrazarse());
                 contador=11;}
             if(lobo.equals("Correr")){
                 frmInterfaz.TextArea1.append("\n"
                                             +"MAL "+crearLobo().correr());
                 contador=11;}
             if(lobo.equals("Tragar_Caperucita")){
                 frmInterfaz.TextArea1.append("\n"
                                             +"BIEN "+crearLobo().tragarCaperuza());
frmInterfaz.jLabel3Caper.setVisible(false);
ImageIcon iconoLoboGordo=new ImageIcon(getClass().getResource("/imagen/Lobo Gordo.png"));
Image imagenLoboGordo=iconoLoboGordo.getImage();
frmInterfaz.Label4Lobo.setIcon(new ImageIcon(imagenLoboGordo.getScaledInstance(frmInterfaz.Label4Lobo.getWidth(), frmInterfaz.Label4Lobo.getHeight(), Image.SCALE_SMOOTH)));
frmInterfaz.TextArea1Caperucita.setText(" ");
frmInterfaz.TextArea1Caperucita.append("Id: "+crearCaperucita().getId()+"\n"
 +"Nombre: "+crearCaperucita().getNombre()+"\n"
 +"Rol: "+crearCaperucita().getRol()+"\n"
 +"Estado: "+crearCaperucita().getEstado().COMIDO);}
             if(lobo.equals("Tragar_Abuelita")){
                 frmInterfaz.TextArea1.append("\n"
                                             +"MAL "+crearLobo().tragarAbuela());
                 contador=11;}}
        
        
if(contador==13){
frmInterfaz.Label5Leñador.setLocation(190, 19);
frmInterfaz.TextArea1.append(" "+"\n"
+"""
=========================================
              HISTORIA
=========================================

Afortunadamente, Santiago, el musculoso Leñador, pasó cerca
de la casa de la abuelita, y como tenía hambre decidió tocar
y preguntar. Pero algó no cuadraba para bien, así que Santiago,
haciendo uso de su instinto, entró con mucha valentía y reconoció
al lobo absurdamente grande, acostado en una cama. El leñador
dedujo que Caperucita y la abuela estaban dentro del estomago del
animal.

=========================================
""");
frmInterfaz.TextArea1.append("¿Qué crees que hizo el leñador para salvar a Caperucita y la Abuela?:"+"\n"
+"a) Salvar"+"\n"
+"b) Regalar_dulce"+"\n"
+"c) Rellenar_Panza"+"\n"
+"d) Abrir_Panza");
}


    if(contador==14){
        if(lenador.equals("Abrir_Panza")){
            frmInterfaz.TextArea1.append("\n"
                                        +"BIEN, "+crearLeñador().abrirPanza());
            frmInterfaz.Label4Lobo.setVisible(false);
frmInterfaz.TextArea1Caperucita.setText("");
frmInterfaz.TextAreaAbuelita.setText("");
frmInterfaz.TextAreaLobo.setText("");
frmInterfaz.TextAreaLobo.append("Id: "+crearLobo().getId()+"\n"
 +"Nombre: "+crearLobo().getNombre()+"\n"
 +"Rol: "+crearLobo().getRol()+"\n"
 +"Estado: "+crearLobo().getEstado().MUERTO+"\n"
 +"¿Tiene disfraz?: "+"true");
frmInterfaz.TextAreaAbuelita.append("Id: "+crearAbuelita().getId()+"\n"
 +"Nombre: "+crearAbuelita().getNombre()+"\n"
 +"Rol: "+crearAbuelita().getRol()+"\n"
 +"Estado: "+crearAbuelita().getEstado().RESCATADO+"\n"
 +"Estado Salud: "+crearAbuelita().getEstadoSalud()+"\n"
 +"Edad: "+crearAbuelita().getEdad());
frmInterfaz.TextArea1Caperucita.append("Id: "+crearCaperucita().getId()+"\n"
 +"Nombre: "+crearCaperucita().getNombre()+"\n"
 +"Rol: "+crearCaperucita().getRol()+"\n"
 +"Estado: "+crearCaperucita().getEstado().RESCATADO);}
        if(lenador.equals("Salvar")){
            frmInterfaz.TextArea1.append("\n"
                                        +"MAL, "+crearLeñador().salvar());
            contador=13;}
        if(lenador.equals("Regalar_dulce")){
            frmInterfaz.TextArea1.append("\n"
                                        +"MAL, ¿Como va a regalar dulces a la niña?");
            contador=13;}
        if(lenador.equals("Rellenar_Panza")){
            frmInterfaz.TextArea1.append("\n"
                                        +"MAL, "+crearLeñador().rellenarPanza());
            contador=13;}}
 
    
if(contador==15){
frmInterfaz.jLabel2Abuelita.setVisible(true);
frmInterfaz.jLabel3Caper.setVisible(true);
frmInterfaz.Label5Leñador.setLocation(260, 19);       
frmInterfaz.TextArea1.append(" "+"\n"
+"""
=========================================
              HISTORIA
=========================================

Con el lobo muerto y la abuelita y caperucita sanas y salvas,
el leñador se ganó la satisfacción de poder haber ayudado a
a alguien, y procede a enterrar al lobo junto con sus pertenencias,
con el fin de ocultar la verdad sobre aquella escena desgarradora
en medio del bosque.
Y sin nada más que añadir, Caperucita, la abuela y leñador vivieron
felices por siempre. 

=========================================
""");}
contador+=1;
    }
    
    public void reiniciar(){
        frmInterfaz.TextArea1.setText("");
        contador=0;
        
        //cambiamos la imagen del lobo
        frmInterfaz.jLabel2Abuelita.setVisible(true);
        frmInterfaz.jLabel3Caper.setVisible(true);
        frmInterfaz.Label4Lobo.setVisible(true);
        ImageIcon iconoLobo=new ImageIcon(getClass().getResource("/imagen/Lobo.png"));
        Image imagen=iconoLobo.getImage().getScaledInstance(frmInterfaz.Label4Lobo.getWidth(), frmInterfaz.Label4Lobo.getHeight(), Image.SCALE_SMOOTH);
        frmInterfaz.Label4Lobo.setIcon(new ImageIcon(imagen));
        
        frmInterfaz.Label4Lobo.setLocation(31,418);
        frmInterfaz.jLabel3Caper.setLocation(458,420);
        frmInterfaz.Label5Leñador.setLocation(440,190);
    }
   
 public String txtAreaCaper(){
 String txtCaper=("Id: "+crearCaperucita().getId()+"\n"
 +"Nombre: "+crearCaperucita().getNombre()+"\n"
 +"Rol: "+crearCaperucita().getRol()+"\n"
 +"Estado: "+crearCaperucita().getEstado().NORMAL);
 return txtCaper;
 }
 public String txtAreaLobo(){
 String txtLobo=("Id: "+crearLobo().getId()+"\n"
 +"Nombre: "+crearLobo().getNombre()+"\n"
 +"Rol: "+crearLobo().getRol()+"\n"
 +"Estado: "+crearLobo().getEstado().NORMAL+"\n"
 +"¿Tiene disfraz?: "+crearLobo().isTieneDisfraz());
         
 return txtLobo;
 }
 public String txtAreaLeñador(){
 String txtLeñador=("Id: "+crearLeñador().getId()+"\n"
 +"Nombre: "+crearLeñador().getNombre()+"\n"
 +"Rol: "+crearLeñador().getRol()+"\n"
 +"Estado: "+crearLeñador().getEstado().NORMAL+"\n"
 +"Objeto: "+crearLeñador().getHacha().getNombre());
 return txtLeñador;
 }
 public String txtAreaAbue(){
 String txtAbuelita=("Id: "+crearAbuelita().getId()+"\n"
 +"Nombre: "+crearAbuelita().getNombre()+"\n"
 +"Rol: "+crearAbuelita().getRol()+"\n"
 +"Estado: "+crearAbuelita().getEstado().NORMAL+"\n"
 +"Estado Salud: "+crearAbuelita().getEstadoSalud()+"\n"
 +"Edad: "+crearAbuelita().getEdad());
 return txtAbuelita;
 }
 
 
 
    
}