/*NOMPRE DE PARTICIPANTES :Miguel Gonzales , Ana Mezu ,Vanesa Chavez . 
PROFESOR: Luis Romo.
GRUPO DE FPOE:01.
MINI PROYECTO 3.*/
package controladorVentanas.ControladorUsuario;

import Vista.Usuarios.EliminarUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.usuario;


public class ControladorEliminarUsuario {
    
    //ATRIBUTOS
    private HashMap<String, String> coleccionEliminarusuario;
    private JTextField ccDigitada;
    private static EliminarUsuario Vista;
    private usuario modelo;
     
    //METODO CONSTRUCTOR
    public ControladorEliminarUsuario(usuario modelo, EliminarUsuario Vista){
        
        this.modelo = modelo;
        this.Vista = Vista;
        this.coleccionEliminarusuario = (HashMap<String, String>) usuario.getColeccionUsuario();
        this.ccDigitada = this.Vista.getCcDigitada();

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
                JOptionPane.showMessageDialog(null, "El usuario ha sido eliminado, da click en el botón  FINALIZAR para volver a menú principal.");
                cedula = ccDigitada.getText();
                coleccionEliminarusuario.remove(cedula);
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
