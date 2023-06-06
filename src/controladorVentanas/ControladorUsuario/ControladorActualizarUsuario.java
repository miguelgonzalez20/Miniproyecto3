/*NOMPRE DE PARTICIPANTES :Miguel Gonzales , Ana Mezu ,Vanesa Chavez . 
PROFESOR: Luis Romo.
GRUPO DE FPOE:01.
MINI PROYECTO 3.*/
package controladorVentanas.ControladorUsuario;

import Vista.Usuarios.ActualizarUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JComboBox;
import modelo.usuario;

public class ControladorActualizarUsuario {
    
    //ATRIBUTOS
    private HashMap<String, String> coleccionUsuario;
    private JComboBox<String> listaTipoUsuario;
    private String nombre;
    private String cedula;
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
        

        this.Vista.addebotonFinalizarListener(new CalculateListener());
        
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
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
