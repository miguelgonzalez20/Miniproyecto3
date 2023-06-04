
package controladorVentanas;

import Vista.AgregarRecurso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import modelo.recurso;

public class ControladorAgregarRecurso {
    
    //ATRIBUTOS
    
    private HashMap<String, String> coleccionRecursos;
    
    private JTextField nombreAutor;
    private JTextField nombreRecurso;
    private JComboBox<String> tipoRecurso;

    private static AgregarRecurso Vista;
    private recurso modelo;
    
    //METODO CONSTRUCTOR
    public ControladorAgregarRecurso(recurso modelo, AgregarRecurso Vista){
        this.modelo = modelo;
        this.Vista = Vista;

        this.nombreAutor = this.Vista.getNombreAutor();
        this.nombreRecurso = this.Vista.getNombreRecurso();
        
        this.tipoRecurso = this.Vista.getTipoRecurso();
        
        this.coleccionRecursos = (HashMap<String, String>) recurso.getColeccionRecurso();
       
        this.Vista.addbotonFinalizarListener(new CalculateListener());
        
        
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
    }
    
    class CalculateListener implements ActionListener{
         String palabra;  // Palabra concatenada
         String nombreA; // nombreAutor
         String tipoR; // Tipo Recurso
         String nombreR; // nombreR

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("AGREGAR")){
                nombreA = nombreAutor.getText();
                nombreR = nombreRecurso.getText();
                tipoR = (String) tipoRecurso.getSelectedItem();
                palabra = nombreA + " " + tipoR;
                coleccionRecursos.put(nombreR, palabra);
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
