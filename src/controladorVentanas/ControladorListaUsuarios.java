/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorVentanas;

import Vista.EliminarUsuario;
import Vista.ListaUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.usuario;

/**
 *
 * @author Miguel
 */
public class ControladorListaUsuarios {
    
    private ListaUsuarios Vista;
    private usuario modelo;
     
    //METODO CONSTRUCTOR
    public ControladorListaUsuarios(usuario modelo, ListaUsuarios Vista){
        this.modelo = modelo;
        this.Vista = Vista;
        
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
       
        this.Vista.addebotonVisualizarListener(new CalculateListener());
    }
    
    class CalculateListener implements ActionListener{
         
        String usuarios;
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("VISUALIZAR")){
                
                usuarios = modelo.hashMapToString(modelo.coleccion);
                
                Vista.setTxtUsuarios(modelo.coleccionToString());
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
