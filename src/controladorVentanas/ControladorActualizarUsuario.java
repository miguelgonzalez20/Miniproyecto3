
package controladorVentanas;

import Vista.ActualizarUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JComboBox;
import modelo.usuario;

public class ControladorActualizarUsuario {
    
    //ATRIBUTOS
    private HashMap<String, String> coleccionUsuario;
    private String nombre;
    private String cedula;
    private JComboBox<String> listaTipoUsuario;
    private static ActualizarUsuario Vista;
    private usuario modelo;
     
    //METODO CONSTRUCTOR
    public ControladorActualizarUsuario(usuario modelo, ActualizarUsuario Vista){
        this.modelo = modelo;
        this.Vista = Vista;
        this.coleccionUsuario = (HashMap<String, String>) usuario.getColeccionUsuario();
        this.listaTipoUsuario = this.Vista.getListaTipoUsuario();
        this.nombre = this.Vista.getTextNuevoNombre();
        this.cedula = this.Vista.getTextCC();
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
        this.Vista.addebotonFinalizarListener(new CalculateListener());
    }

    
    class CalculateListener implements ActionListener{
        String palabra; //Palabra concatenada para pasar
         String nombre;
         String tipoUsuario;
         String cedula;
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("FINALIZAR")){
                nombre = Vista.getTextNuevoNombre();
                tipoUsuario = Vista.obtenerElementoSeleccionado();
                cedula = Vista.getTextCC();
                palabra = nombre + " " + tipoUsuario;
                coleccionUsuario.put(cedula, palabra);
            }   
        }
        
    
    }
    
    public static void mostrar(){
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        Vista.setVisible(false);
        Vista.dispose();
    }
    
}
