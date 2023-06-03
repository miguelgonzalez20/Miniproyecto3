/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorVentanas;

import Vista.AgregarUsuario;
import Vista.EliminarUsuario;
import static controladorVentanas.ControladorVentanaPrincipal.ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JTextField;
import modelo.usuario;


public class ControladorEliminarUsuario {
    
    private EliminarUsuario Vista;
    private usuario modelo;
    private JTextField ccDigitada;
    private HashMap<String, String> coleccionEliminarusuario;
     
    //METODO CONSTRUCTOR
    public ControladorEliminarUsuario(usuario modelo, EliminarUsuario Vista){
        this.modelo = modelo;
        this.Vista = Vista;

        this.ccDigitada = this.Vista.getCcDigitada();
        
        this.coleccionEliminarusuario = (HashMap<String, String>) usuario.getColeccionUsuario();
        this.Vista.addeliminarUsuarioListener(new CalculateListener());

        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
    }

    
    
    class CalculateListener implements ActionListener{
         
         String cedula;
         int intCedula;
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("ELIMINAR")){
                cedula = ccDigitada.getText();
                coleccionEliminarusuario.remove(cedula);
                
            }   
        }  
    }

 
    
    public static void mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        ventana.setVisible(false);
        ventana.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
