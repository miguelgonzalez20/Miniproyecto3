
package controladorVentanas;

import Vista.ActualizarUsuario;
import Vista.ListaUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.usuario;

public class ControladorActualizarUsuario {
    
    private ActualizarUsuario Vista;
    private usuario modelo;
     
    //METODO CONSTRUCTOR
    public ControladorActualizarUsuario(usuario modelo, ActualizarUsuario Vista){
        this.modelo = modelo;
        this.Vista = Vista;
        
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
       
        this.Vista.addebotonFinalizarListener(new CalculateListener());
    }
    
    class CalculateListener implements ActionListener{
        String nombreMap;
        String tipoDeUsuarioMap;
        
        String cedula;
        int IntCedula;
        String nuevoNombre;
        
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("FINALIZAR")){
                nombre = Vista.nombreUsuario.getText();
                tipoUsuario = Vista.obtenerElementoSeleccionado();
            }   
        }  
    }
    
}
