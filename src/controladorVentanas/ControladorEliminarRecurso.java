
package controladorVentanas;

import Vista.EliminarRecurso;
import static controladorVentanas.ControladorVentanaPrincipal.ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JTextField;
import modelo.recurso;

public class ControladorEliminarRecurso {
    
    private HashMap<String, String> coleccionRecursos;

    private JTextField nombreRecurso;
    private EliminarRecurso Vista;
    private recurso modelo;
    
    public ControladorEliminarRecurso(recurso modelo, EliminarRecurso Vista){
        this.modelo = modelo;
        this.Vista = Vista;

        this.nombreRecurso = this.Vista.getNombreRecurso();
        this.coleccionRecursos = (HashMap<String, String>) recurso.getColeccionRecurso();
        
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
       
        this.Vista.addeliminarUsuarioListener(new ControladorEliminarRecurso.CalculateListener());
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
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        ventana.setVisible(false);
        ventana.dispose();
    }
    
}
