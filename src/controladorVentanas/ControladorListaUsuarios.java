/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorVentanas;

import Vista.EliminarUsuario;
import Vista.ListaUsuarios;
import static controladorVentanas.ControladorVentanaPrincipal.ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextField;
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
                StringBuilder stringBuilder = new StringBuilder();
                
                for (Integer key : usuario.coleccion.keySet()) {
                    stringBuilder.append(key).append(": ").append(usuario.coleccion.get(key)).append("\n"); 
                }
                String elements = stringBuilder.toString();
                Vista.setTxtUsuarios(elements);
            }   
        }  
    }

    public static String hashMapToString(HashMap<?, ?> hashMap) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<?, ?> entry : hashMap.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append(", ");
        }

        // Eliminar la última coma y espacio
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }

        return sb.toString();
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
