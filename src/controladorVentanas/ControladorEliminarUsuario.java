/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorVentanas;

import Vista.AgregarUsuario;
import Vista.EliminarUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.usuario;

/**
 *
 * @author Miguel
 */
public class ControladorEliminarUsuario {
    
    private EliminarUsuario Vista;
    private usuario modelo;
     
    //METODO CONSTRUCTOR
    public ControladorEliminarUsuario(usuario modelo, EliminarUsuario Vista){
        this.modelo = modelo;
        this.Vista = Vista;
        
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
       
        this.Vista.addeliminarUsuarioListener(new CalculateListener());
    }
    
    class CalculateListener implements ActionListener{
         
         String cedula;
         int intCedula;
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("ELIMINAR")){
                cedula = Vista.getCcDigitada();
                intCedula = Integer.parseInt(cedula);
                usuario.coleccion.remove(intCedula);
                System.out.println(usuario.coleccion);
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
