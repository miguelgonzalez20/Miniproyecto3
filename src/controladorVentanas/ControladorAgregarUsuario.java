
package controladorVentanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

import Vista.AgregarUsuario;
import java.util.HashMap;
import java.util.Map;
import modelo.usuario;


public class ControladorAgregarUsuario{
    
    //public static AgregarUsuario ventana = new AgregarUsuario();
    
    String nombre;
    private AgregarUsuario Vista;
    private usuario modelo;
     
    //METODO CONSTRUCTOR
    public ControladorAgregarUsuario(usuario modelo, AgregarUsuario Vista){
        this.modelo = modelo;
        this.Vista = Vista;
        
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
       
        this.Vista.addBotonAceptarListener(new CalculateListener());
    }
    
    class CalculateListener implements ActionListener{
         String palabra;
         String nombre;
         String tipoUsuario;
         String cedula;
         
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("ACEPTAR")){
                nombre = Vista.nombreUsuario.getText();
                tipoUsuario = Vista.obtenerElementoSeleccionado();
                palabra = nombre + " " + tipoUsuario;
                
                cedula = Vista.cc.getText();
                
                System.out.println(palabra);
                
                modelo.coleccion.put(1,palabra);
                System.out.println("LE DI A ACEPTAR");
            }   
        }  
    }

 
    
    /*public static void mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        ventana.setVisible(false);
    }*/

    public void actionPerformed(ActionEvent e) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
