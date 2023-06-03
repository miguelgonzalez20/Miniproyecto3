git
package controladorVentanas;

import Vista.ActualizarUsuario;
import static controladorVentanas.ControladorVentanaPrincipal.ventana;
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
        String palabra; //Palabra concatenada para pasar
         String nombre;
         String tipoUsuario;
         String cedula;
         int IntCedula;
        
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("FINALIZAR")){
                nombre = Vista.getTextNuevoNombre();
                tipoUsuario = Vista.obtenerElementoSeleccionado();
                cedula = Vista.getTextCC();
                palabra = nombre + " " + tipoUsuario;
                IntCedula = Integer.parseInt(cedula);
                usuario.coleccion.put(IntCedula, palabra);
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
    
}
