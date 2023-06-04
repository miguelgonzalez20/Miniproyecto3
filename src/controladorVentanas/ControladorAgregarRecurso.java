
package controladorVentanas;

import Vista.AgregarRecurso;
import static controladorVentanas.ControladorVentanaPrincipal.ventana;
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
    private JComboBox<String> tipoUsuario;
    
    private AgregarRecurso Vista;
    private recurso modelo;
    
    //METODO CONSTRUCTOR
    public ControladorAgregarRecurso(recurso modelo, AgregarRecurso Vista){
        this.modelo = modelo;
        this.Vista = Vista;
        

        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
        

        this.nombreAutor = this.Vista.getNombreAutor();
        this.nombreRecurso = this.Vista.getNombreRecurso();
        this.tipoUsuario = this.Vista.getTipoRecurso();
        
        this.coleccionRecursos = (HashMap<String, String>) recurso.getColeccionRecurso();
        
        
       
        this.Vista.addbotonFinalizarListener(new CalculateListener());
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
                modelo.agregarItem(nombreR);
                
                tipoR = (String) tipoUsuario.getSelectedItem();
                palabra = nombreA + " " + tipoR;
                coleccionRecursos.put(nombreR, palabra);
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
