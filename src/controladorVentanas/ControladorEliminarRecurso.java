
package controladorVentanas;

import Vista.EliminarRecurso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JTextField;
import modelo.recurso;

public class ControladorEliminarRecurso {
    //ATRIBUTOS
    private HashMap<String, String> coleccionRecursos;
    private JTextField nombreRecurso;
    private static EliminarRecurso Vista;
    private recurso modelo;
    
    //METODO CONSTRUCTOR
    public ControladorEliminarRecurso(recurso modelo, EliminarRecurso Vista){

        this.coleccionRecursos = (HashMap<String, String>) recurso.getColeccionRecurso(); //Retorna coleccion de recursos
        this.nombreRecurso = this.Vista.getNombreRecurso();
        
        this.modelo = modelo;
        this.Vista = Vista;
        
        this.Vista.addeliminarUsuarioListener(new ControladorEliminarRecurso.CalculateListener());
        
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
    }
    
    class CalculateListener implements ActionListener{
         
         String nombreR; // nombreR

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("ELIMINAR")){
                nombreR = nombreRecurso.getText();
                coleccionRecursos.remove(nombreR);
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
